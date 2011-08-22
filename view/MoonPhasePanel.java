package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.MoonPhase;

class MoonPhasePanel extends JPanel 
{
	private final JLabel percentIlluminated;
	private final JLabel sunset;
	private final JLabel sunrise;
	private final JLabel ageOfMoon;
	
	public MoonPhasePanel()
	{
		percentIlluminated = new JLabel();
		sunset = new JLabel();
		sunrise = new JLabel();
		ageOfMoon = new JLabel();
		
		add(sunrise);
		add(sunset);
		add(percentIlluminated);
		add(ageOfMoon);
	}
	
	public void update(final MoonPhase moonPhase)
	{
		sunrise.setText("Sunrise: " + moonPhase.getSunrise().getHour() + ":" + moonPhase.getSunrise().getMinutes());
		sunset.setText("Sunset: " + moonPhase.getSunset().getHour() + ":" + moonPhase.getSunset().getMinutes());
		percentIlluminated.setText("Percent illumintated: " +moonPhase.getPercentIlluminated());
		ageOfMoon.setText("Age of Moon: " + moonPhase.getAgeOfMoon());
	}

}
