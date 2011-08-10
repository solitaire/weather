package controller;

import event.AbstractEvent;

/**
 * Abstract action class 
 * 
 * @author Anna Stępień
 * @version 10-08-2011
 *
 */
abstract class AbstractAction 
{
	
	/**
	 * Executes action bind to an event
	 * 
	 * @param event
	 */
	public abstract void execute(final AbstractEvent event);

}
