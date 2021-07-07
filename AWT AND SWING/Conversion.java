import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Conversion extends JFrame
{
	JButton cal,exit;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2,tf3,tf4;
	JPanel p1,p2;
	Conversion()
	{
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout());

		p1=new JPanel();
		p1.setLayout(new GridLayout(4,1));
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		l1=new JLabel("Decimal");
		tf1=new JTextField(15);
		l2=new JLabel("Binary");
		tf2=new JTextField(15);
		l3=new JLabel("Octal");
		tf3=new JTextField(15);
		l4=new JLabel("Hexadecimal");
		tf4=new JTextField(15);
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(tf3);
		p1.add(l4);
		p1.add(tf4);

		cal=new JButton("Calculate");
		exit=new JButton("Exit");
		p2.add(cal);
		p2.add(exit);
		add(p1);
		add(p2);
	}
	public static void main(String arg[])
	{
		Conversion c=new Conversion();
		c.setSize(400,200);
		 //c.setLocation(300,400);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}
}
