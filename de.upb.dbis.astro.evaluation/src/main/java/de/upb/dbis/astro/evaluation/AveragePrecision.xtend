package de.upb.dbis.astro.evaluation

import de.upb.dbis.astro.Alignment
import de.upb.dbis.astro.ReferenceAlignment
import de.upb.dbis.astro.Triple
import java.util.ArrayList
import java.util.HashSet
import java.util.List

class AveragePrecision {


	private List<Wrapper> wrapper = new ArrayList<Wrapper>();
	
	private String servicename = null;
	private Alignment actualAlignment = null;
	private ReferenceAlignment referenceAlignment = null;
	
	
	public def setReferenceAlignment(ReferenceAlignment ra){
		
		this.referenceAlignment = ra;
	}
	
	public def setActualAlignment(Alignment a){
		
		this.actualAlignment = a;
	}
	
	public def setServicename(String sn){
		
		this.servicename = sn;
	}
	
	public def printTop(int k){
		
		for(var i=0;i<wrapper.length && i<k;i++){
			
			var item = wrapper.get(i);
			System.out.println('''«item.servicename»;«item.mappings»;«item.mrr»''');
		}
		
//		Collections.sort(wrapper, new Comparator<Wrapper>(){
//			override compare(Wrapper arg0, Wrapper arg1) {
//				if(arg0.mappings==arg1.mappings){
//					return 0;
//				}
//				else if(arg0.weight>arg1.weight){
//					return 1;
//				}
//				else{
//					return -1;
//				}
//			}
//		});
//		
//		var i = 1;
//		for(var iterator=mostMappings.descendingKeySet.iterator; iterator.hasNext && i<=k;){
//			
//			var next = iterator.next;
//			
//			System.out.println('''«i++»;«next»;«mostMappings.get(next)»;«name2mrr.get(mostMappings.get(next))»''');
//			
//		}
	}
	
	
	public def double averagePrecision2(){
		
		var ap = 0d;
		var relevant = 0d;
		
		for(String uri: referenceAlignment.keySet){
			
			//AP = Sum^{n}_{k=1} (P(k)*rel(k))/#relevant 
			var correctTriple = referenceAlignment.get(uri);
			
			if(correctTriple!=null){
				
				var ranksAscending = actualAlignment.flatten(uri);
				relevant++;
				var correct = 0d;
				//var sum = 0d;
				var rank = 0d;
				
				System.out.println('''«uri»''');
				for(var i=ranksAscending.size-1;i>=0;i--){
					
					rank++;
					
					var actualTriple = ranksAscending.get(i);
					var rel = 0;				
					if(correctTriple!=null && correctTriple.equals(actualTriple)){
						correct++;
						rel=1;
						//System.out.println('''found at rank «rank»''');
					}
					else{
						rel=0;
					}
					
					var precision_at_k = correct as double / rank as double;
					ap += precision_at_k * rel;
					
				}
				
				if(correct==0d){
					//System.out.println('''not found «uri» => «correctTriple»''');
				}
				//ap += sum;
			}				
			
		}
		
		if(relevant>0){
			
			var x = new Wrapper();
			x.servicename = servicename;
			x.mappings = relevant;
			x.mrr = ap/relevant;
			
			
			wrapper.add(x);
		}
		
		
		System.out.println('''mean average precision per service: «ap/relevant»''');
		
		return ap;
		
	}	

	public static def double averagePrecision(ReferenceAlignment referenceAlignment, Alignment actualAlignment){
		
		var ap = 0d;
		var relevant = 0d;
		
		for(String uri: referenceAlignment.keySet){
			
			//AP = Sum^{n}_{k=1} (P(k)*rel(k))/#relevant 
			var correctTriple = referenceAlignment.get(uri);
			
			if(correctTriple!=null){
				
				var ranksAscending = actualAlignment.flatten(uri);
				relevant++;
				var correct = 0d;
				//var sum = 0d;
				var rank = 0d;
				
				System.out.println('''«uri»''');
				for(var i=ranksAscending.size-1;i>=0;i--){
					
					rank++;
					
					var actualTriple = ranksAscending.get(i);
					var rel = 0;				
					if(correctTriple!=null && correctTriple.equals(actualTriple)){
						correct++;
						rel=1;
						//System.out.println('''found at rank «rank»''');
					}
					else{
						rel=0;
					}
					
					var precision_at_k = correct as double / rank as double;
					ap += precision_at_k * rel;
					
				}
				
				if(correct==0d){
					//System.out.println('''not found «uri» => «correctTriple»''');
				}
				//ap += sum;
			}				
			
		}
		System.out.println('''mean average precision per service: «ap/relevant»''');
		
		return ap;
		
	}
	
	
	public static def double meanAveragePrecision(Alignment referenceAlignment, Alignment actualAlignment){
		
		var mean = 0d;
		
		for(String uri: referenceAlignment.keySet){
			
			//AP = Sum^{n}_{k=1} (P(k)*rel(k))/#relevant 
			var correctTriples = new HashSet<Triple>(referenceAlignment.flatten(uri));
			var ranksAscending = actualAlignment.flatten(uri);
			
			var correct = 0d;
			var sum = 0d;
			for(var i=ranksAscending.size-1;i>=0;i--){
				
				var actualTriple = ranksAscending.get(i);
				var rel = 0;				
				if(correctTriples.contains(actualTriple)){
					correct++;
					rel=1;
				}
				else{
					rel=0;
				}
				
				var precision_at_k = correct as double / i as double;
				sum += precision_at_k*rel;
				
			}
			mean += sum;
			
		}
		
		return mean / referenceAlignment.size as double;
		
	}
}
