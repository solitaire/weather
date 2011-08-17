package request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import model.BasicDate;
import model.BasicTime;
import model.MoonPhase;
import model.Weather;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import utils.WeatherTypes;

/**
* XML parser class
*
* @author Anna Stępień
* @version 10-08-2011
*
*/
public class Parser
{
   
   private final XMLResponse response;
   private final Element root;
   
   public Parser(final XMLResponse response)
   {
       this.response = response;
       this.root = response.getXmlResponse().getDocumentElement();
   }
   
   public ArrayList<Weather> getWeatherList()
   {
	   ArrayList<Weather> weatherList = new ArrayList<Weather>();
	   
	   Element node = (Element) root.getElementsByTagName("simpleforecast").item(0);
	   NodeList list = node.getElementsByTagName("forecastday");
	   
	   for (int i = 0; i < list.getLength(); ++i)
	   {
		   Element forecastDay = (Element) list.item(i);
		   
		   Element dateElement = (Element)forecastDay.getElementsByTagName("date").item(0);
		   Element highestTemepratureElement = (Element)forecastDay.getElementsByTagName("high").item(0);
		   Element lowestTemperatureElement = (Element)forecastDay.getElementsByTagName("low").item(0);
		   
		   int day = getIntegerValue(dateElement, "day");
		   int month = getIntegerValue(dateElement, "month");
		   int year = getIntegerValue(dateElement, "year");
		   int dayOfYear = getIntegerValue(dateElement, "yday");
		   
		   int highestTemperature = getIntegerValue(highestTemepratureElement, "celsius");
		   int lowestTemperature = getIntegerValue(lowestTemperatureElement, "celsius");
		   
		   String weatherType = getTextValue(forecastDay, "icon").toUpperCase();
		   String conditions = getTextValue(forecastDay, "conditions");
		   
		   BasicDate date = new BasicDate(day, month, dayOfYear, year);
		   
		   Weather weather = new Weather(date, highestTemperature, lowestTemperature, conditions, WeatherTypes.valueOf(weatherType));
		   
		   weatherList.add(weather);
	   }
	   
	   return weatherList;
   }
   
   public MoonPhase getMoonPhase()
   {
	   NodeList list = root.getElementsByTagName("moon_phase");
	   Element element = (Element)list.item(0);
	   
	   Element sunsetElement = (Element)element.getElementsByTagName("sunset").item(0);
	   Element sunriseElement = (Element)element.getElementsByTagName("sunrise").item(0);
	   
	   int percentIlluminated = getIntegerValue(element, "percentIlluminated");
	   int ageOfMoon = getIntegerValue(element, "ageOfMoon");
	   int sunsetHour = getIntegerValue(sunsetElement, "hour");
	   int sunsetMinutes = getIntegerValue(sunsetElement, "minute");
	   int sunriseHour = getIntegerValue(sunriseElement, "hour");
	   int sunriseMinutes = getIntegerValue(sunriseElement, "minute");
	   
	   BasicTime sunrise = new BasicTime(sunriseHour, sunriseMinutes);
	   BasicTime sunset = new BasicTime(sunsetHour, sunsetMinutes);
	   
	   return new MoonPhase(percentIlluminated, ageOfMoon, sunrise, sunset);
   }
   
   
   private String getTextValue(final Element el, final String name)
   {
	   String value = null;
			   
	   NodeList list = el.getElementsByTagName(name);
	   Element element = (Element) list.item(0);
	   
	   value = element.getFirstChild().getNodeValue();
	   
	   return value;
	   
   }
   
   private int getIntegerValue(final Element el, final String name)
   {
	   return Integer.parseInt(getTextValue(el, name));
   }
   
}
