import controller.Controller;
import queue.EventQueue;
import view.View;
import model.Model;


/**
 * 
 * @author Anna Stępień
 * @version 2011-08-16
 */
public class Weather 
{
	public static void main(String args[])
	{
		final EventQueue eventQueue = new EventQueue();
		final Model model = new Model();
		final View view = new View(eventQueue);
		final Controller controller = new Controller(model, view, eventQueue);
		
		view.display();
		controller.dispatch();
	}

}
