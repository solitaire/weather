package controller;

import event.AbstractEvent;
import queue.EventQueue;
import view.View;
import model.Model;

/**
 * Controller of the application
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 */
public class Controller
{
	/** Model */
	private final Model model;
	/** View */
	private final View view;
	/** Event queue */
	private final EventQueue eventQueue;
	
	/**
	 * Creates new Controller object
	 * 
	 * @param model
	 * @param view
	 * @param eventQueue
	 */
	public Controller(final Model model, final View view, final EventQueue eventQueue)
	{
		this.model = model;
		this.view = view;
		this.eventQueue = eventQueue;
	}

	
	/**
	 *  Takes one event from the event queue and calls action connected to it
	 */
	public void dispatch() 
	{
		
	}

}
