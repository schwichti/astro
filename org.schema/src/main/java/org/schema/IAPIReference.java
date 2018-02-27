package org.schema;
/**
* Reference documentation for application programming interfaces (APIs).
*/
public interface IAPIReference extends ITechArticle{
	
	
	/**
	 * Indicates whether API is managed or unmanaged.
	 *
	 */
	
	public String getProgrammingModel() throws ClassCastException;
	
	public void setProgrammingModel(String value) throws ClassCastException;
	/**
	 * Associated product/technology version. e.g., .NET Framework 4.5.
	 *
	 */
	
	public String getAssemblyVersion() throws ClassCastException;
	
	public void setAssemblyVersion(String value) throws ClassCastException;
	/**
	 * Library file name e.g., mscorlib.dll, system.web.dll.
	 *
	 */
	
	public String getAssembly() throws ClassCastException;
	
	public void setAssembly(String value) throws ClassCastException;
	/**
	 * Library file name e.g., mscorlib.dll, system.web.dll.
	 *
	 */
	
	public String getExecutableLibraryName() throws ClassCastException;
	
	public void setExecutableLibraryName(String value) throws ClassCastException;
	/**
	 * Type of app development: phone, Metro style, desktop, XBox, etc.
	 *
	 */
	
	public String getTargetPlatform() throws ClassCastException;
	
	public void setTargetPlatform(String value) throws ClassCastException;
}
