import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Images extends Frame
{
	static Image img;
	Images()
	{
		img=Toolkit.getDefaultToolkit().getImage("/home/lenovo/Pictures/download.jpeg");
		MediaTracker track=new MediaTracker(this);
		track.addImage(img,0);
		try
		{
			track.waitForID(0);
		}
		catch(Exception e){} 
		this.addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,50,50,null); //g.drawImage(img,50,50,400,400,null); where 400 is width
	}
	public static void main(String arg[])
	{
		Images i=new Images();
		i.setSize(500,500);
		i.setTitle("My Image");
		i.setVisible(true);
		i.setIconImage(img);
	}

}

