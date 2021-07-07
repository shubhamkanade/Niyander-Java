import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JTextField;
public  class mouse extends Applet implements MouseListener,MouseMotionListener{
	int width,height;
int mx,my; JTextField t;
    String message;                  
	public mouse() {
	width=getSize().width;
	height=getSize().height;
	mx=width/2;
	addMouseListener(this);
	addMouseMotionListener(this);
	}
	
	public void init()
	{
		t=new JTextField(20);
		add(t);
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				mx=e.getX();
		        my=e.getX();
		        message="Mouse Clicked:X=" +e.getX() + "Y=" +e.getY();
		        t.setText(message);
			}
		});
	}
	public void mouseEntered(MouseEvent e)
	{
		mx=e.getX();
        my=e.getX();
        showStatus("Mouse at("+ mx +","+ my +")");
        repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		mx=e.getX();
        my=e.getX();
        showStatus("Mouse at("+ mx +","+ my +")");
        repaint();
	   
	}
    public void mousePressed(MouseEvent e)
    {
    	mx=e.getX();
        my=e.getX();
        showStatus("Mouse at("+ mx +","+ my +")");
        repaint();
	
    }
    public void mouseReleased(MouseEvent e)
    {
    	mx=e.getX();
        my=e.getX();
        showStatus("Mouse at("+ mx +","+ my +")");
        repaint();
	
    }
    public void mouseMoved(MouseEvent e)
    {
    	mx=e.getX();
        my=e.getX();
        showStatus("Mouse at("+ mx +","+ my +")");
        repaint();
	}
    public void mouseDraged(MouseEvent e)
    {
    	mx=e.getX();
        my=e.getX();
        showStatus("Mouse at("+ mx +","+ my +")");
        repaint();
	}
    
 	public static void main(String args[]) {
            new mouse();		
 	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
