package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Weather;

class ForecastDayPanel extends JPanel 
{

	private static final long serialVersionUID = 1L;
	private final JLabel day;
	private final JLabel temperature;
	private final MultilineLabel conditions;
	
	public ForecastDayPanel(final Weather weather)
	{
		
		day = new JLabel(weather.getDate().getDayName() + ", " +weather.getDate().getDay() + " " 
				+ weather.getDate().getMonthName());
		temperature = new JLabel("Temperature: "+Integer.toString(weather.getHighestTemperature()) + "/" +
				Integer.toString(weather.getLowestTemperature()));
		conditions = new MultilineLabel(weather.getConditions());
		
		add(day);
		final String imageName = ViewConfig.getInstance().getImageName(weather.getType());
		JLabel iconLabel = new JLabel(new ImageLoader(imageName).getImage());
		add(iconLabel);
		add(temperature);
		add(conditions);
	}
	
}
