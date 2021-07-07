import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Mycheckbox extends Frame implements ItemListener
{
	String msg="";
	Checkbox c1,c2,c3;

	Mycheckbox()
	{
		setLayout(new FlowLayout());

			c1=new Checkbox("Bold",true);
		c2=new Checkbox("Italic");
		c3=new Checkbox("Underline");

		add(c1);
		add(c2);
		add(c3);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});
	}//end of constructor
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Current States",10,100);
		msg="Bold :"+c1.getState();
		g.drawString(msg,10,120);
		msg="Italic:"+c2.getState();
		g.drawString(msg,10,140);
		msg="Underline:"+c3.getState();
		g.drawString(msg,10,160);
	}
	public static void main(String arg[])
	{
		Mycheckbox mc=new Mycheckbox();
		mc.setTitle("My checkbox");
		mc.setSize(500,500);
		mc.setVisible(true);
	}
}


