package request;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * HTTP request class 
 * 
 * @author Anna Stępień
 * @version 10-08-2011
 */
public class HttpRequest extends AbstractRequest 
{
	private final URL url;
	
	public HttpRequest(final URL url)
	{
		this.url = url;
	}

	@Override
	public AbstractResponse getResponse() 
	{
		HttpURLConnection connection;
		InputStream inputStream = null;
		try 
		{
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/xml");
			
			inputStream = connection.getInputStream();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return new XMLResponse(inputStream);
	}

}
