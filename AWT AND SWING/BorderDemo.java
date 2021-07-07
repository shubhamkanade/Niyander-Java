import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
class BorderDemo extends JFrame
{
	JButton b1,b2,b3,b4;
	BorderDemo()
	{
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout());

		b1=new JButton("Raised Bevel Border");
		b2=new JButton("Lowered Bevel Border");
		b3=new JButton("Raised Etched Border");
		b4=new JButton("Lowered Etched Border");

		/*b1=new JButton("Raised Bevel Border");
		  b1=new JButton("Raised Bevel Border");
		  b1=new JButton("Raised Bevel Border");
		  b1=new JButton("Raised Bevel Border");*/

		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.red,Color.green);
		b1.setBorder(bd);
		bd=BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		b2.setBorder(bd);
		bd=BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.red,Color.green);
		b3.setBorder(bd);
		bd=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		b4.setBorder(bd);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String ag[])
	{
		BorderDemo obj=new BorderDemo();
		obj.setSize(500,500);
		obj.setVisible(true);
		obj.setTitle("hello ");
	}
}

