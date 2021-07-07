import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Conversion1 implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JPanel p1,p2;
	JButton Cal,Exit;
	public Conversion1()
	{
		f=new JFrame();
		f.setLayout(new GridLayout(2,1,1,1));
		l1=new JLabel("Decimal");
		l2=new JLabel("Binary");
		l3=new JLabel("Octal");
		l4=new JLabel("Hexadecimal");

		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		t4=new JTextField(15);

		p1=new JPanel();
		p1.setLayout(new GridLayout(4,2,2,4));
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		Cal=new JButton("cal");
		Exit=new JButton("Exit");
		//Cal.addActionListener(this);
		//Exit.addActionListener(this);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(l4);
		p1.add(t4);

		p2.add(Cal);
		p2.add(Exit);
		f.add(p1);
		f.add(p2);
		      Cal.addActionListener(this);
                Exit.addActionListener(this);

		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Cal)
		{
			String s=t1.getText();
			int a=Integer.parseInt(s);
			t2.setText(Integer.toBinaryString(a));
			t3.setText(Integer.toOctalString(a));
			t4.setText(Integer.toHexString(a).toUpperCase());
		}
		else
		{
			System.exit(0);
		}
	}
}
class demo1
{
	public static void main(String arg[])
	{
		new Conversion1();
		//c.createGui();
	}
}



















































