package request;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;


/**
 * Represents XML response for weather feed
 * 
 * @author Anna Stępień
 * @version 10-08-2011
 *
 */
public class XMLResponse extends AbstractResponse 
{

	private final InputStream inputStream;
	
	
	public XMLResponse(final InputStream inputStream)
	{
		this.inputStream = inputStream;
	}
	
	public Document getXmlResponse()
	{
		Document xml = null;
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		try 
		{
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			xml = builder.parse(inputStream);
		} 
		catch (ParserConfigurationException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return xml;
	}

}
