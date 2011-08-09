package controller;

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
	private final Model model;
	private final View view;
	private final EventQueue eventQueue;
	
	public Controller(Model model, View view, EventQueue eventQueue)
	{
		this.model = model;
		this.view = view;
		this.eventQueue = eventQueue;
	}

}
