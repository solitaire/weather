package view;

import javax.swing.JFrame;

/**
 * Main frame
 * 
 * @author Anna Stępień
 *
 */
class MainFrame extends JFrame
{

	private static final long serialVersionUID = 1L;

	public MainFrame()
	{
		setSize(ViewConfig.WIDTH, ViewConfig.HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
