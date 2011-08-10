package model;

import java.util.Date;

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
	
	/**
	 * Constructor
	 * 
	 * @param date
	 * @param highestTemperature
	 * @param lowestTemperature
	 * @param conditions
	 */
	public Weather(final Date date, final Temperature highestTemperature,
			final Temperature lowestTemperature, final String conditions)
	{
		this.date = date;
		this.highestTemperature = highestTemperature;
		this.lowestTemperature = lowestTemperature;
		this.conditions = conditions;
	}
	
	/**
	 * Returns date
	 * 
	 * @return date
	 */
	public Date getDate()
	{
		return date;
	}
	
	/**
	 * Returns the highest temperature
	 * 
	 * @return highest temperature
	 */
	public Temperature getHighestTemperature()
	{
		return highestTemperature;
	}
	
	/**
	 * Returns the lowest temperature
	 * 
	 * @return the lowest temperature
	 */
	public Temperature getLowestTemperature()
	{
		return lowestTemperature;
	}
	
	/**
	 * Returns description of weather conditions
	 * 
	 * @return description of conditions
	 */
	public String getConditions()
	{
		return conditions;
	}	
}
