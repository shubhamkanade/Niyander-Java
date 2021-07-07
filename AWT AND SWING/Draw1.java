import java.awt.*;
import java.awt.event.*;

class Draw1 extends Frame
{
	Draw1()
	{
		this.addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				}
				);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);

		g.drawRect(40,40,200,200);
		//face
		g.drawOval(90,70,80,80);
		//eyes
		g.drawOval(110,95,5,5);
		g.drawOval(145,95,5,5);
		//nose
		g.drawLine(130,95,130,115);
		//mouth
		g.drawArc(113,115,35,20,0,-180);
	}
	public static void main(String arg[])
	{
		Draw1 d=new Draw1();
		d.setTitle("My Drawing");
		d.setSize(400,400);
		d.setVisible(true);
	}
}


