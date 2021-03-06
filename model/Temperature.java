package model;

/**
 * Temperature class 
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 */
class Temperature 
{
	/** Temperature */
	private float temperature;
	
	/**
	 * Constructor
	 * 
	 * @param temperature
	 */
	public Temperature(final float temperature)
	{
		this.temperature = temperature;
	}
	

	public float getTemperature()
	{
		return temperature;
	}
	

	public void setTemperature(final float temperature)
	{
		this.temperature = temperature;
	}
}
