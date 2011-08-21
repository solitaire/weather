package event;

public class NewRequestEvent extends AbstractEvent 
{
	private final String query;
	
	public NewRequestEvent(final String query)
	{
		this.query = query;
	}
	
	public final String getQuery()
	{
		return query;
	}

}
