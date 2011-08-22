package view;

import javax.swing.JTextArea;

class MultilineLabel extends JTextArea
{
	
	private static final long serialVersionUID = 1L;

	public MultilineLabel()
	{
	    setBackground(null);
	    setEditable(false);
	    setBorder(null);
	    setLineWrap(true);
	    setWrapStyleWord(true);
	    setFocusable(false);
	}
	
	public MultilineLabel(final String text) 
	{
		super(text);
	    setBackground(null);
	    setEditable(false);
	    setBorder(null);
	    setLineWrap(true);
	    setWrapStyleWord(true);
	    setFocusable(false);
	}
}
