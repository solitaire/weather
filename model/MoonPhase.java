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
	
	public int getPercentIlluminated()
	{
		return percentIlluminated;
	}
	
	
	public void setPercentIlluminated(final int percentIlluminated)
	{
		this.percentIlluminated = percentIlluminated;
	}
	

	public int getAgeOfMoon()
	{
		return ageOfMoon;
	}
	

	public void setAgeOfMoon(final int ageOfMoon)
	{
		this.ageOfMoon = ageOfMoon;
	}
	

	public Date getSunset()
	{
		return sunset;
	}
	

	public void setSunset(final Date sunset)
	{
		this.sunset = sunset;
	}
	

	public Date getSunrise()
	{
		return sunrise;
	}
	

	public void setSunrise(final Date sunrise)
	{
		this.sunrise = sunrise;
	}
}
