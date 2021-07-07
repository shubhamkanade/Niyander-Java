import java.lang.*;
import javax.swing.*;
import java.awt.*;

class FrameDemo1 extends JFrame
{
        public static void main(String arg[])
        {
		FrameDemo fobj=new FrameDemo();
		//
		Container c=fobj.getContentPane();
		c.setBackground(Color.green);
                fobj.setSize(400,400);
                fobj.setVisible(true);
                fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}

