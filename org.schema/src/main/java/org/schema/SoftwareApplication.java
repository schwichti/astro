package org.schema;
/**
* A software application.
*/
public class SoftwareApplication extends CreativeWork{
	
	
	/**
	* Features or modules provided by this application (and possibly required by other applications).
	 *
	 * Ranges: URL, Text
	 */
	private String _featureList;
	
	public String getFeatureList() throws ClassCastException{
		return (String) _featureList;
	}
	
	public void setFeatureList(String value) throws ClassCastException{
		_featureList = value;
	}
	/**
	* Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
	 *
	 * Ranges: Text
	 */
	private String _countriesNotSupported;
	
	public String getCountriesNotSupported() throws ClassCastException{
		return (String) _countriesNotSupported;
	}
	
	public void setCountriesNotSupported(String value) throws ClassCastException{
		_countriesNotSupported = value;
	}
	/**
	* Description of what changed in this version.
	 *
	 * Ranges: URL, Text
	 */
	private String _releaseNotes;
	
	public String getReleaseNotes() throws ClassCastException{
		return (String) _releaseNotes;
	}
	
	public void setReleaseNotes(String value) throws ClassCastException{
		_releaseNotes = value;
	}
	/**
	* Software application help.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _softwareHelp;
	
	public CreativeWork getSoftwareHelp() throws ClassCastException{
		return (CreativeWork) _softwareHelp;
	}
	
	public void setSoftwareHelp(CreativeWork value) throws ClassCastException{
		_softwareHelp = value;
	}
	/**
	* The name of the application suite to which the application belongs (e.g. Excel belongs to Office).
	 *
	 * Ranges: Text
	 */
	private String _applicationSuite;
	
	public String getApplicationSuite() throws ClassCastException{
		return (String) _applicationSuite;
	}
	
	public void setApplicationSuite(String value) throws ClassCastException{
		_applicationSuite = value;
	}
	/**
	* A link to a screenshot image of the app.
	 *
	 * Ranges: URL, ImageObject
	 */
	private Object _screenshot;
	
	public <T> T getScreenshot(Class<T> c) throws ClassCastException{
		return (T) _screenshot;
	}
	
	public void setScreenshot(String value) throws ClassCastException{
		_screenshot = value;
	}
	public void setScreenshot(ImageObject value) throws ClassCastException{
		_screenshot = value;
	}
	/**
	* Additional content for a software application.
	 *
	 * Ranges: SoftwareApplication
	 */
	private SoftwareApplication _softwareAddOn;
	
	public SoftwareApplication getSoftwareAddOn() throws ClassCastException{
		return (SoftwareApplication) _softwareAddOn;
	}
	
	public void setSoftwareAddOn(SoftwareApplication value) throws ClassCastException{
		_softwareAddOn = value;
	}
	/**
	* Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi).
	 *
	 * Ranges: Text
	 */
	private String _permissions;
	
	public String getPermissions() throws ClassCastException{
		return (String) _permissions;
	}
	
	public void setPermissions(String value) throws ClassCastException{
		_permissions = value;
	}
	/**
	* Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
	 *
	 * Ranges: Text
	 */
	private String _operatingSystem;
	
	public String getOperatingSystem() throws ClassCastException{
		return (String) _operatingSystem;
	}
	
	public void setOperatingSystem(String value) throws ClassCastException{
		_operatingSystem = value;
	}
	/**
	* Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
	 *
	 * Ranges: Text, URL
	 */
	private String _requirements;
	
	public String getRequirements() throws ClassCastException{
		return (String) _requirements;
	}
	
	public void setRequirements(String value) throws ClassCastException{
		_requirements = value;
	}
	/**
	* Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
	 *
	 * Ranges: Text
	 */
	private String _countriesSupported;
	
	public String getCountriesSupported() throws ClassCastException{
		return (String) _countriesSupported;
	}
	
	public void setCountriesSupported(String value) throws ClassCastException{
		_countriesSupported = value;
	}
	/**
	* Type of software application, e.g. 'Game, Multimedia'.
	 *
	 * Ranges: Text, URL
	 */
	private String _applicationCategory;
	
	public String getApplicationCategory() throws ClassCastException{
		return (String) _applicationCategory;
	}
	
