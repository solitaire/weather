package view;

import java.util.HashMap;
import java.util.Map;

import utils.WeatherTypes;


/**
 * View configuration parameters
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
class ViewConfig 
{
	
	public final static int WIDTH = 640;
	public final static int HEIGHT= 480;
	
	public final Map<WeatherTypes, String> imagesMap;
	
	
	public ViewConfig()
	{
		imagesMap = new HashMap<WeatherTypes, String>();
	}

}
