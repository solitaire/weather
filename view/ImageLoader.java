package view;

import javax.swing.ImageIcon;

class ImageLoader 
{
	private final ImageIcon image;
	
	public ImageLoader(final String fileName)
	{
		image = new ImageIcon(getClass().getResource("images/" + fileName));
	}
	
	public ImageIcon getImage()
	{
		return image;
	}

}
