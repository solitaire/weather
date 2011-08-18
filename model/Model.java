package model;

import java.util.ArrayList;

/**
 * Model of the application
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
public class Model 
{
	private ArrayList<Weather> weatherList;
	private MoonPhase moonPhase;
	
	public void setWeather(final ArrayList<Weather> weatherList)
	{
		this.weatherList = weatherList;
	}
	
	public void setMoonPhase(final MoonPhase moonPhase)
	{
		this.moonPhase = moonPhase;
	}
	
	public final ArrayList<Weather> getWeather()
	{
		return weatherList;
	}
	
	public final MoonPhase getMoonPhase()
	{
		return moonPhase;
	}

}
