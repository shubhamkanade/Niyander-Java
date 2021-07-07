import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class ButtonDemo extends JFrame
{
	JButton b;
	ButtonDemo()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon ii=new ImageIcon("home/lenovo/Pictures/download.jpeg");
		b=new JButton("MY BUTON",ii);;

		b.setBackground(Color.red);
		b.setForeground(Color.yellow);

		b.setFont(new Font("Arial",Font.BOLD,25));

		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);
		b.setToolTipText("This is my button");
		b.setMnemonic('c');

		c.add(b);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String ae[])
	{
		ButtonDemo obj=new ButtonDemo();
		obj.setSize(500,400);
		obj.setVisible(true);
		obj.setTitle("my button");
	}
}


