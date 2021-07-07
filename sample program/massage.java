import java.awt.*;
import java.awt.event.*;
class massage extends Frame
{
	massage()
	{
		this.addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});
	}//end of consrtuctor

	public void paint(Graphics g)
	{
		this.setBackground(Color.blue);

		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f);

		g.setColor(Color.green);

		g.drawString("how are you",100,230);

	}
	public static void main(String arg[])
	{
		massage m=new massage();
		m.setSize(400,300);
		m.setTitle("this is my text");
		m.setVisible(true);
	}
}

