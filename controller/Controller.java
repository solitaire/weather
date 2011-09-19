package controller;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import javax.swing.SwingWorker;

import model.Model;
import model.Weather;
import queue.EventQueue;
import request.HttpRequest;
import request.WeatherURL;
import request.XMLResponse;
import view.View;
import event.AbstractEvent;
import event.CloseButtonClickedEvent;
import event.NewRequestEvent;

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
	/** Action-event map */
	private final HashMap<Class<? extends AbstractEvent>, AbstractAction> actionMap;
	
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
		this.actionMap = new HashMap<Class<? extends AbstractEvent>, AbstractAction>();
		createActionMap();
	}

	
	/**
	 *  Takes one event from the event queue and calls action connected to it
	 */
	public void dispatch() 
	{
		while(true)
		{
			final AbstractEvent event;
			try
			{
				event = eventQueue.take();
				actionMap.get(event.getClass()).execute(event);
			}
			catch(final InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	private void createActionMap()
	{
		actionMap.put(NewRequestEvent.class, new MakeRequestAction());
		actionMap.put(CloseButtonClickedEvent.class, new CloseAppAction());
	}
	
	
	private class MakeRequestAction extends AbstractAction
	{

		private SwingWorker<XMLResponse, Void> worker;

		@Override
		public void execute(AbstractEvent event) 
		{
			final String query = ((NewRequestEvent) event).getQuery();
			
			final WeatherURL url = new WeatherURL(query);
			
			worker = new SwingWorker<XMLResponse, Void>()
			{

				@Override
				protected XMLResponse doInBackground() throws Exception 
				{
					HttpRequest request = null;
					try 
					{
						request = new HttpRequest(url.getURL());
					} 
					catch (final MalformedURLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					catch (final URISyntaxException e1)
					{
						e1.printStackTrace();
					}
					return (XMLResponse) request.getResponse();
				}
				
				@Override
				protected void done()
				{
					try 
					{
						XMLResponse response = get();
						model.parse(response);
						view.updateView(model);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			};
			worker.execute();
		}
		
	}
	
	private class CloseAppAction extends AbstractAction
	{

		@Override
		public void execute(AbstractEvent event) 
		{
			System.exit(0);
		}
		
	}

}
