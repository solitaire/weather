package model;

import java.util.Date;

/**
 * Represents information connected with Moon phase
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 */
class MoonPhase
{
	/** Percent of illuminated part */
	private int percentIlluminated;
	/** Age of Moon */
	private int ageOfMoon;
	/** Time of sunrise */
	private Date sunrise;
	/** Time of sunset */
	private Date sunset;
	
	/**
	 * Constructor 
	 * 
	 * @param percentIlluminated
	 * @param ageOfMoon
	 * @param sunrise
	 * @param sunset
	 */
	public MoonPhase(final int percentIlluminated, final int ageOfMoon,
			final Date sunrise, final Date sunset)
	{
		this.percentIlluminated = percentIlluminated;
		this.ageOfMoon = ageOfMoon;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	
	/**
	 * Returns percent of illuminated part
	 * 
	 * @return percentIlluminated
	 */
	public int getPercentIlluminated()
	{
		return percentIlluminated;
	}
	
	/**
	 * Sets percent of illuminated part
	 * 
	 * @param percent of illuminated part
	 */
	public void setPercentIlluminated(final int percentIlluminated)
	{
		this.percentIlluminated = percentIlluminated;
	}
	
	/**
	 * Returns age of Moon
	 * 
	 * @return age of Moon
	 */
	public int getAgeOfMoon()
	{
		return ageOfMoon;
	}
	
	/**
	 * Sets age of Moon
	 * 
	 * @param ageOfMoon
	 */
	public void setAgeOfMoon(final int ageOfMoon)
	{
		this.ageOfMoon = ageOfMoon;
	}
	
	/**
	 * Returns sunset time
	 * 
	 * @return sunset time
	 */
	public Date getSunset()
	{
		return sunset;
	}
	
	/**
	 * Sets sunset time
	 * 
	 * @param sunset
	 */
	public void setSunset(final Date sunset)
	{
		this.sunset = sunset;
	}
	
	/**
	 * Returns sunrise time
	 * 
	 * @return sunrise time
	 */
	public Date getSunrise()
	{
		return sunrise;
	}
	
	/**
	 * Sets sunrise time
	 * 
	 * @param sunrise
	 */
	public void setSunrise(final Date sunrise)
	{
		this.sunrise = sunrise;
	}
}
