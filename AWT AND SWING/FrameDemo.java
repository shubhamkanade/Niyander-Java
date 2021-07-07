import java.lang.*;
import javax.swing.*;

class FrameDemo
{
	public static void main(String arg[])
	{
		JFrame fobj=new JFrame("My frame");
		fobj.setSize(400,400);
		fobj.setVisible(true);
		fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
