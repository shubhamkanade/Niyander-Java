import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class hobby implements ItemListener
{
	JFrame f;

	JTextField t1;
	JTextField t2;
	
	JRadioButton rb1;
	JRadioButton rb2;
	JRadioButton rb3;	

	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;

	JLabel l1;
	JLabel l2;
	JLabel l3;

	JPanel p1;
	JPanel p2;
	JPanel p3;	
	JPanel p4;
	JPanel p5;

	//This thing is for radio button it avoids from selecting all radio buttons from selecting simultaneously..
	ButtonGroup bgrp;


	public hobby()
	{
		f = new JFrame("My Frame");
		
		t1 = new JTextField(20);
		t2 = new JTextField(35);

		rb1 = new JRadioButton("Fy");
		rb2 = new JRadioButton("Sy");
		rb3 = new JRadioButton("Ty");	

		cb1 = new JCheckBox("Music");
		cb2 = new JCheckBox("Dance");
		cb3 = new JCheckBox("Sport");
		
		l1 = new JLabel("Your Name");	
		l2 = new JLabel("Your Class");
		l3 = new JLabel("Your Hobby");

		// Panel P1
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(l1);
		p1.add(t1);

		
		// Panel p2
		p2 = new JPanel();
		p2.setLayout(new GridLayout(4,0));
		p2.add(l2);
		p2.add(rb1);
		p2.add(rb2);
		p2.add(rb3);
		
		// Button group		
		bgrp = new ButtonGroup();
		bgrp.add(rb1);
		bgrp.add(rb2);
		bgrp.add(rb3);

		// Panel p3
		p3 = new JPanel();
		p3.setLayout(new GridLayout(4,0));
		p3.add(l3);
		p3.add(cb1);
		p3.add(cb2);
		p3.add(cb3);

		// Panel p5 contains Panel p2 and Panel p3
		p5 = new JPanel();
		p5.setLayout(new GridLayout(1,1));
		p5.add(p2);
		p5.add(p3);
		
		// Panel p4
		p4 = new JPanel();
		p4.add(t2);		

		// Frame contains p1 p4 and p5
		f.setLayout(new GridLayout(3,0));
		f.add(p1);
		f.add(p5);
		f.add(p4);

		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
		
		// Adding item listener
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);	

		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);

	}
	

	public void itemStateChanged(ItemEvent e)
	{
		String name = null;
		String Class = null;
		String Hobby = null;
		String text = null;
			

		name = "Name = "+t1.getText();;
		
		if(rb1.isSelected())
		{
			Class = "Class = " + rb1.getText();
		}
		if(rb2.isSelected())
		{
			Class = "Class = " + rb2.getText();
		}
		if(rb3.isSelected())
		{
			Class = "Class = " + rb3.getText();
		}


		
		if(cb1.isSelected())
		{
			Hobby = "Hobby = " + cb1.getText();
		}
		if(cb2.isSelected())
		{
			Hobby = "Hobby = " + cb2.getText();
		}
		if(cb3.isSelected())
		{
			Hobby ="Hobby = " + cb3.getText();
		}
	
		if(cb1.isSelected() && cb2.isSelected() )
		{
			Hobby = "Hobby = " + cb1.getText() +" "+ cb2.getText() ;
		}

		if(cb1.isSelected() && cb3.isSelected() )
		{
			Hobby = "Hobby = " + cb1.getText() +" "+ cb3.getText() ;
		}

		if(cb2.isSelected() && cb3.isSelected() )
		{
			Hobby = "Hobby = " + cb2.getText() +" "+ cb3.getText() ;
		}

		if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected() )
		{
			Hobby = "Hobby = " + cb1.getText() +"  "+ cb2.getText() +"  "+ cb3.getText() ;
		}
		
		
		text = "  " + name + "  " + Class + "  " + Hobby;
		t2.setText(text);

	}
	public static void main(String args[])
	{
		new hobby();
	}
}
