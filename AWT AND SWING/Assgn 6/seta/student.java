import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class student extends JFrame implements ActionListener ,ItemListener
{
JTextField t1,t2,t3,t4;
JLabel l1,l2,l3,l4,l5,l6;
JRadioButton b1,b2,b3;
JCheckBox jb1,jb2,jb3;
ButtonGroup bg ;
JFrame f;
JPanel p1,p2,p3,p4;

	public student() 
	{
			f=new JFrame();
			f.setLayout(new GridLayout(4,2));
	
		
			p1=new JPanel();
			p2=new JPanel();
			p3=new JPanel();
			p4=new JPanel();
			
          t1=new JTextField(10);
          t2=new JTextField(10);
          t3=new JTextField(10);
          t4=new JTextField(10);
          
 		 
         l1=new JLabel("Your Name");
         l2=new JLabel("Your Class",JLabel.LEFT);
         l3=new JLabel("Your Hobbies",JLabel.RIGHT);
         l4=new JLabel("Name");
         l5=new JLabel("Class");
         l6=new JLabel("Hobbie");
         
          bg = new ButtonGroup();
         b1=new JRadioButton("FY");
         b2=new JRadioButton("SY");
         b3=new JRadioButton("TY");
         b1.setAlignmentX(LEFT_ALIGNMENT);
         b2.setAlignmentX(LEFT_ALIGNMENT);
         b3.setAlignmentX(LEFT_ALIGNMENT);
         jb1=new JCheckBox("Music");
         jb2=new JCheckBox("Dance");
         jb3=new JCheckBox("Sports");
         
         bg.add(b1);
         bg.add(b2);
         bg.add(b3);
        

         p1.add (l1);
         p1.add (t1);
         f.add(p1);
	p2.setLayout(new GridLayout(1,2));

         p2.add (l2);
         p2.add (l3);
         f.add(p2);
     	p3.setLayout(new GridLayout(3,2));
        
         p3.add (b1);
         p3.add (jb1);
         p3.add (b2);    
         p3.setAlignmentX(LEFT_ALIGNMENT);
         p3.setAlignmentX(LEFT_ALIGNMENT);
        p3.setAlignmentX(LEFT_ALIGNMENT);
         p3.add (jb2);
         p3.add (b3);
         p3.add (jb3);
         f.add(p3);
        p4. add (l4);
        p4.setAlignmentX(CENTER_ALIGNMENT);
         p4.add (t2);
         p4.add (l5);
         p4.add (t3);
         p4.add (l6);
         p4.add (t4);
         f.add(p4);
         f.pack();
         f.setSize(400,400);
         f.setVisible(true);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
	     jb1.addItemListener(this);
	     jb2.addItemListener(this);
	     jb3.addItemListener(this);
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		new student();
		
	}

	public void itemStateChanged(ItemEvent e) 
	{ 
		 String text="";
		 
		 if(jb1.isSelected())

			  text=text+jb1.getText()+"";
	
		 if(jb2.isSelected())

			  text=text+jb2.getText()+"";
		 if(jb3.isSelected())

			  text=text+jb3.getText()+"";
         t4.setText(text);	
	
	     
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		{
			 String text="";
			 
			 if(b1.isSelected())
				  text=text+b1.getText()+"";
		
			 if(b2.isSelected())

				  text=text+b2.getText()+"";
			 if(b3.isSelected())
				  text=text+b3.getText()+"";
	         t3.setText(text);	
			t2.setText(t1.getText());
		}
		
	}
		
		
}







