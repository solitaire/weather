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
	
	public final static int WIDTH = 1024;
	public final static int HEIGHT= 480;
	public static final int TODAY_WEATHER_PANEL_HEIGHT = 240;
	public static final int QUERY_PANEL_HEIGHT = 60;
	public static final int TEXT_FIELD_WIDTH = 40;
	public static final int CURRENT_WEEK_PANEL_HEIGHT = 200;
	
	private static ViewConfig instance;
	
	public final Map<WeatherTypes, String> imagesMap;
	
	
	private ViewConfig()
	{
		imagesMap = new HashMap<WeatherTypes, String>();
		createImagesMap();
	}
	
	public static ViewConfig getInstance()
	{
		if (instance != null)
			return instance;
		return new ViewConfig();
	}
	
	public final String getImageName(final WeatherTypes type)
	{
		return imagesMap.get(type);
	}
	
	private void createImagesMap()
	{
		imagesMap.put(WeatherTypes.CHANCEFLURRIES, "flurries.png");
		imagesMap.put(WeatherTypes.CHANCERAIN, "rainy.png");
		imagesMap.put(WeatherTypes.CHANCESLEET, "sleet.png");
		imagesMap.put(WeatherTypes.CHANCESNOW, "snow.png");
		imagesMap.put(WeatherTypes.CHANCETSTORMS, "chance-storm.png");
		imagesMap.put(WeatherTypes.CLEAR, "fair.png");
		imagesMap.put(WeatherTypes.CLOUDY, "cloudy.png");
		imagesMap.put(WeatherTypes.FLURRIES, "flurries.png");
		imagesMap.put(WeatherTypes.FOG, "fog.png");
		imagesMap.put(WeatherTypes.HAZY, "hazy.png");
		imagesMap.put(WeatherTypes.MOSTLYCLOUDY, "m-cloudy.png");
		imagesMap.put(WeatherTypes.MOSTLYSUNNY, "sunny.png");
		imagesMap.put(WeatherTypes.PARTLYCLOUDY, "partly-cloudy.png");
		imagesMap.put(WeatherTypes.PARTLYSUNNY, "sunny.pngs");
		imagesMap.put(WeatherTypes.RAIN, "rainy.png");
		imagesMap.put(WeatherTypes.SLEET, "sleet.png");
		imagesMap.put(WeatherTypes.SNOW, "snow.png");
		imagesMap.put(WeatherTypes.SUNNY, "sunny.png");
		imagesMap.put(WeatherTypes.TSTORMS, "thunder-storm.png");
		imagesMap.put(WeatherTypes.UNKNOWN, "na.png");
		imagesMap.put(WeatherTypes.NT_RAIN, "na.png");
		imagesMap.put(WeatherTypes.NT_PARTLYCLOUDY, "na.png");
		imagesMap.put(WeatherTypes.NT_SUNNY, "na.png");
		imagesMap.put(WeatherTypes.NT_CLOUDY, "na.png");
	}

}
