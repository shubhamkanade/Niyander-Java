import java.awt.*;
import java.awt.event.*;

class Draw2 extends Frame
{
	Draw2()
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
		g.fillRect(40,40,200,200); //only blue available
		g.setColor(Color.yellow);
		g.fillOval(90,70,80,80); //only yellow available 
		g.setColor(Color.black);
		// g.drawRect(40,40,200,200);
		//face
		//g.drawOval(90,70,80,80);
		//eyes
		g.fillOval(110,95,5,5); //only black available
		g.fillOval(145,95,5,5);
		//nose
		g.drawLine(130,95,130,115);
		g.setColor(Color.red);
		//mouth
		g.fillArc(113,115,35,20,0,-180);
	}
	public static void main(String arg[])
	{
		Draw2 d=new Draw2();
		d.setTitle("My Drawing");
		d.setSize(400,400);
		d.setVisible(true);
	}
}

