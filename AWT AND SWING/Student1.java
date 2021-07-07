import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Student1 extends JFrame
{
	JPanel p1,p2,p3,p4;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2;
	JRadioButton rb1,rb2,rb3;
	ButtonGroup bg;
	JCheckBox cb1,cb2,cb3;
	Student1()
	{
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();

		this.setLayout(new GridLayout(3,1));
		l1=new JLabel("Your Name");
		tf1=new JTextField(15);
		p1.add(l1);
		p1.add(tf1);

		l2=new JLabel("Your Class");
		rb1=new JRadioButton("FY");
		rb2=new JRadioButton("SY");
		rb3=new JRadioButton("TY");
		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		l3=new JLabel("Your Hobbies");
		cb1=new JCheckBox("Music");
		cb2=new JCheckBox("Dance");
		cb3=new JCheckBox("Sports");
		p2.setLayout(new GridLayout(4,2));
		p2.add(l2);
		p2.add(l3);
		p2.add(rb1);
		p2.add(cb1);
		p2.add(rb2);
		p2.add(cb2);
		p2.add(rb3);
		p2.add(cb3);

		tf2=new JTextField(15);
		p3.add(tf2);
		this.add(p1);
		this.add(p2);
		this.add(p3);
	}
	public static void main(String arg[])
	{
		Student s1=new Student();
		s1.setSize(400,400);
		s1.setVisible(true);
	}
}

