import javax.swing.*;
import java.awt.event.*;


public class View_Controller extends JFrame implements ActionListener
{
	private JButton button1, button2;
	private JComboBox refereesName;
	
	public View_Controller(Model data)
	{
		setTitle("JavaBall");
	    setSize(400, 400);
	    setLocation(350, 200);
	    // create the two buttons
	    button1 = new JButton("Press Me");
	    button2 = new JButton("Press Me Too");
	    refereesName = new JComboBox(data.refereesName());
	    // position the buttons on the window.
	    add(refereesName, "North");
	    add(button2, "South");
	    //refereesName.setLocation(150, 150);
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    refereesName.addActionListener(this);
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
