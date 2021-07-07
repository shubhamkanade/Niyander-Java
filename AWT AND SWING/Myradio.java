import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Myradio extends Frame implements ItemListener
{
	String msg=null;
	CheckboxGroup cbg;
	Checkbox y,n;

	Myradio()
	{
		setLayout(new FlowLayout());

		cbg=new CheckboxGroup();

		y=new Checkbox("yes",cbg,true);
		n=new Checkbox("no",cbg,false);

		add(y);
		add(n);

		y.addItemListener(this);
		n.addItemListener(this);

		addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});

	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current selection : ";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,10,100);
	}
	public static void main(String arg[])
	{
		Myradio mr=new Myradio();
		mr.setTitle("My radio button");
		mr.setSize(400,400);
		mr.setVisible(true);
	}
}

