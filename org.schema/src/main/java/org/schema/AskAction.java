package org.schema;
/**
* <p>The act of posing a question / favor to someone.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/ReplyAction">ReplyAction</a>: Appears generally as a response to AskAction.</li>
</ul>
*/
public class AskAction extends CommunicateAction{
	
	
	/**
	* A sub property of object. A question.
	 *
	 * Ranges: Question
	 */
	private Question _question;
	
	public Question getQuestion() throws ClassCastException{
		return (Question) _question;
	}
	
	public void setQuestion(Question value) throws ClassCastException{
		_question = value;
	}
}
