package org.schema;
/**
* The act of generating a comment about a subject.
*/
public class CommentAction extends CommunicateAction{
	
	
	/**
	* A sub property of result. The Comment created or sent as a result of this action.
	 *
	 * Ranges: Comment
	 */
	private Comment _resultComment;
	
	public Comment getResultComment() throws ClassCastException{
		return (Comment) _resultComment;
	}
	
	public void setResultComment(Comment value) throws ClassCastException{
		_resultComment = value;
	}
}
