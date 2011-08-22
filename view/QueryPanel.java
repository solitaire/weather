package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import event.CloseButtonClickedEvent;
import event.NewRequestEvent;

import queue.EventQueue;

class QueryPanel extends JPanel 
{
	private final JButton queryButton;
	private final JButton closeButton;
	private final JTextField queryField;
	
	public QueryPanel(final EventQueue eventQueue)
	{
		setPreferredSize(new Dimension(1024, 60));
		queryButton = new JButton("Check!");
		closeButton = new JButton("Close");
		queryField = new JTextField(40);
		
		add(queryField);
		add(queryButton);
		add(closeButton);
		
		queryButton.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				final String query = queryField.getText();
				try 
				{
					eventQueue.put(new NewRequestEvent(query));
				} 
				catch (InterruptedException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		closeButton.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					eventQueue.put(new CloseButtonClickedEvent());
				} 
				catch (InterruptedException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}

}
