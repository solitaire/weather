package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import model.Model;
import model.Weather;

class CurrentWeekWeatherPanel extends JPanel 
{
	private static final long serialVersionUID = 1L;

	public CurrentWeekWeatherPanel()
	{
		setLayout(new GridLayout(0, 6));
		setPreferredSize(new Dimension(ViewConfig.WIDTH, ViewConfig.CURRENT_WEEK_PANEL_HEIGHT));
	}
	
	public void update(final Model model)
	{
		removeAll();
		for (Weather weather : model.getWeekWeather()) 
		{
			add(new ForecastDayPanel(weather));
			revalidate();
			validate();
		}
		
	}

}
