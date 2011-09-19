package request;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URI;
import java.net.URLEncoder;

import javax.print.URIException;

/**
 * Represents weather feed url for specified place
 * 
 * @author Anna Stępień
 * @version 10-08-2011
 *
 */
public class WeatherURL 
{
	private final static String HOST = "api.wunderground.com";
	private final static String PATH = "/auto/wui/geo/ForecastXML/index.xml";
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
	 * @throws URISyntaxException 
	 * @throws UnsupportedEncodingException 
	 */
	public URL getURL() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException
	{
		URI uri = new URI("http", HOST, PATH, "query="+query, null);
		return new URL(uri.toASCIIString().replace("%20", "%25"));
	}

}
