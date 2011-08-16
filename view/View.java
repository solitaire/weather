package view;

import javax.swing.SwingUtilities;

/**
 * View facade 
 * 
 * @author Anna Stępień
 * @version 09-08-2011
 *
 */
public class View 
{
	/** Main frame of the app */
	private final MainFrame frame;
	
	
	public View()
	{
		frame = new MainFrame();
	}

	/**
	 * Displays main window
	 */
	public void display() 
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				frame.setVisible(true);
			}
		});
	}

}
