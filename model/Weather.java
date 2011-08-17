package model;

import utils.WeatherTypes;

/**
 * Represents weather condition for desired place
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
public class Weather 
{
	/** Date */
	private final BasicDate date;
	/** Highest temperature */
	private final int highestTemperature;
	/** Lowest temperature */
	private final int lowestTemperature;
	/** Weather conditions */
	private final String conditions;
	/** Weather type */
	private final WeatherTypes type;
	
	/**
	 * Constructor
	 * 
	 * @param date
	 * @param highestTemperature
	 * @param lowestTemperature
	 * @param conditions
	 */
	public Weather(final BasicDate date, final int highestTemperature,
			final int lowestTemperature, final String conditions, final WeatherTypes type)
	{
		this.date = date;
		this.highestTemperature = highestTemperature;
		this.lowestTemperature = lowestTemperature;
		this.conditions = conditions;
		this.type = type;
	}
	
	
	public BasicDate getDate()
	{
		return date;
	}
	

	public int getHighestTemperature()
	{
		return highestTemperature;
	}
	

	public int getLowestTemperature()
	{
		return lowestTemperature;
	}
	

	public String getConditions()
	{
		return conditions;
	}	
	
	public WeatherTypes getType()
	{
		return type;
	}
}
