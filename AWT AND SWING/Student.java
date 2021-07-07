import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Student extends JFrame implements ItemListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JPanel p1,p2,p3,p4;
	JTextField tf1,tf2,tf3,tf4;
	JRadioButton rb1,rb2,rb3;
	JCheckBox cb1,cb2,cb3;
	ButtonGroup bg;
	Student()
	{
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		l1=new JLabel("Your name");
		tf1=new JTextField(15);
		p1.add(l1);
		p1.add(tf1);
		
		l2=new JLabel("Your class",JLabel.LEFT);
		setLayout(new GridLayout(4,1));
		rb1=new JRadioButton("FY");
		rb2=new JRadioButton("SY");
		rb3=new JRadioButton("TY");
		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		/*p2.add(l2);
		p2.add(rb1);
		p2.add(rb2);
		p2.add(rb3);*/
	
		//p2.add(bg);
		p2.setLayout(new GridLayout(4,2));
	

		l3=new JLabel("Your Hobbies");
		cb1=new JCheckBox("Music");
		cb2=new JCheckBox("Dance");
		cb3=new JCheckBox("Sports");
		p2.add(l2);
                p2.add(l3);
                p2.add(rb1);
                p2.add(cb1);
		p2.add(rb2);
                p2.add(cb2);
                p2.add(rb3);
                p2.add(cb3);
			

		l4=new JLabel("Name");
		tf2=new JTextField(10);
		l5=new JLabel("Class");
		tf3=new JTextField(10);
		l6=new JLabel("Hobbies");
		tf4=new JTextField(10);
		p3.setLayout(new FlowLayout());
		
		
		p3.add(l4);
		p3.add(tf2);
		p3.add(l5);
		p3.add(tf3);
		p3.add(l6);
		p3.add(tf4);
		//1.addItemLitsener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
		
		   cb1.addItemListener(this);
                cb2.addItemListener(this);
                cb3.addItemListener(this);
		
		
		add(p1);
		add(p2);
		add(p3);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String s="";
		s=tf1.getText();
		tf2.setText(s);
		if(rb1.isSelected())
		{
			s=rb1.getText();
			tf3.setText(s);
			s="";
		}
		 if(rb2.isSelected())
                {
                        s=rb2.getText();
                        tf3.setText(s);
			s="";
                }
		  if(rb3.isSelected())
                {
                        s=rb3.getText();
                        tf3.setText(s);
			s="";
                }
		 if(cb1.isSelected())
                {
                        s=s+cb1.getText();
                        tf4.setText(s);
                }
		   if(cb2.isSelected())
                {
                        s=s+cb2.getText();
                        tf4.setText(s);
                }
		   if(cb3.isSelected())
                {
                        s=s+cb3.getText();
                        tf4.setText(s);
                }



			
	 


	}
	public static void main(String arg[])
	{
		Student s=new Student();
		s.setSize(400,400);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

