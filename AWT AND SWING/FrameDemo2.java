import java.awt.*;
import javax.swing.*;

class FrameDemo2 extends JFrame
{
	JLabel jl;

	FrameDemo2()
	{
		Container c=this.getContentPane();
		//In java everything gets added into panel
		c.setLayout(new FlowLayout());

		c.setBackground(Color.green);

		jl=new JLabel("Hello learners");

		jl.setFont(new Font("Helvetica",Font.BOLD,25));
		jl.setForeground(Color.red);

		c.add(jl);
	}
	public static void main(String arg[])
	{
		FrameDemo2 fd=new FrameDemo2();
		fd.setSize(500,500);
		fd.setVisible(true);
		fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

