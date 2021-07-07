import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;;
import java.awt.*;
class ButtonDemo1 extends JFrame implements ActionListener
{
	JButton b;
	JLabel jl;
	ButtonDemo1()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon ii=new ImageIcon("home/lenovo/Pictures/download.jpeg");
		b=new JButton("Click me",ii);;

		b.setBackground(Color.red);
		b.setForeground(Color.yellow);

		b.setFont(new Font("Arial",Font.BOLD,25));

		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);
		b.setToolTipText("This is my button");
		b.setMnemonic('c');

		c.add(b);
		b.addActionListener(this);

		jl=new JLabel();
		c.add(jl);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ImageIcon ii=new ImageIcon("home/lenovo/Pictures/download.jpeg");
		jl.setIcon(ii);
	}
	public static void main(String ae[])
	{
		ButtonDemo obj=new ButtonDemo();
		obj.setSize(500,400);
		obj.setVisible(true);
	}
}
