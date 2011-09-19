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
	private final static String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private final static String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
											"October", "November", "December"};
	
	private final Calendar calendar;
	
	public BasicDate(final int day, final int month, final int dayOfYear, final int year)
	{
		calendar = new GregorianCalendar();
		calendar.set(Calendar.DAY_OF_WEEK, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
		calendar.set(Calendar.YEAR, year);
	}
	
	public final int getMonth()
	{
		return calendar.get(Calendar.MONTH);
	}
	
	public final int getYear()
	{
		return calendar.get(Calendar.YEAR);
	}
	
	public final int getDay()
	{
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	public final int getDayOfYear()
	{
		return calendar.get(Calendar.DAY_OF_YEAR);
	}
	
	public final String getDayName()
	{
		return DAYS[calendar.get(Calendar.DAY_OF_WEEK) - 1];
	}
	
	public final String getMonthName()
	{
		return MONTHS[calendar.get(Calendar.MONTH)];
	}
		
}
