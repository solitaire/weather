package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Weather;

class CurrentWeatherPanel extends JPanel 
{
	private final JLabel day;
	private final JLabel maxTemperature;
	private final JLabel minTemperature;
	private final JLabel conditions;
	
	public CurrentWeatherPanel(final Weather weather)
	{
		
		day = new JLabel(Integer.toString(weather.getDate().getDay()));
		maxTemperature = new JLabel(Integer.toString(weather.getHighestTemperature()));
		minTemperature = new JLabel(Integer.toString(weather.getLowestTemperature()));
		conditions = new JLabel(weather.getConditions());
		
		add(day);
		add(maxTemperature);
		add(minTemperature);
		add(conditions);
	}
	
}
