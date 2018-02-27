package org.schema;
/**
* <p>The act of responding to a question/message asked/sent by the object. Related to <a class="localLink" href="http://schema.org/AskAction">AskAction</a></p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/AskAction">AskAction</a>: Appears generally as an origin of a ReplyAction.</li>
</ul>
*/
public interface IReplyAction extends ICommunicateAction{
	
	
	/**
	 * A sub property of result. The Comment created or sent as a result of this action.
	 *
	 */
	
	public Comment getResultComment() throws ClassCastException;
	
	public void setResultComment(Comment value) throws ClassCastException;
}
