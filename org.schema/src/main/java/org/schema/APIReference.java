package org.schema;
/**
* Reference documentation for application programming interfaces (APIs).
*/
public class APIReference extends TechArticle{
	
	
	/**
	* Indicates whether API is managed or unmanaged.
	 *
	 * Ranges: Text
	 */
	private String _programmingModel;
	
	public String getProgrammingModel() throws ClassCastException{
		return (String) _programmingModel;
	}
	
	public void setProgrammingModel(String value) throws ClassCastException{
		_programmingModel = value;
	}
	/**
	* Associated product/technology version. e.g., .NET Framework 4.5.
	 *
	 * Ranges: Text
	 */
	private String _assemblyVersion;
	
	public String getAssemblyVersion() throws ClassCastException{
		return (String) _assemblyVersion;
	}
	
	public void setAssemblyVersion(String value) throws ClassCastException{
		_assemblyVersion = value;
	}
	/**
	* Library file name e.g., mscorlib.dll, system.web.dll.
	 *
	 * Ranges: Text
	 */
	private String _assembly;
	
	public String getAssembly() throws ClassCastException{
		return (String) _assembly;
	}
	
	public void setAssembly(String value) throws ClassCastException{
		_assembly = value;
	}
	/**
	* Library file name e.g., mscorlib.dll, system.web.dll.
	 *
	 * Ranges: Text
	 */
	private String _executableLibraryName;
	
	public String getExecutableLibraryName() throws ClassCastException{
		return (String) _executableLibraryName;
	}
	
	public void setExecutableLibraryName(String value) throws ClassCastException{
		_executableLibraryName = value;
	}
	/**
	* Type of app development: phone, Metro style, desktop, XBox, etc.
	 *
	 * Ranges: Text
	 */
	private String _targetPlatform;
	
	public String getTargetPlatform() throws ClassCastException{
		return (String) _targetPlatform;
	}
	
	public void setTargetPlatform(String value) throws ClassCastException{
		_targetPlatform = value;
	}
}
