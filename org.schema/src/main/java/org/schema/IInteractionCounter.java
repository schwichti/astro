package org.schema;
/**
* A summary of how users have interacted with this CreativeWork. In most cases, authors will use a subtype to specify the specific type of interaction.
*/
public interface IInteractionCounter extends IStructuredValue{
	
	
	/**
	 * The Action representing the type of interaction. For up votes, +1s, etc. use <a class="localLink" href="http://schema.org/LikeAction">LikeAction</a>. For down votes use <a class="localLink" href="http://schema.org/DislikeAction">DislikeAction</a>. Otherwise, use the most specific Action.
	 *
	 */
	
	public Action getInteractionType() throws ClassCastException;
	
	public void setInteractionType(Action value) throws ClassCastException;
	/**
	 * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication.
	 *
	 */
	
	public Integer getUserInteractionCount() throws ClassCastException;
	
	public void setUserInteractionCount(Integer value) throws ClassCastException;
	/**
	 * The WebSite or SoftwareApplication where the interactions took place.
	 *
	 */
	
	public <T> T getInteractionService(Class<T> c) throws ClassCastException;
	
	public void setInteractionService(SoftwareApplication value) throws ClassCastException;
	public void setInteractionService(WebSite value) throws ClassCastException;
}
