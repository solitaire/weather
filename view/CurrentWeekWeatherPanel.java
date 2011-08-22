package view;

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
	}
	
	public void update(final Model model)
	{
		for (Weather weather : model.getWeather()) 
		{
			add(new CurrentWeatherPanel(weather));
			revalidate();
			validate();
		}
		
	}

}
