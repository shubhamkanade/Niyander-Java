import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator1 extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,plus,equal,div,mul,sub,b12;
	JPanel p1,p2,p3;
	JTextField tf;
	int flag=0;
	float op1,op2;
	Calculator1()
	{
		this.setLayout(new GridLayout(3,1));
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();

		tf=new JTextField(20);
		b12=new JButton("Reset");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b10=new JButton("0");
		b11=new JButton(".");
		equal=new JButton("=");
		plus=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		//add=new JButton("+");
		p1.add(tf);
		p3.add(b12);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(plus);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(sub);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(mul);
		p2.add(b10);
		p2.add(b11);
		p2.add(equal);
		p2.add(div);
		p2.setLayout(new GridLayout(4,4));
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		equal.addActionListener(this);
		plus.addActionListener(this);
		mul.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		b12.addActionListener(this);
		add(p1);
		add(p2);
		add(p3);
	}
	public void actionPerformed(ActionEvent ae)
	{

		String s = tf.getText();
		float ans = 0;
		if(ae.getSource()==b12)
		tf.setText("");
		if(ae.getSource() == b1)
		{
			tf.setText( s+b1.getText() );	

		}	
		else if(ae.getSource() == b2)
		{ 
			tf.setText( s + b2.getText() );

		}
		else if(ae.getSource() == b3)
		{
			tf.setText( s + b3.getText() );

		}
		else if(ae.getSource() == b4)
		{
			tf.setText( s + b4.getText() );

		}
		if(ae.getSource() == b5)
		{
			tf.setText( s + b5.getText() );

		}
		if(ae.getSource() == b6)
		{
			tf.setText( s + b6.getText() );

		}
		if(ae.getSource() == b7)
		{
			tf.setText( s + b7.getText() );

		}
		if(ae.getSource() == b8)
		{
			tf.setText( s + b8.getText() );

		}
		if(ae.getSource() == b9)
		{
			tf.setText( s + b9.getText() );

		}
		if(ae.getSource() == b10)
		{
			tf.setText( s + b10.getText() );

		}
		if(ae.getSource()==plus)
		{
			op1=Float.parseFloat(tf.getText());	
			tf.setText("");
			flag=1;
		}
		   if(ae.getSource()==sub)
                {
                        op1=Float.parseFloat(tf.getText());
                        tf.setText("");
                        flag=2;
                }
		       if(ae.getSource()==mul)
                {
                        op1=Float.parseFloat(tf.getText());
                        tf.setText("");
                        flag=3;
                }
		       if(ae.getSource()==div)
                {
                        op1=Float.parseFloat(tf.getText());
                        tf.setText("");
                        flag=4;
                }


		if(ae.getSource()==equal)
		{
			op2=Float.parseFloat(tf.getText());
			if(flag==1)
				ans=op1+op2;	
			if(flag==2)
				ans=op1-op2;
			if(flag==3)
				ans=op1*op2;
			if(flag==4)
				ans=op1/op2;
		tf.setText(""+ans);//tf.setText(Float.toString(ans));
		}	
				
			
	}
	public static void main(String arg[])
	{	
		Calculator1 c=new Calculator1();
		c.setSize(400,400);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
