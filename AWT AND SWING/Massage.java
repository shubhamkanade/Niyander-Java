import java.awt.*;
import java.awt.event.*;

class Massage extends Frame
{
	Massage()
	{
		setLayout(new FlowLayout());
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
		setBackground(new Color(100,20,20));
		g.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,30));

		g.setColor(Color.green);
		g.drawString("Hello ,how are you ?",100,100);
	}
	public static void main(String arg[])
	{
		Massage m=new Massage();
		m.setSize(400,300);
		m.setTitle("This is my text");
		m.setVisible(true);
	}
}

