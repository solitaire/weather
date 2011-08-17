package model;

/**
 * Simple time representation
 * 
 * @author Anna Stępień
 *
 */
public class BasicTime 
{
	private final int hour;
	private final int minutes;
	
	public BasicTime(final int hour, final int minutes)
	{
		this.hour = hour;
		this.minutes = minutes;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
}
