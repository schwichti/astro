package logic

import java.io.File

class PromWrapper {
	
	public def void minePetriNet(){
		
		
		var pb = new ProcessBuilder("cmd", "/C", "prom.bat", "-f", "prom.cli.alphaminer.txt");
		//var pb = new ProcessBuilder("cmd", "/C", "prom.bat", "-l");
		var dir = new File("./scripts");
		pb.directory(dir);
		//pb.redirectOutput(Redirect.INHERIT);
		//pb.redirectError(Redirect.INHERIT);
		var p = pb.start();
		p.waitFor();
		
		p.destroy();
		
	}
	
}