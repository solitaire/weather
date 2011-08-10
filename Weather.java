import controller.Controller;
import queue.EventQueue;
import view.View;
import model.Model;


/**
 * Main part of the application
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
public class Weather 
{
	public static void main(String args[])
	{
		final Model model = new Model();
		final View view = new View();
		final EventQueue eventQueue = new EventQueue();
		final Controller controller = new Controller(model, view, eventQueue);
		
		view.display();
		controller.dispatch();
	}

}
