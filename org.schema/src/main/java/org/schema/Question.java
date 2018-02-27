package org.schema;
/**
* A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.
*/
public class Question extends CreativeWork{
	
	
	/**
	* An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site.
	 *
	 * Ranges: Answer
	 */
	private Answer _suggestedAnswer;
	
	public Answer getSuggestedAnswer() throws ClassCastException{
		return (Answer) _suggestedAnswer;
	}
	
	public void setSuggestedAnswer(Answer value) throws ClassCastException{
		_suggestedAnswer = value;
	}
	/**
	* The number of answers this question has received.
	 *
	 * Ranges: Integer
	 */
	private Integer _answerCount;
	
	public Integer getAnswerCount() throws ClassCastException{
		return (Integer) _answerCount;
	}
	
	public void setAnswerCount(Integer value) throws ClassCastException{
		_answerCount = value;
	}
	/**
	* The answer that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author.
	 *
	 * Ranges: Answer
	 */
	private Answer _acceptedAnswer;
	
	public Answer getAcceptedAnswer() throws ClassCastException{
		return (Answer) _acceptedAnswer;
	}
	
	public void setAcceptedAnswer(Answer value) throws ClassCastException{
		_acceptedAnswer = value;
	}
	/**
	* The number of upvotes this question, answer or comment has received from the community.
	 *
	 * Ranges: Integer
	 */
	private Integer _upvoteCount;
	
	public Integer getUpvoteCount() throws ClassCastException{
		return (Integer) _upvoteCount;
	}
	
	public void setUpvoteCount(Integer value) throws ClassCastException{
		_upvoteCount = value;
	}
	/**
	* The number of downvotes this question, answer or comment has received from the community.
	 *
	 * Ranges: Integer
	 */
	private Integer _downvoteCount;
	
	public Integer getDownvoteCount() throws ClassCastException{
		return (Integer) _downvoteCount;
	}
	
	public void setDownvoteCount(Integer value) throws ClassCastException{
		_downvoteCount = value;
	}
}
