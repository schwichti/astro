package org.schema;
/**
* A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.
*/
public interface IQuestion extends ICreativeWork{
	
	
	/**
	 * An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site.
	 *
	 */
	
	public Answer getSuggestedAnswer() throws ClassCastException;
	
	public void setSuggestedAnswer(Answer value) throws ClassCastException;
	/**
	 * The number of answers this question has received.
	 *
	 */
	
	public Integer getAnswerCount() throws ClassCastException;
	
	public void setAnswerCount(Integer value) throws ClassCastException;
	/**
	 * The answer that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author.
	 *
	 */
	
	public Answer getAcceptedAnswer() throws ClassCastException;
	
	public void setAcceptedAnswer(Answer value) throws ClassCastException;
	/**
	 * The number of upvotes this question, answer or comment has received from the community.
	 *
	 */
	
	public Integer getUpvoteCount() throws ClassCastException;
	
	public void setUpvoteCount(Integer value) throws ClassCastException;
	/**
	 * The number of downvotes this question, answer or comment has received from the community.
	 *
	 */
	
	public Integer getDownvoteCount() throws ClassCastException;
	
	public void setDownvoteCount(Integer value) throws ClassCastException;
}
