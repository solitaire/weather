package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import model.Model;

import event.NewRequestEvent;

import queue.EventQueue;

/**
 * View facade 
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
public class View 
{
	/** Main frame of the app */
	private final MainFrame frame;
	private final MainPanel panel;
	private final EventQueue eventQueue;
	
	
	public View(final EventQueue eventQueue)
	{
		this.eventQueue = eventQueue;
		frame = new MainFrame(eventQueue);
		panel = new MainPanel(eventQueue);
		frame.add(panel);
	}

	/**
	 * Displays main window
	 */
	public void display() 
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				frame.setVisible(true);
			}
			
		});
	}
	
	/**
	 * Updates view after receiving date from xml file
	 * 
	 * @param model Model object
	 */
	public void updateView(final Model model)
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				panel.update(model);
			}
		});
		
	}

}
