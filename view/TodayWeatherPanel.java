package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import utils.WeatherTypes;

import model.Model;

class TodayWeatherPanel extends JPanel
{
	private final MoonPhasePanel moonPhasePanel;
	private final CurrentWeather todayPanel;
	private final CurrentWeather tonightPanel;
	
	public TodayWeatherPanel()
	{
		moonPhasePanel = new MoonPhasePanel();
		todayPanel = new CurrentWeather();
		tonightPanel = new CurrentWeather();
		
		setLayout(new GridLayout(0, 3));
		setPreferredSize(new Dimension(1024, 240));
		//add(todayPanel);
		//add(tonightPanel);
		//add(moonPhasePanel);
	}
	
	public void update(final Model model)
	{
		add(todayPanel);
		add(tonightPanel);
		add(moonPhasePanel);

		todayPanel.setTitle(model.getTodayWeather().getTitleToday());
		todayPanel.setIcon(model.getTodayWeather().getWeatherTypeToday());
		todayPanel.setConditions(model.getTodayWeather().getConditionsToday());
		tonightPanel.setTitle(model.getTodayWeather().getTitleTonight());
		tonightPanel.setIcon(model.getTodayWeather().getWeatherTypeTonight());
		tonightPanel.setConditions(model.getTodayWeather().getConditionsTonight());
		moonPhasePanel.update(model.getMoonPhase());
	}	
	
	private class CurrentWeather extends JPanel
	{
		private final JLabel titleLabel;
		private final JLabel iconLabel;
		private final MultilineLabel conditionsLabel;
		
		public CurrentWeather()
		{
			setLayout(new BorderLayout());
			titleLabel = new JLabel();
			iconLabel = new JLabel();
			conditionsLabel = new MultilineLabel();
			add(titleLabel, BorderLayout.NORTH);
			add(iconLabel, BorderLayout.CENTER);
			add(conditionsLabel, BorderLayout.SOUTH);
		}
		
		public void setTitle(final String title)
		{
			titleLabel.setText(title);
		}
		
		public void setIcon(final WeatherTypes type)
		{
			final String imageName = ViewConfig.getInstance().getImageName(type);
			iconLabel.setIcon(new ImageLoader(imageName).getImage());
		}
		
		public void setConditions(final String conditions)
		{
			conditionsLabel.setText(conditions);
		}

	}
	

}
