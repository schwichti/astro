package org.schema;
/**
* The act of generating a comment about a subject.
*/
public interface ICommentAction extends ICommunicateAction{
	
	
	/**
	 * A sub property of result. The Comment created or sent as a result of this action.
	 *
	 */
	
	public Comment getResultComment() throws ClassCastException;
	
	public void setResultComment(Comment value) throws ClassCastException;
}