	public void setApplicationCategory(String value) throws ClassCastException{
		_applicationCategory = value;
	}
	/**
	* Minimum memory requirements.
	 *
	 * Ranges: URL, Text
	 */
	private String _memoryRequirements;
	
	public String getMemoryRequirements() throws ClassCastException{
		return (String) _memoryRequirements;
	}
	
	public void setMemoryRequirements(String value) throws ClassCastException{
		_memoryRequirements = value;
	}
	/**
	* Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
	 *
	 * Ranges: Text, URL
	 */
	private String _softwareRequirements;
	
	public String getSoftwareRequirements() throws ClassCastException{
		return (String) _softwareRequirements;
	}
	
	public void setSoftwareRequirements(String value) throws ClassCastException{
		_softwareRequirements = value;
	}
	/**
	* Device required to run the application. Used in cases where a specific make/model is required to run the application.
	 *
	 * Ranges: Text
	 */
	private String _device;
	
	public String getDevice() throws ClassCastException{
		return (String) _device;
	}
	
	public void setDevice(String value) throws ClassCastException{
		_device = value;
	}
	/**
	* Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed.
	 *
	 * Ranges: Text
	 */
	private String _fileSize;
	
	public String getFileSize() throws ClassCastException{
		return (String) _fileSize;
	}
	
	public void setFileSize(String value) throws ClassCastException{
		_fileSize = value;
	}
	/**
	* Storage requirements (free space required).
	 *
	 * Ranges: Text, URL
	 */
	private String _storageRequirements;
	
	public String getStorageRequirements() throws ClassCastException{
		return (String) _storageRequirements;
	}
	
	public void setStorageRequirements(String value) throws ClassCastException{
		_storageRequirements = value;
	}
	/**
	* Version of the software instance.
	 *
	 * Ranges: Text
	 */
	private String _softwareVersion;
	
	public String getSoftwareVersion() throws ClassCastException{
		return (String) _softwareVersion;
	}
	
	public void setSoftwareVersion(String value) throws ClassCastException{
		_softwareVersion = value;
	}
	/**
	* Supporting data for a SoftwareApplication.
	 *
	 * Ranges: DataFeed
	 */
	private DataFeed _supportingData;
	
	public DataFeed getSupportingData() throws ClassCastException{
		return (DataFeed) _supportingData;
	}
	
	public void setSupportingData(DataFeed value) throws ClassCastException{
		_supportingData = value;
	}
	/**
	* Subcategory of the application, e.g. 'Arcade Game'.
	 *
	 * Ranges: Text, URL
	 */
	private String _applicationSubCategory;
	
	public String getApplicationSubCategory() throws ClassCastException{
		return (String) _applicationSubCategory;
	}
	
	public void setApplicationSubCategory(String value) throws ClassCastException{
		_applicationSubCategory = value;
	}
	/**
	* If the file can be downloaded, URL to download the binary.
	 *
	 * Ranges: URL
	 */
	private String _downloadUrl;
	
	public String getDownloadUrl() throws ClassCastException{
		return (String) _downloadUrl;
	}
	
	public void setDownloadUrl(String value) throws ClassCastException{
		_downloadUrl = value;
	}
	/**
	* Processor architecture required to run the application (e.g. IA64).
	 *
	 * Ranges: Text
	 */
	private String _processorRequirements;
	
	public String getProcessorRequirements() throws ClassCastException{
		return (String) _processorRequirements;
	}
	
	public void setProcessorRequirements(String value) throws ClassCastException{
		_processorRequirements = value;
	}
	/**
	* URL at which the app may be installed, if different from the URL of the item.
	 *
	 * Ranges: URL
	 */
	private String _installUrl;
	
	public String getInstallUrl() throws ClassCastException{
		return (String) _installUrl;
	}
	
	public void setInstallUrl(String value) throws ClassCastException{
		_installUrl = value;
	}
	/**
	* Device required to run the application. Used in cases where a specific make/model is required to run the application.
	 *
	 * Ranges: Text
	 */
	private String _availableOnDevice;
	
	public String getAvailableOnDevice() throws ClassCastException{
		return (String) _availableOnDevice;
	}
	
	public void setAvailableOnDevice(String value) throws ClassCastException{
		_availableOnDevice = value;
	}
}
