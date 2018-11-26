package logic

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl
import org.eclipse.emf.henshin.interpreter.impl.LoggingApplicationMonitor
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl
import org.eclipse.emf.henshin.model.Rule
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet

class HenshinWrapper {
	
	
	def void transform(File sourceModel, File henshinModel){

			
//		var reg = Resource.Factory.Registry.INSTANCE;
//        var m = reg.getExtensionToFactoryMap();
//        m.put("pnml", new PetriNetResourceFactoryImpl());

		
		var resourceSet = new HenshinResourceSet(sourceModel.parent);
		var model = resourceSet.getResource(sourceModel.name);
		
		var engine = new EngineImpl();
		var graph = new EGraphImpl(model);
		
		var module = resourceSet.getModule(henshinModel.name);
		
		
		var unit = module.getUnit("PetriNet2CompositeProcess") as Rule;
		
		
		//var application = new UnitApplicationImpl(engine, graph, unit, null);
		var application = new RuleApplicationImpl(engine, graph, unit, null);
		
		application.execute(new LoggingApplicationMonitor());
		
		
		System.out.println(model);
		
		//model.save(null);
	}
}