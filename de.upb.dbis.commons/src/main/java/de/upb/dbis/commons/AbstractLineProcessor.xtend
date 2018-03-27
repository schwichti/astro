package de.upb.dbis.commons

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

abstract class AbstractLineProcessor implements ILineProcessor{

	private BufferedReader bufferedReader;
	
	
	
	new(File file){
		bufferedReader = new BufferedReader(new FileReader(file));
	}
	
	new(InputStream inputStream){
		bufferedReader = new BufferedReader(new InputStreamReader(inputStream));		
	}
	

	override init() {


		try {

			var sCurrentLine = "";

			
			

			while ((sCurrentLine = bufferedReader.readLine()) != null) {
				readLine(sCurrentLine);
			}
			
			finish();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	override abstract void readLine(String line);
	override abstract void finish();

}
