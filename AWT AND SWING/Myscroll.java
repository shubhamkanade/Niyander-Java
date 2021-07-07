//the concept of scrollbar is important in this program
import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Myscroll extends Frame implements AdjustmentListener
{

	String msg="";
	Scrollbar  s1;

	Myscroll()
	{
		setLayout(null); //set apppropriate layout
		s1=new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);

		s1.setBounds(250,50,30,200);

		add(s1);
		s1.addAdjustmentListener(this);

		addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("SCROLLBAR POSITION: ",20,150);
		msg+=s1.getValue();
		g.drawString(msg,50,180);
		msg="";
	}
	public static void main(String arg[])
	{
		Myscroll m=new Myscroll();
		m.setTitle("My new Scroll");
		m.setSize(400,400);
		m.setVisible(true);
	}
}

