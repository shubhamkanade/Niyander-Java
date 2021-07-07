import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Two extends JFrame
{
	JLabel l1,l2,l3;
	JTextField tf1,tf2;
	JPanel p1,p2;
	Two(String s)
	{
		Container c=this.getContentPane();
		c.setLayout(new GridLayout(2,1));
		
		p1=new JPanel();
		p1.setLayout(new FlowLayout());
		p2=new JPanel();
		p2.setLayout(new GridLayout(2,2));
		l1=new JLabel("Welcome to the KBC");
		p1.add(l1);
		l2=new JLabel("Username");
		l3=new JLabel("Password");
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		p2.add(l2);
		p2.add(tf1);
		p2.add(l3);
		p2.add(tf2);
		add(p1);
		add(p2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String arg[])
	{
	Two t=new Two("Hello");
	t.setSize(500,500);
	t.setVisible(true);	
	}
}
