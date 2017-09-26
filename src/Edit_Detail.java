import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Edit_Detail extends JFrame implements ActionListener
{
	
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8;
	private JPanel details, buttons;
	private JTextField FirName, lastName, ID, Qual, Mat, Home, Areas;
	private Model mymodel;
	private JButton updateB, deleteB, backB;
	
	public Edit_Detail(Model data)
	{
		mymodel = data;
		
		setTitle("JavaBall");
	    setSize(480, 400);
	    setLocation(350, 200);
	    setVisible(true);
	    
	    details = new JPanel();  
	    details.setLayout(null);
	    details.setBounds(0,0,440,200);    
	    details.setBackground(Color.gray);
	    
	    /*buttons = new JPanel();  
	    buttons.setLayout(null);
	    buttons.setBounds(500,300,440,200);    
	    buttons.setBackground(Color.BLACK);*/
	    
	    label1 = new JLabel("Referee Details");
	    label1.setBounds(200, 0, label1.getText().length()*10, 50);
	    
	    label2 = new JLabel("First Name:");
	    label2.setBounds(35, 60, label1.getText().length()*10, 50);
	    
	    label3 = new JLabel("Last Name:");
	    label3.setBounds(35, 100, label1.getText().length()*10, 50);
	    
	    label4 = new JLabel("ID:");
	    label4.setBounds(35, 140, label1.getText().length()*10, 50);
	    
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
	    FirName.setEditable(false);
	    
	    lastName = new JTextField();
	    lastName.setBounds(107, 115, 100, 25);
	    lastName.setEditable(false);
	    
	    ID = new JTextField();
	    ID.setBounds(107, 155, 100, 25);
	    ID.setEditable(false);
	    
	    Qual = new JTextField();
	    Qual.setBounds(330, 75, 100, 25);
	    
	    Mat = new JTextField();
	    Mat.setBounds(330, 113, 100, 25);
	    Mat.setEditable(false);
	    
	    Home = new JTextField();
	    Home.setBounds(330, 155, 100, 25);
	    
	    Areas = new JTextField();
	    Areas.setBounds(200, 200, 100, 25);
	    
	    updateB = new JButton("Update");
	    updateB.setBounds(35, 280, 100, 25);
	    updateB.addActionListener(this);
	    
	    deleteB = new JButton("Delete");
	    deleteB.setBounds(190, 280, 100, 25);
	    deleteB.addActionListener(this);
	    
	    backB = new JButton("Back");
	    backB.setBounds(350, 280, 100, 25);
	    backB.addActionListener(this);
	    
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
	    details.add(updateB);
	    details.add(deleteB);
	    details.add(backB);

	    add(details);
	    //add(buttons);
	    
	    showDetails();
	    
	}
	
	private void showDetails()
	{
		List<String> row = new ArrayList<String>();
		row = mymodel.returnSearchResult();
		ID.setText(row.get(0));
		FirName.setText(row.get(1));
		lastName.setText(row.get(2));
		Qual.setText(row.get(3));
		Mat.setText(row.get(4));
		Home.setText(row.get(5));
		Areas.setText(row.get(6));
				
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == updateB)
		{
			
		}
		
		if (e.getSource() == deleteB)
		{
			mymodel.delete();
			this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		}
		
		if (e.getSource() == backB)
		{
			this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		}
		
		
	}
	
}
