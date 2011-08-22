/**
 * 
 */
package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Model;

import queue.EventQueue;
import event.CloseButtonClickedEvent;
import event.NewRequestEvent;

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
		setLayout(new GridLayout(3, 0));
		
		queryPanel = new QueryPanel(eventQueue);
		todayWeatherPanel = new TodayWeatherPanel();
		currentWeekWeatherPanel = new CurrentWeekWeatherPanel();
		
		add(queryPanel);
		add(todayWeatherPanel);
		add(currentWeekWeatherPanel);
	}
	
	public void update(final Model model)
	{
		currentWeekWeatherPanel.update(model);
	}

}
