package request;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Represents weather feed url for specified place
 * 
 * @author Anna Stępień
 * @version 10-08-2011
 *
 */
public class WeatherURL 
{
	private final static String BASE = "http://api.wunderground.com/auto/wui/geo/ForecastXML/index.xml?query=";
	private final String query;
	
	public WeatherURL(final String query)
	{
		this.query = query;
	}
	
	/**
	 * Returns query url
	 * 
	 * @return query url
	 * @throws MalformedURLException
	 */
	public URL getURL() throws MalformedURLException
	{
		return new URL(BASE + query);
	}

}
