import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Keys extends Frame implements KeyListener
{
	TextArea ta;
	String msg="";

	Keys()
	{
		setLayout(new FlowLayout());
		ta=new TextArea(5,25);

		ta.setFont(new Font("SansSerif",Font.BOLD,25));
		ta.setForeground(Color.red);

		add(ta);

		ta.addKeyListener(this);
		addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});
	}
	public  void  keyPressed(KeyEvent ke)
	{
		//get the code of  the key pressed
	     int code=ke.getKeyCode();
		msg+="\n key code :"+code;
		
		//get the name of the key from the code
		String name=ke.getKeyText(code);
		msg+="\n Key pressed: "+name;
		
		//display the key code and key name in text area
		ta.setText(msg);
		msg="";

	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
		//get the code of  the key pressed
		int code=ke.getKeyCode();
		msg+="\n key code :"+code;
		String name=ke.getKeyText(code);
		msg+="\n Key pressed: "+name;
		ta.setText(msg);
		msg="";


	}
	public static void main(String arg[])
	{
		Keys k=new Keys();
		k.setTitle("catch the keys");
		k.setSize(400,400);
		k.setVisible(true);
	}

}

