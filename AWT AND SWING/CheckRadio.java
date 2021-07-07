import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CheckRadio extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2;
	JCheckBox cb1,cb2;
	JTextArea ta;
	ButtonGroup bg;
	String msg="";
	CheckRadio()
	{
		Container c=getContentPane();

		c.setLayout(new FlowLayout());

		ta=new JTextArea(10,20);

		cb1=new JCheckBox("java",true);
		cb2=new JCheckBox("J2ee");

		rb1=new JRadioButton("male",true);
		rb2=new JRadioButton("female");

		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		c.add(cb1);
		c.add(cb2);
		c.add(rb1);
		c.add(rb2);
		c.add(ta);

		cb1.addActionListener(this);
		cb2.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(cb1.getModel().isSelected()) msg+="\nJava";
		if(cb2.getModel().isSelected()) msg+="\nJ2EE";
		if(rb1.getModel().isSelected()) msg+="\nMale";
		else msg+="\nFemale";
		ta.setText(msg);
		msg="";
	}
	public static void main(String argp[])
	{
		CheckRadio cr=new CheckRadio();
		cr.setTitle("with swing ");
		cr.setSize(400,400);
		cr.setVisible(true);
	}
}

