package model;

import java.util.Date;

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
	private final Date date;
	/** Highest temperature */
	private final Temperature highestTemperature;
	/** Lowest temperature */
	private final Temperature lowestTemperature;
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
	public Weather(final Date date, final Temperature highestTemperature,
			final Temperature lowestTemperature, final String conditions, final WeatherTypes type)
	{
		this.date = date;
		this.highestTemperature = highestTemperature;
		this.lowestTemperature = lowestTemperature;
		this.conditions = conditions;
		this.type = type;
	}
	

	public Date getDate()
	{
		return date;
	}
	

	public Temperature getHighestTemperature()
	{
		return highestTemperature;
	}
	

	public Temperature getLowestTemperature()
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
