package org.schema;
/**
* Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
*/
public interface ISoftwareSourceCode extends ICreativeWork{
	
	
	/**
	 * Link to the repository where the un-compiled, human readable code and related code is located (SVN, github, CodePlex).
	 *
	 */
	
	public String getCodeRepository() throws ClassCastException;
	
	public void setCodeRepository(String value) throws ClassCastException;
	/**
	 * Target Operating System / Product to which the code applies.  If applies to several versions, just the product name can be used.
	 *
	 */
	
	public SoftwareApplication getTargetProduct() throws ClassCastException;
	
	public void setTargetProduct(SoftwareApplication value) throws ClassCastException;
	/**
	 * What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.
	 *
	 */
	
	public String getCodeSampleType() throws ClassCastException;
	
	public void setCodeSampleType(String value) throws ClassCastException;
	/**
	 * The computer programming language.
	 *
	 */
	
	public <T> T getProgrammingLanguage(Class<T> c) throws ClassCastException;
	
	public void setProgrammingLanguage(String value) throws ClassCastException;
	public void setProgrammingLanguage(ComputerLanguage value) throws ClassCastException;
	/**
	 * Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0).
	 *
	 */
	
	public String getRuntime() throws ClassCastException;
	
	public void setRuntime(String value) throws ClassCastException;
	/**
	 * Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0).
	 *
	 */
	
	public String getRuntimePlatform() throws ClassCastException;
	
	public void setRuntimePlatform(String value) throws ClassCastException;
	/**
	 * What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.
	 *
	 */
	
	public String getSampleType() throws ClassCastException;
	
	public void setSampleType(String value) throws ClassCastException;
}
