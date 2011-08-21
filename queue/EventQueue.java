package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import event.AbstractEvent;

/**
 * Wrapper for Java's blocking queue
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
public class EventQueue 
{
	 /** Event queue */
	private final BlockingQueue<AbstractEvent> eventQueue;
	
	

	public EventQueue()
	{
		eventQueue = new LinkedBlockingQueue<AbstractEvent>();
	}
	
	/**
	 * Puts an event into the event queue
	 * 
	 * @param event
	 * @throws InterruptedException 
	 */
	public void put(final AbstractEvent event) throws InterruptedException
	{

		eventQueue.put(event);

	}
	
	/**
	 * Takes an event from the event queue
	 * 
	 * @return AbstracEvent object
	 * @throws InterruptedException 
	 */
	public AbstractEvent take() throws InterruptedException
	{

		AbstractEvent event = eventQueue.take();

		return event;
	}
	

}
