//import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="demo.java" height="700" width="400"></applet>
public class demo extends Applet implements MouseListener,MouseMotionListener
{
	Label L;
	public void init()
	{
		L=new Label("Welcome");
		addMouseMotionListener(this);
		addMouseListener(this);
			add(L);
	}
	public void Start()
	{
	}
	public void paint(Graphics g)
	{
	}
	public void mouseClicked(MouseEvent me)
	{
		L.setText("Clicked");
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mouseExited(MouseEvent me)
	{
	}
	public void mouseMoved(MouseEvent me)
	{
		L.setText("moved");
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		L.setText("Dragged");
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		L.setText("pressed");
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
	}
}












 
