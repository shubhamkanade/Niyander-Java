import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Checkbox extends JFrame
{
	//vars
	ButtonGroup bg;
	JRadioButton rb1,rb2;
	JCheckBox cb1,cb2;
	JTextArea ta1;
	String msg=" ";

	Checkbox()
	{
		Container c=getContentPane();
		c.setBackground(Color.green);

		c.setLayout(new FlowLayout());

		ta1=new JTextArea(10,20);

		cb1=new JCheckBox("java",true);
		cb2=new JCheckBox("j2ee");

		rb1=new JRadioButton("male",true);
		rb2=new JRadioButton("female");

		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		c.add(cb1);
		c.add(cb2);
		c.add(rb1);
		c.add(rb2);
		c.add(ta1);

	//	cb1.addActionListener(this);
	//	cb2.addActionListener(this);
	//	rb1.addActionListener(this);
	//	rb2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		Checkbox cb=new Checkbox();
		cb.setTitle("my window");
		cb.setSize(500,400);
		cb.setVisible(true);
	}
}



