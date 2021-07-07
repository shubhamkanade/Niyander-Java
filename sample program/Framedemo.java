import javax.swing.*;
import java.awt.*;

class Framedemo extends JFrame
{
	JLabel l;
	Framedemo()
	{
		Container c=this.getContentPane();

		c.setLayout(new FlowLayout());

		c.setBackground(Color.green);

		l=new JLabel("hello learners!");

		l.setFont(new Font("helvetica",Font.BOLD,30));

				l.setForeground(Color.red);

				c.add(l);
				}
				public static void main(String args[])
				{
				Framedemo f=new Framedemo();

				f.setTitle("my swing frame");

				f.setSize(300,300);

				f.setVisible(true);

				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				}
}
