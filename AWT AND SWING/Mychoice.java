import java.awt.*;
import java.awt.event.*;

class Mychoice extends Frame implements ItemListener
{
	String msg;
	Choice ch;
	Mychoice()
	{
		setLayout(new FlowLayout());

		ch=new Choice();
		ch.add("English");
		ch.add("Hindi");
		ch.add("Telugu");
		ch.add("Sanskrit");
		ch.add("French");

		add(ch);

		ch.addItemListener(this);

		addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});

	};
	public void itemStateChanged(ItemEvent ae)
	{
		repaint();
	}
		
	public void paint(Graphics g)
	{
		g.drawString("Selected language: ",10,100);
		msg=ch.getSelectedItem();
		g.drawString(msg,10,120);
	}
	public static void main(String arg[])
	{
		Mychoice m=new Mychoice();
		//m.setTitle("Choice");
		m.setSize(400,400);
		m.setVisible(true);
	}
}



