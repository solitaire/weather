package model;

import utils.WeatherTypes;

public class TodayWeather 
{
	private final String titleToday;
	private final String titleTonight;
	private final String conditionsToday;
	private final String conditionsTonight;
	private final WeatherTypes weatherTypeToday;
	private final WeatherTypes weatherTypeTonight;
	
	public TodayWeather(final String titleToday, final String conditionsToday, final WeatherTypes weatherTypeToday,
			final String titleTonight, final String conditionsTonight, final WeatherTypes weatherTypeTonight)
	{
		this.titleToday = titleToday;
		this.titleTonight = titleTonight;
		this.conditionsToday = conditionsToday;
		this.conditionsTonight = conditionsTonight;
		this.weatherTypeToday = weatherTypeToday;
		this.weatherTypeTonight = weatherTypeTonight;
	}

	public final String getTitleToday() 
	{
		return titleToday;
	}

	public final String getTitleTonight() 
	{
		return titleTonight;
	}

	public final String getConditionsToday() 
	{
		return conditionsToday;
	}

	public final String getConditionsTonight() 
	{
		return conditionsTonight;
	}

	public final WeatherTypes getWeatherTypeToday() 
	{
		return weatherTypeToday;
	}

	public final WeatherTypes getWeatherTypeTonight() 
	{
		return weatherTypeTonight;
	}
	
	

}
