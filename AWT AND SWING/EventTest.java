import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EventTest extends JFrame
{
	JLabel l=new JLabel();
	EventTest()
	{
		setLayout(new FlowLayout());
		add(l);
		addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent ke)
			{
			l.setText("You typed"+ke.getKeyChar());
		}
		});

		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent me)
			{
			l.setText("Mouse moved:X="+me.getX()+"Y="+ me.getY());
		}
		});

		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		new EventTest();
	}
}
