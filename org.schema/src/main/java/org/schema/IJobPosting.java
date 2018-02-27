package org.schema;
/**
* A listing that describes a job opening in a certain organization.
*/
public interface IJobPosting extends IIntangible{
	
	
	/**
	 * The title of the job.
	 *
	 */
	
	public String getTitle() throws ClassCastException;
	
	public void setTitle(String value) throws ClassCastException;
	/**
	 * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
	 *
	 */
	
	public String getEmploymentType() throws ClassCastException;
	
	public void setEmploymentType(String value) throws ClassCastException;
	/**
	 * Publication date for the job posting.
	 *
	 */
	
	public java.util.Date getDatePosted() throws ClassCastException;
	
	public void setDatePosted(java.util.Date value) throws ClassCastException;
	/**
	 * Educational background needed for the position.
	 *
	 */
	
	public String getEducationRequirements() throws ClassCastException;
	
	public void setEducationRequirements(String value) throws ClassCastException;
	/**
	 * Skills required to fulfill this role.
	 *
	 */
	
	public String getSkills() throws ClassCastException;
	
	public void setSkills(String value) throws ClassCastException;
	/**
	 * Responsibilities associated with this role.
	 *
	 */
	
	public String getResponsibilities() throws ClassCastException;
	
	public void setResponsibilities(String value) throws ClassCastException;
	/**
	 * A (typically single) geographic location associated with the job position.
	 *
	 */
	
	public Place getJobLocation() throws ClassCastException;
	
	public void setJobLocation(Place value) throws ClassCastException;
	/**
	 * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
	 *
	 */
	
	public String getSpecialCommitments() throws ClassCastException;
	
	public void setSpecialCommitments(String value) throws ClassCastException;
	/**
	 * Description of benefits associated with the job.
	 *
	 */
	
	public String getBenefits() throws ClassCastException;
	
	public void setBenefits(String value) throws ClassCastException;
	/**
	 * Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.
	 *
	 */
	
	public String getOccupationalCategory() throws ClassCastException;
	
	public void setOccupationalCategory(String value) throws ClassCastException;
	/**
	 * The industry associated with the job position.
	 *
	 */
	
	public String getIndustry() throws ClassCastException;
	
	public void setIndustry(String value) throws ClassCastException;
	/**
	 * Organization offering the job position.
	 *
	 */
	
	public Organization getHiringOrganization() throws ClassCastException;
	
	public void setHiringOrganization(Organization value) throws ClassCastException;
	/**
	 * The currency (coded using <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> ) used for the main salary information in this job posting or for this employee.
	 *
	 */
	
	public String getSalaryCurrency() throws ClassCastException;
	
	public void setSalaryCurrency(String value) throws ClassCastException;
	/**
	 * Specific qualifications required for this role.
	 *
	 */
	
	public String getQualifications() throws ClassCastException;
	
	public void setQualifications(String value) throws ClassCastException;
	/**
	 * The base salary of the job or of an employee in an EmployeeRole.
	 *
	 */
	
	public <T> T getBaseSalary(Class<T> c) throws ClassCastException;
	
	public void setBaseSalary(PriceSpecification value) throws ClassCastException;
	public void setBaseSalary(Float value) throws ClassCastException;
	public void setBaseSalary(MonetaryAmount value) throws ClassCastException;
	/**
	 * Description of bonus and commission compensation aspects of the job.
	 *
	 */
	
	public String getIncentiveCompensation() throws ClassCastException;
	
	public void setIncentiveCompensation(String value) throws ClassCastException;
	/**
	 * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 */
	
	public java.util.Date getValidThrough() throws ClassCastException;
	
	public void setValidThrough(java.util.Date value) throws ClassCastException;
	/**
	 * Description of bonus and commission compensation aspects of the job.
	 *
	 */
	
	public String getIncentives() throws ClassCastException;
	
	public void setIncentives(String value) throws ClassCastException;
	/**
	 * Description of benefits associated with the job.
	 *
	 */
	
	public String getJobBenefits() throws ClassCastException;
	
	public void setJobBenefits(String value) throws ClassCastException;
	/**
	 * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
	 *
	 */
	
	public String getWorkHours() throws ClassCastException;
	
	public void setWorkHours(String value) throws ClassCastException;
	/**
	 * Description of skills and experience needed for the position.
	 *
	 */
	
	public String getExperienceRequirements() throws ClassCastException;
	
	public void setExperienceRequirements(String value) throws ClassCastException;
}
