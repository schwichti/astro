package org.schema;
/**
* A description of an educational course which may be offered as distinct instances at which take place at different times or take place at different locations, or be offered through different media or modes of study. An educational course is a sequence of one or more educational events and/or creative works which aims to build knowledge, competence or ability of learners.
*/
public interface ICourse extends ICreativeWork{
	
	
	/**
	 * An offering of the course at a specific time and place or through specific media or mode of study or to a specific section of students.
	 *
	 */
	
	public CourseInstance getHasCourseInstance() throws ClassCastException;
	
	public void setHasCourseInstance(CourseInstance value) throws ClassCastException;
	/**
	 * The identifier for the <a class="localLink" href="http://schema.org/Course">Course</a> used by the course <a class="localLink" href="http://schema.org/provider">provider</a> (e.g. CS101 or 6.001).
	 *
	 */
	
	public String getCourseCode() throws ClassCastException;
	
	public void setCourseCode(String value) throws ClassCastException;
	/**
	 * Requirements for taking the Course. May be completion of another <a class="localLink" href="http://schema.org/Course">Course</a> or a textual description like "permission of instructor". Requirements may be a pre-requisite competency, referenced using <a class="localLink" href="http://schema.org/AlignmentObject">AlignmentObject</a>.
	 *
	 */
	
	public <T> T getCoursePrerequisites(Class<T> c) throws ClassCastException;
	
	public void setCoursePrerequisites(String value) throws ClassCastException;
	public void setCoursePrerequisites(Course value) throws ClassCastException;
	public void setCoursePrerequisites(AlignmentObject value) throws ClassCastException;
}
