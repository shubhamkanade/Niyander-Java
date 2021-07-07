import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame
{
	public static void main(String arg[])
	{

		Myframe m=new Myframe();
		m.setSize(400,400);
		m.setVisible(true);
		m.setTitle("Hello ");
		m.addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent ae)
				{
					System.exit(0);
				}
				});
	}
}
