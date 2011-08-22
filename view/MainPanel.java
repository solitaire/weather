/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import model.Model;
import queue.EventQueue;

/**
 * @author Anna Stępień
 * @version 2011-08-22
 */
class MainPanel extends JPanel 
{
	private final EventQueue eventQueue; 
	private final QueryPanel queryPanel;
	private final TodayWeatherPanel todayWeatherPanel;
	private final CurrentWeekWeatherPanel currentWeekWeatherPanel;
	
	public MainPanel(final EventQueue eventQueue)
	{
		this.eventQueue = eventQueue;
		setPreferredSize(new Dimension(ViewConfig.WIDTH, ViewConfig.HEIGHT));			
		setLayout(new BorderLayout(20, 0));
		
		queryPanel = new QueryPanel(eventQueue);
		todayWeatherPanel = new TodayWeatherPanel();
		currentWeekWeatherPanel = new CurrentWeekWeatherPanel();
		
		add(queryPanel, BorderLayout.NORTH);
		add(todayWeatherPanel, BorderLayout.CENTER);
		add(currentWeekWeatherPanel, BorderLayout.SOUTH);
	}
	
	public void update(final Model model)
	{
		todayWeatherPanel.update(model);
		currentWeekWeatherPanel.update(model);
	}

}
