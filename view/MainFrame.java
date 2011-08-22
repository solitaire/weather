package view;

import javax.swing.JFrame;

import queue.EventQueue;

/**
 * Main frame
 * 
 * @author Anna Stępień
 *
 */
class MainFrame extends JFrame
{

	private static final long serialVersionUID = 1L;
	private final EventQueue eventQueue;

	public MainFrame(final EventQueue eventQueue)
	{
		this.eventQueue = eventQueue;
		setTitle("Weather Fetcher");
		setSize(ViewConfig.WIDTH, ViewConfig.HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
