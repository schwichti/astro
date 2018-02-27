package org.schema;
/**
* A listing that describes a job opening in a certain organization.
*/
public class JobPosting extends Intangible{
	
	
	/**
	* The title of the job.
	 *
	 * Ranges: Text
	 */
	private String _title;
	
	public String getTitle() throws ClassCastException{
		return (String) _title;
	}
	
	public void setTitle(String value) throws ClassCastException{
		_title = value;
	}
	/**
	* Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
	 *
	 * Ranges: Text
	 */
	private String _employmentType;
	
	public String getEmploymentType() throws ClassCastException{
		return (String) _employmentType;
	}
	
	public void setEmploymentType(String value) throws ClassCastException{
		_employmentType = value;
	}
	/**
	* Publication date for the job posting.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _datePosted;
	
	public java.util.Date getDatePosted() throws ClassCastException{
		return (java.util.Date) _datePosted;
	}
	
	public void setDatePosted(java.util.Date value) throws ClassCastException{
		_datePosted = value;
	}
	/**
	* Educational background needed for the position.
	 *
	 * Ranges: Text
	 */
	private String _educationRequirements;
	
	public String getEducationRequirements() throws ClassCastException{
		return (String) _educationRequirements;
	}
	
	public void setEducationRequirements(String value) throws ClassCastException{
		_educationRequirements = value;
	}
	/**
	* Skills required to fulfill this role.
	 *
	 * Ranges: Text
	 */
	private String _skills;
	
	public String getSkills() throws ClassCastException{
		return (String) _skills;
	}
	
	public void setSkills(String value) throws ClassCastException{
		_skills = value;
	}
	/**
	* Responsibilities associated with this role.
	 *
	 * Ranges: Text
	 */
	private String _responsibilities;
	
	public String getResponsibilities() throws ClassCastException{
		return (String) _responsibilities;
	}
	
	public void setResponsibilities(String value) throws ClassCastException{
		_responsibilities = value;
	}
	/**
	* A (typically single) geographic location associated with the job position.
	 *
	 * Ranges: Place
	 */
	private Place _jobLocation;
	
	public Place getJobLocation() throws ClassCastException{
		return (Place) _jobLocation;
	}
	
	public void setJobLocation(Place value) throws ClassCastException{
		_jobLocation = value;
	}
	/**
	* Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
	 *
	 * Ranges: Text
	 */
	private String _specialCommitments;
	
	public String getSpecialCommitments() throws ClassCastException{
		return (String) _specialCommitments;
	}
	
	public void setSpecialCommitments(String value) throws ClassCastException{
		_specialCommitments = value;
	}
	/**
	* Description of benefits associated with the job.
	 *
	 * Ranges: Text
	 */
	private String _benefits;
	
	public String getBenefits() throws ClassCastException{
		return (String) _benefits;
	}
	
	public void setBenefits(String value) throws ClassCastException{
		_benefits = value;
	}
	/**
	* Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.
	 *
	 * Ranges: Text
	 */
	private String _occupationalCategory;
	
	public String getOccupationalCategory() throws ClassCastException{
		return (String) _occupationalCategory;
	}
	
	public void setOccupationalCategory(String value) throws ClassCastException{
		_occupationalCategory = value;
	}
	/**
	* The industry associated with the job position.
	 *
	 * Ranges: Text
	 */
	private String _industry;
	
	public String getIndustry() throws ClassCastException{
		return (String) _industry;
	}
	
	public void setIndustry(String value) throws ClassCastException{
		_industry = value;
	}
	/**
	* Organization offering the job position.
	 *
	 * Ranges: Organization
	 */
	private Organization _hiringOrganization;
	
	public Organization getHiringOrganization() throws ClassCastException{
		return (Organization) _hiringOrganization;
	}
	
	public void setHiringOrganization(Organization value) throws ClassCastException{
		_hiringOrganization = value;
	}
	/**
	* The currency (coded using <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> ) used for the main salary information in this job posting or for this employee.
	 *
	 * Ranges: Text
	 */
	private String _salaryCurrency;
	
	public String getSalaryCurrency() throws ClassCastException{
		return (String) _salaryCurrency;
	}
	
	public void setSalaryCurrency(String value) throws ClassCastException{
		_salaryCurrency = value;
	}
	/**
	* Specific qualifications required for this role.
	 *
	 * Ranges: Text
	 */
	private String _qualifications;
	
	public String getQualifications() throws ClassCastException{
		return (String) _qualifications;
	}
	
	public void setQualifications(String value) throws ClassCastException{
		_qualifications = value;
	}
	/**
	* The base salary of the job or of an employee in an EmployeeRole.
	 *
	 * Ranges: PriceSpecification, Number, MonetaryAmount
	 */
	private Object _baseSalary;
	
	public <T> T getBaseSalary(Class<T> c) throws ClassCastException{
		return (T) _baseSalary;
	}
	
	public void setBaseSalary(PriceSpecification value) throws ClassCastException{
		_baseSalary = value;
	}
	public void setBaseSalary(Float value) throws ClassCastException{
		_baseSalary = value;
	}
	public void setBaseSalary(MonetaryAmount value) throws ClassCastException{
		_baseSalary = value;
	}
	/**
	* Description of bonus and commission compensation aspects of the job.
	 *
	 * Ranges: Text
	 */
	private String _incentiveCompensation;
	
	public String getIncentiveCompensation() throws ClassCastException{
		return (String) _incentiveCompensation;
	}
	
	public void setIncentiveCompensation(String value) throws ClassCastException{
		_incentiveCompensation = value;
	}
	/**
	* The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _validThrough;
	
	public java.util.Date getValidThrough() throws ClassCastException{
		return (java.util.Date) _validThrough;
	}
	
	public void setValidThrough(java.util.Date value) throws ClassCastException{
		_validThrough = value;
	}
	/**
	* Description of bonus and commission compensation aspects of the job.
	 *
	 * Ranges: Text
	 */
	private String _incentives;
	
	public String getIncentives() throws ClassCastException{
		return (String) _incentives;
	}
	
	public void setIncentives(String value) throws ClassCastException{
		_incentives = value;
	}
	/**
	* Description of benefits associated with the job.
	 *
	 * Ranges: Text
	 */
	private String _jobBenefits;
	
	public String getJobBenefits() throws ClassCastException{
		return (String) _jobBenefits;
	}
	
	public void setJobBenefits(String value) throws ClassCastException{
		_jobBenefits = value;
	}
	/**
	* The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
	 *
	 * Ranges: Text
	 */
	private String _workHours;
	
	public String getWorkHours() throws ClassCastException{
		return (String) _workHours;
	}
	
	public void setWorkHours(String value) throws ClassCastException{
		_workHours = value;
	}
	/**
	* Description of skills and experience needed for the position.
	 *
	 * Ranges: Text
	 */
	private String _experienceRequirements;
	
	public String getExperienceRequirements() throws ClassCastException{
		return (String) _experienceRequirements;
	}
	
	public void setExperienceRequirements(String value) throws ClassCastException{
		_experienceRequirements = value;
	}
}
