package org.schema;
/**
* An instance of a <a class="localLink" href="http://schema.org/Course">Course</a> which is distinct from other instances because it is offered at a different time or location or through different media or modes of study or to a specific section of students.
*/
public interface ICourseInstance extends IEvent{
	
	
	/**
	 * A person assigned to instruct or provide instructional assistance for the <a class="localLink" href="http://schema.org/CourseInstance">CourseInstance</a>.
	 *
	 */
	
	public Person getInstructor() throws ClassCastException;
	
	public void setInstructor(Person value) throws ClassCastException;
	/**
	 * The medium or means of delivery of the course instance or the mode of study, either as a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or as a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
	 *
	 */
	
	public String getCourseMode() throws ClassCastException;
	
	public void setCourseMode(String value) throws ClassCastException;
}
