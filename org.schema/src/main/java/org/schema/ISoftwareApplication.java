package org.schema;
/**
* A software application.
*/
public interface ISoftwareApplication extends ICreativeWork{
	
	
	/**
	 * Features or modules provided by this application (and possibly required by other applications).
	 *
	 */
	
	public String getFeatureList() throws ClassCastException;
	
	public void setFeatureList(String value) throws ClassCastException;
	/**
	 * Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
	 *
	 */
	
	public String getCountriesNotSupported() throws ClassCastException;
	
	public void setCountriesNotSupported(String value) throws ClassCastException;
	/**
	 * Description of what changed in this version.
	 *
	 */
	
	public String getReleaseNotes() throws ClassCastException;
	
	public void setReleaseNotes(String value) throws ClassCastException;
	/**
	 * Software application help.
	 *
	 */
	
	public CreativeWork getSoftwareHelp() throws ClassCastException;
	
	public void setSoftwareHelp(CreativeWork value) throws ClassCastException;
	/**
	 * The name of the application suite to which the application belongs (e.g. Excel belongs to Office).
	 *
	 */
	
	public String getApplicationSuite() throws ClassCastException;
	
	public void setApplicationSuite(String value) throws ClassCastException;
	/**
	 * A link to a screenshot image of the app.
	 *
	 */
	
	public <T> T getScreenshot(Class<T> c) throws ClassCastException;
	
	public void setScreenshot(String value) throws ClassCastException;
	public void setScreenshot(ImageObject value) throws ClassCastException;
	/**
	 * Additional content for a software application.
	 *
	 */
	
	public SoftwareApplication getSoftwareAddOn() throws ClassCastException;
	
	public void setSoftwareAddOn(SoftwareApplication value) throws ClassCastException;
	/**
	 * Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi).
	 *
	 */
	
	public String getPermissions() throws ClassCastException;
	
	public void setPermissions(String value) throws ClassCastException;
	/**
	 * Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
	 *
	 */
	
	public String getOperatingSystem() throws ClassCastException;
	
	public void setOperatingSystem(String value) throws ClassCastException;
	/**
	 * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
	 *
	 */
	
	public String getRequirements() throws ClassCastException;
	
	public void setRequirements(String value) throws ClassCastException;
	/**
	 * Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
	 *
	 */
	
	public String getCountriesSupported() throws ClassCastException;
	
	public void setCountriesSupported(String value) throws ClassCastException;
	/**
	 * Type of software application, e.g. 'Game, Multimedia'.
	 *
	 */
	
	public String getApplicationCategory() throws ClassCastException;
	
	public void setApplicationCategory(String value) throws ClassCastException;
	/**
	 * Minimum memory requirements.
	 *
	 */
	
	public String getMemoryRequirements() throws ClassCastException;
	
	public void setMemoryRequirements(String value) throws ClassCastException;
	/**
	 * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
	 *
	 */
	
	public String getSoftwareRequirements() throws ClassCastException;
	
	public void setSoftwareRequirements(String value) throws ClassCastException;
	/**
	 * Device required to run the application. Used in cases where a specific make/model is required to run the application.
	 *
	 */
	
	public String getDevice() throws ClassCastException;
	
	public void setDevice(String value) throws ClassCastException;
	/**
	 * Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed.
	 *
	 */
	
	public String getFileSize() throws ClassCastException;
	
	public void setFileSize(String value) throws ClassCastException;
	/**
	 * Storage requirements (free space required).
	 *
	 */
	
	public String getStorageRequirements() throws ClassCastException;
	
	public void setStorageRequirements(String value) throws ClassCastException;
	/**
	 * Version of the software instance.
	 *
	 */
	
	public String getSoftwareVersion() throws ClassCastException;
	
	public void setSoftwareVersion(String value) throws ClassCastException;
	/**
	 * Supporting data for a SoftwareApplication.
	 *
	 */
	
	public DataFeed getSupportingData() throws ClassCastException;
	
	public void setSupportingData(DataFeed value) throws ClassCastException;
	/**
	 * Subcategory of the application, e.g. 'Arcade Game'.
	 *
	 */
	
	public String getApplicationSubCategory() throws ClassCastException;
	
	public void setApplicationSubCategory(String value) throws ClassCastException;
	/**
	 * If the file can be downloaded, URL to download the binary.
	 *
	 */
	
	public String getDownloadUrl() throws ClassCastException;
	
	public void setDownloadUrl(String value) throws ClassCastException;
	/**
	 * Processor architecture required to run the application (e.g. IA64).
	 *
	 */
	
	public String getProcessorRequirements() throws ClassCastException;
	
	public void setProcessorRequirements(String value) throws ClassCastException;
	/**
	 * URL at which the app may be installed, if different from the URL of the item.
	 *
	 */
	
	public String getInstallUrl() throws ClassCastException;
	
	public void setInstallUrl(String value) throws ClassCastException;
	/**
	 * Device required to run the application. Used in cases where a specific make/model is required to run the application.
	 *
	 */
	
	public String getAvailableOnDevice() throws ClassCastException;
	
	public void setAvailableOnDevice(String value) throws ClassCastException;
}
