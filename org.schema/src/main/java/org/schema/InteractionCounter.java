package org.schema;
/**
* A summary of how users have interacted with this CreativeWork. In most cases, authors will use a subtype to specify the specific type of interaction.
*/
public class InteractionCounter extends StructuredValue{
	
	
	/**
	* The Action representing the type of interaction. For up votes, +1s, etc. use <a class="localLink" href="http://schema.org/LikeAction">LikeAction</a>. For down votes use <a class="localLink" href="http://schema.org/DislikeAction">DislikeAction</a>. Otherwise, use the most specific Action.
	 *
	 * Ranges: Action
	 */
	private Action _interactionType;
	
	public Action getInteractionType() throws ClassCastException{
		return (Action) _interactionType;
	}
	
	public void setInteractionType(Action value) throws ClassCastException{
		_interactionType = value;
	}
	/**
	* The number of interactions for the CreativeWork using the WebSite or SoftwareApplication.
	 *
	 * Ranges: Integer
	 */
	private Integer _userInteractionCount;
	
	public Integer getUserInteractionCount() throws ClassCastException{
		return (Integer) _userInteractionCount;
	}
	
	public void setUserInteractionCount(Integer value) throws ClassCastException{
		_userInteractionCount = value;
	}
	/**
	* The WebSite or SoftwareApplication where the interactions took place.
	 *
	 * Ranges: SoftwareApplication, WebSite
	 */
	private Object _interactionService;
	
	public <T> T getInteractionService(Class<T> c) throws ClassCastException{
		return (T) _interactionService;
	}
	
	public void setInteractionService(SoftwareApplication value) throws ClassCastException{
		_interactionService = value;
	}
	public void setInteractionService(WebSite value) throws ClassCastException{
		_interactionService = value;
	}
}
