import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Edit_Detail extends JFrame implements ActionListener
{
	
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8;
	private JPanel details;
	private JTextField FirName, lastName, ID, Qual, Mat, Home, Areas;
	
	public Edit_Detail()
	{
		setTitle("JavaBall");
	    setSize(480, 400);
	    setLocation(350, 200);
	    setVisible(true);
	    
	    details = new JPanel();  
	    details.setLayout(null);
	    details.setBounds(0,0,440,200);    
	    details.setBackground(Color.gray);
	    
	    label1 = new JLabel("Referee Details");
	    label1.setBounds(200, 0, label1.getText().length()*10, 50);
	    
	    label2 = new JLabel("First Name:");
	    label2.setBounds(40, 60, label1.getText().length()*10, 50);
	    
	    label3 = new JLabel("Last Name:");
	    label3.setBounds(40, 100, label1.getText().length()*10, 50);
	    
	    label4 = new JLabel("ID:");
	    label4.setBounds(40, 140, label1.getText().length()*10, 50);
	    
	    label5 = new JLabel("Qualification:");
	    label5.setBounds(220, 60, label1.getText().length()*10, 50);
	    
	    label6 = new JLabel("Num of Matches:");
	    label6.setBounds(220, 100, label1.getText().length()*10, 50);
	    
	    label7 = new JLabel("Home Area:");
	    label7.setBounds(220, 140, label1.getText().length()*10, 50);
	    
	    label8 = new JLabel("Areas:");
	    label8.setBounds(155, 185, label1.getText().length()*10, 50);
	    
	    FirName = new JTextField();
	    FirName.setBounds(107, 73, 100, 25);
	    
	    lastName = new JTextField();
	    lastName.setBounds(107, 115, 100, 25);
	    
	    ID = new JTextField();
	    ID.setBounds(107, 155, 100, 25);
	    
	    Qual = new JTextField();
	    Qual.setBounds(320, 75, 100, 25);
	    
	    Mat = new JTextField();
	    Mat.setBounds(320, 113, 100, 25);
	    
	    Home = new JTextField();
	    Home.setBounds(320, 155, 100, 25);
	    
	    Areas = new JTextField();
	    Areas.setBounds(200, 200, 100, 25);
	    
	    details.add(label1);
	    details.add(label2);
	    details.add(label3);
	    details.add(label4);
	    details.add(label5);
	    details.add(label6);
	    details.add(label7);
	    details.add(label8);
	    details.add(FirName);
	    details.add(lastName);
	    details.add(ID);
	    details.add(Qual);
	    details.add(Mat);
	    details.add(Home);
	    details.add(Areas);

	    add(details);
	    
	    
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
	
}
