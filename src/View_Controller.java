import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;


public class View_Controller extends JFrame implements ActionListener
{
	private JComboBox refereesName;
	private JLabel label1,label2,label3;
	private JPanel searchPanel;
	private JTextField FirName, lastName;
	private JButton searchbut;
	private Model mymodel;
	
	public View_Controller(Model data)
	{
		mymodel = data;
		
		setTitle("JavaBall");
	    setSize(400, 400);
	    setLocation(350, 200);
		
	    searchPanel = new JPanel();  
	    searchPanel.setLayout(null);
	    searchPanel.setBounds(0,0,400,200);    
	    searchPanel.setBackground(Color.gray);  
	    
	    String temp ="<html>\"Identified a refree by first and last name:\"<br>e.g. Dave Gray</html>";
	    label1 = new JLabel("Identify a refree by first and last name");
	    label1.setBounds(80, 0, label1.getText().length()*10, 50);
	    
	    label2 = new JLabel("First Name");
	    label2.setBounds(108, 38, 100, 25);
	    
	    
	    label3 = new JLabel("Last Name");
	    label3.setBounds(218, 38, 100, 25);
	    
	    FirName = new JTextField();
	    FirName.setBounds(90, 60, 100, 25);
	    
	    lastName = new JTextField();
	    lastName.setBounds(200, 60, 100, 25);
	    
	    searchbut = new JButton("Search");
	    searchbut.setBounds(90, 100, 200, 25);
	    searchbut.addActionListener(this);

        
	    searchPanel.add(label1);
	    searchPanel.add(label2);
	    searchPanel.add(label3);
	    searchPanel.add(FirName);
	    searchPanel.add(lastName);
	    searchPanel.add(searchbut);
	    
        add(searchPanel);

        
        setLayout(null);    
        setVisible(true);    
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*setTitle("JavaBall");
	    setSize(400, 400);
	    setLocation(350, 200);
	    // create the two buttons
	    button1 = new JButton("Press Me");
	    button2 = new JButton("Press Me Too");
	    label1 = new JLabel("Identified a refree by first and last name:");
	    refereesName = new JComboBox(data.refereesName());
	    searchPanel = new JPanel();
	    // position the buttons on the window.
	    add(refereesName, "North");
	    add(button2, "South");
	    label1.setLocation(20, 100);
	    searchPanel.add(label1);
	    add(searchPanel, "North");
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    refereesName.addActionListener(this);
	          // become visible and wait.
	     setVisible(true);*/

	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == searchbut)
		{
			if (mymodel.findReferee(FirName.getText().trim(), lastName.getText().trim()))
			{
				FirName.setText("");
				lastName.setText("");
				Edit_Detail x = new Edit_Detail(mymodel);
			}
			else
			{
				JOptionPane.showMessageDialog(null,
						"There is no referee with this name.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			
		}
	     // check to see which button the event
	     // came from.
	/*if (e.getSource() == button1)
	     System.err.println("Ouch");
	else // must be button2
	     System.err.println("Stop It");*/
	}
}
