package org.schema;
/**
* An educational organization.
*/
public class EducationalOrganization extends Organization{
	
	
	/**
	* Alumni of an organization.
	 *
	 * Ranges: Person
	 */
	private Person _alumni;
	
	public Person getAlumni() throws ClassCastException{
		return (Person) _alumni;
	}
	
	public void setAlumni(Person value) throws ClassCastException{
		_alumni = value;
	}
}
