package model;

import java.util.ArrayList;

import request.XMLResponse;

/**
 * Model of the application
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
public class Model 
{
	private final Parser parser;
	private ArrayList<Weather> weatherList;
	private MoonPhase moonPhase;
	
	public Model()
	{
		this.parser = new Parser();
	}
	
	public void parse(final XMLResponse response)
	{
		parser.parse(response);
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
