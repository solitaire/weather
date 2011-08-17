package model;


/**
 * Represents information connected with Moon phase
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 */
public class MoonPhase
{
	/** Percent of illuminated part */
	private int percentIlluminated;
	/** Age of Moon */
	private int ageOfMoon;
	/** Time of sunrise */
	private BasicTime sunrise;
	/** Time of sunset */
	private BasicTime sunset;
	
	/**
	 * Constructor 
	 * 
	 * @param percentIlluminated
	 * @param ageOfMoon
	 * @param sunrise
	 * @param sunset
	 */
	public MoonPhase(final int percentIlluminated, final int ageOfMoon,
			final BasicTime sunrise, final BasicTime sunset)
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
	

	public BasicTime getSunset()
	{
		return sunset;
	}
	

	public void setSunset(final BasicTime sunset)
	{
		this.sunset = sunset;
	}
	

	public BasicTime getSunrise()
	{
		return sunrise;
	}
	

	public void setSunrise(final BasicTime sunrise)
	{
		this.sunrise = sunrise;
	}
}
