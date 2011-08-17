package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Basic wrapper for Java's Calendar class
 * 
 * @author Anna Stępień
 *
 */
public class BasicDate 
{
	private final Calendar calendar;
	
	public BasicDate(final int day, final int month, final int dayOfYear, final int year)
	{
		calendar = new GregorianCalendar();
		calendar.set(Calendar.DAY_OF_WEEK, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
		calendar.set(Calendar.YEAR, year);
	}
	
	public int getMonth()
	{
		return calendar.get(Calendar.MONTH);
	}
	
	public int getYear()
	{
		return calendar.get(Calendar.YEAR);
	}
	
	public int getDay()
	{
		return calendar.get(Calendar.DAY_OF_WEEK);
	}
	
	public int getDayOfYear()
	{
		return calendar.get(Calendar.DAY_OF_YEAR);
	}
		
}
