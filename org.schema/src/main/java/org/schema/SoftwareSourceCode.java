package org.schema;
/**
* Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
*/
public class SoftwareSourceCode extends CreativeWork{
	
	
	/**
	* Link to the repository where the un-compiled, human readable code and related code is located (SVN, github, CodePlex).
	 *
	 * Ranges: URL
	 */
	private String _codeRepository;
	
	public String getCodeRepository() throws ClassCastException{
		return (String) _codeRepository;
	}
	
	public void setCodeRepository(String value) throws ClassCastException{
		_codeRepository = value;
	}
	/**
	* Target Operating System / Product to which the code applies.  If applies to several versions, just the product name can be used.
	 *
	 * Ranges: SoftwareApplication
	 */
	private SoftwareApplication _targetProduct;
	
	public SoftwareApplication getTargetProduct() throws ClassCastException{
		return (SoftwareApplication) _targetProduct;
	}
	
	public void setTargetProduct(SoftwareApplication value) throws ClassCastException{
		_targetProduct = value;
	}
	/**
	* What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.
	 *
	 * Ranges: Text
	 */
	private String _codeSampleType;
	
	public String getCodeSampleType() throws ClassCastException{
		return (String) _codeSampleType;
	}
	
	public void setCodeSampleType(String value) throws ClassCastException{
		_codeSampleType = value;
	}
	/**
	* The computer programming language.
	 *
	 * Ranges: Text, ComputerLanguage
	 */
	private Object _programmingLanguage;
	
	public <T> T getProgrammingLanguage(Class<T> c) throws ClassCastException{
		return (T) _programmingLanguage;
	}
	
	public void setProgrammingLanguage(String value) throws ClassCastException{
		_programmingLanguage = value;
	}
	public void setProgrammingLanguage(ComputerLanguage value) throws ClassCastException{
		_programmingLanguage = value;
	}
	/**
	* Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0).
	 *
	 * Ranges: Text
	 */
	private String _runtime;
	
	public String getRuntime() throws ClassCastException{
		return (String) _runtime;
	}
	
	public void setRuntime(String value) throws ClassCastException{
		_runtime = value;
	}
	/**
	* Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0).
	 *
	 * Ranges: Text
	 */
	private String _runtimePlatform;
	
	public String getRuntimePlatform() throws ClassCastException{
		return (String) _runtimePlatform;
	}
	
	public void setRuntimePlatform(String value) throws ClassCastException{
		_runtimePlatform = value;
	}
	/**
	* What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.
	 *
	 * Ranges: Text
	 */
	private String _sampleType;
	
	public String getSampleType() throws ClassCastException{
		return (String) _sampleType;
	}
	
	public void setSampleType(String value) throws ClassCastException{
		_sampleType = value;
	}
}
