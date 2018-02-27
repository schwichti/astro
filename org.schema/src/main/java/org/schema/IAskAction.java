package org.schema;
/**
* <p>The act of posing a question / favor to someone.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/ReplyAction">ReplyAction</a>: Appears generally as a response to AskAction.</li>
</ul>
*/
public interface IAskAction extends ICommunicateAction{
	
	
	/**
	 * A sub property of object. A question.
	 *
	 */
	
	public Question getQuestion() throws ClassCastException;
	
	public void setQuestion(Question value) throws ClassCastException;
}
