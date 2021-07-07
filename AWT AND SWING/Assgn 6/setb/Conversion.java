import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Conversion
{
	static JFrame j;
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4;
	JButton cal,exit;
	JPanel p1,p2;

	void createGUI()
	{
		j=new JFrame();
		j.setLayout(new GridLayout(2,1,1,1));
		j.setTitle("Conversion");
		j.setLocation(300,400);
		j.setSize(200,200);
		p1=new JPanel();
		p2=new JPanel();
		t1=new JTextField(10);  
		t2=new JTextField(10);  
		t3=new JTextField(10);  
		t4=new JTextField(10);  
		l1=new JLabel("Decimal");
		l2=new JLabel("Binary");
		l3=new JLabel("Octal");
		l4=new JLabel("Hexadecimal");
		cal=new JButton("Calculate");
		exit=new JButton("Exit");
		p1.setLayout(new GridLayout(4,2,2,4));
		p2.setLayout(new FlowLayout());

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(l4);
		p1.add(t4);

		p2.add(cal);
		p2.add(exit); 
		j.add(p1);
		j.add(p2);

		cal.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae)
				{
					   //if(ae.getSource()=="Exit")
                                        //System.exit(0);
					
				String value=t1.getText(); 
				int a=Integer.parseInt(value);
				t2.setText(Integer.toBinaryString(a));
				t3.setText(Integer.toOctalString(a));
				t4.setText(Integer.toHexString(a).toUpperCase());
				
				}});
		
		
	}

	public static void main(String args[])
	{
		Conversion c=new Conversion();
		c.createGUI();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
} 
