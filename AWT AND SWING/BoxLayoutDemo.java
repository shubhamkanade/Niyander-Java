import java.awt.*;
import javax.swing.*;

class BoxLayoutDemo extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6;
	BoxLayoutDemo()
	{
		JFrame bl=new JFrame();
		 /*bl.setLayout(new FlowLayout());
                bl.setSize(500,500);
                bl.setVisible(true);
                bl.setTitle("Hello WOrld");
                bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

		//Container c=getContentPane();
		bl.setLayout(new FlowLayout());

		JPanel p1=new JPanel();
		JPanel p2=new JPanel();

	
		BoxLayout bl1=new BoxLayout(this,BoxLayout.X_AXIS);
		
		p1.setLayout(bl1);
		
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		
		//c.add(p1);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		//bl.add(p1);

		//p2.setLayout
		BoxLayout bl2=new BoxLayout(this,BoxLayout.Y_AXIS);
		p2.setLayout(bl2);
		
		b4=new JButton("Button4");
		b5=new JButton("Button5");
		b6=new JButton("Button6");
		
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);

		//bl.add(p2);
		 bl.setLayout(new FlowLayout());
		 bl.add(p1);
			 bl.add(p1);

                bl.setSize(500,500);
                bl.setVisible(true);
                bl.setTitle("Hello WOrld");
                bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] arg)
	{
		/*BoxLayoutDemo bl=new BoxLayoutDemo();
		bl.setSize(500,500);
		bl.setVisible(true);
		bl.setTitle("Hello WOrld");
		bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		new BoxLayoutDemo();
	

	}
}
