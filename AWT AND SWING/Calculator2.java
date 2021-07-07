import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator2 extends JFrame implements ActionListener
{
	JTextField t;
	JButton b[];
	String str[]={"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
	float op1,op2;
	Calculator2()
	{
		setLayout(new GridLayout(2,1));
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		//str={"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
		t=new JTextField(15);
		b=new JButton[str.length];
		for(int i=0;i<str.length;i++)
		{
			b[i]=new JButton(str[i]);
		}
		p1.add(t);
		for(int i=0;i<str.length;i++)
		{
			b[i].addActionListener(this);
			p2.add(b[i]);
		}
		p2.setLayout(new GridLayout(4,4));
		add(p1);
		add(p2);

	}
	public void actionPerformed(ActionEvent e)
	{
		int flag=0;
		String s="";
		float ans=0.0f;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("+"))
			{
				op1=Float.parseFloat(t.getText());		
				flag=1;
			}

			if(e.getSource()==b[i])
				t.setText(s+b[i].getText());
			if(str[i].equals("="))
			{
				op2=Float.parseFloat(t.getText());
				if(flag==1)
					ans=op1+op2;
				t.setText(Float.toString(ans));



			}
		}














		}
		public static void main(String arg[])
		{
			Calculator2 c=new Calculator2();
			c.setSize(400,400);
			c.setVisible(true);
			c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
