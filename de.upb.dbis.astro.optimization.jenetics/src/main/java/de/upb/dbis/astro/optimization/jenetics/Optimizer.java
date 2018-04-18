package de.upb.dbis.astro.optimization.jenetics;

import java.util.ArrayList;
import java.util.HashMap;

import de.upb.dbis.astro.QueryDelegator;
import de.upb.dbis.astro.evaluation.Evaluation;
import io.jenetics.Genotype;
import io.jenetics.IntegerChromosome;
import io.jenetics.IntegerGene;
import io.jenetics.engine.Engine;
import io.jenetics.engine.EvolutionResult;
import io.jenetics.util.Factory;

public class Optimizer {
	
	private final static ArrayList<String> keys = new ArrayList<String>(QueryDelegator.defaultWeights.keySet());
	
	
    // 2.) Definition of the fitness function.
    private static double eval(Genotype<IntegerGene> gt) {
        
    	//gt.getChromosome().as(IntegerChromosome.class).iterator();

		HashMap<String, Float> weights = new HashMap<String, Float>();
    	int i = 0;

//    	for(java.util.Iterator<Chromosome<IntegerGene>> iter = gt.iterator();iter.hasNext();) {
//    		
//    		Chromosome<IntegerGene> chromosome = iter.next();
//    		
//    		chromosome.getGene()
//    		
//    	}
    	
    	for(java.util.Iterator<IntegerGene> iter = gt.getChromosome().as(IntegerChromosome.class).iterator();iter.hasNext();) {
    		
    		IntegerGene gene = iter.next();
    		
    		float component = gene.floatValue();
    		
    		String key = keys.get(i++);
    		
    		weights.put(key, component);
    		
    		
    	}
            
		String path_global_ontology = "C:/Users/Simon/Data/git2/dissertation/implementation/de.upb.is.schemaorg.owl/data/schema.owl.nt";
        String path_testcollection = "C:/Users/Simon/Data/git2/dissertation/implementation/de.upb.is.sme2/testcollections/unnormalized/htdocs/";
			
		double score = new Evaluation(path_global_ontology,path_testcollection, weights).run();
		
		return score;
    }
	
	public static void main(String[] args) {
        // 1.) Define the genotype (factory) suitable
        //     for the problem.
        Factory<Genotype<IntegerGene>> gtf =
            Genotype.of(IntegerChromosome.of(0, 11, 18));
 
        // 3.) Create the execution environment.
        Engine<IntegerGene, Double> engine = Engine
            .builder(Optimizer::eval, gtf)
            .build();
 
        // 4.) Start the execution (evolution) and
        //     collect the result.
        Genotype<IntegerGene> result = engine.stream()
            .limit(3)
            .collect(EvolutionResult.toBestGenotype());
 
        System.out.println(keys);
        System.out.println(result);
	}
}
