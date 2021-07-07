import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;
import java.awt.event.*;

class LookFeel extends JFrame implements ItemListener
{
	JButton b;
	JCheckBox cb;
	JRadioButton r1,r2,r3;
	ButtonGroup bg;
	Container c;
	JTextField t;
	LookFeel()
	{
		c=getContentPane();
		c.setLayout(null);

		t=new JTextField("TextField",15);
		b=new JButton("Button");
		cb=new JCheckBox("Checkbox");
		r1=new JRadioButton("Metal");
		r2=new JRadioButton("Motif");
		r3=new JRadioButton("windows");

		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		b.setBounds(100,50,75,40);
		cb.setBounds(100,100,100,40);
		r1.setBounds(50,250,100,30);
		r2.setBounds(100,300,100,30);
		r3.setBounds(250,250,100,30);
		t.setBounds(100,150,100,40);

		c.add(b);
		c.add(cb);
		c.add(t);
		c.add(r1);
		c.add(r2);
		c.add(r3);
		//c.add(t);

		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		try
		{
			if(r1.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			if(r2.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MotifLookAndFeel");
			if(r3.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.metal.WindowsLookAndFeel");

			SwingUtilities.updateComponentTreeUI(c);
		}
		catch(Exception e)
		{}
	}
	public static void main(String arg[])
	{
		LookFeel lk=new LookFeel();
		lk.setSize(400,400);
		lk.setVisible(true);
		lk.setTitle("Look and Feel");
	}
}


