import javax.swing.*;
import java.awt.event.*;


public class View_Controller extends JFrame implements ActionListener
{
	private JButton button1, button2;
	private JComboBox petList;
	public View_Controller()
	{
		setTitle("Button Frame");
	    setSize(200, 200);
	    setLocation(700, 700);
	          // create the two buttons
	     button1 = new JButton("Press Me");
	     button2 = new JButton("Press Me Too");
	          // position the buttons on the window.
	     add(button1, "Center");
	     add(button2, "South");
	     button1.addActionListener(this);
	     button2.addActionListener(this);
	          // become visible and wait.
	     setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{
	     // check to see which button the event
	     // came from.
	if (e.getSource() == button1)
	     System.err.println("Ouch");
	else // must be button2
	     System.err.println("Stop It");
	}
}
