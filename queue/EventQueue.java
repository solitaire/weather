package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import event.AbstractEvent;

/**
 * Thread-safe wrapper for Java's blocking queue
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
public class EventQueue 
{
	 /** Event queue */
	private final BlockingQueue<AbstractEvent> eventQueue;
	
	
	/**
	 * Default constructor
	 */
	public EventQueue()
	{
		eventQueue = new LinkedBlockingQueue<AbstractEvent>();
	}
	
	/**
	 * Puts an event into the event queue
	 * 
	 * @param event
	 */
	public void put(AbstractEvent event)
	{
		try 
		{
			eventQueue.put(event);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Takes an event from the event queue
	 * 
	 * @return AbstracEvent object
	 */
	public AbstractEvent take()
	{
		AbstractEvent event = null;
		try 
		{
			event = eventQueue.take();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		return event;
	}
	

}
