import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Calculator implements ActionListener
{
	JFrame f;	
		
	JTextField t;

	JButton b0;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton plus;
	JButton minus;
	JButton div;
	JButton mult;
	JButton equ;
	JButton dot;
	
	JPanel p1;
	JPanel p2;	
	
	float op1 = 0;
	float op2 = 0;		
	
	int flag = 0;

	public Calculator()
	{
		f = new JFrame("Calculator");
			
		t = new JTextField(20);
		//t.setFont(new Font("Verdana",Font.BOLD | Font.ITALIC ,30));
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		plus = new JButton("+");
		minus = new JButton("-");
		mult = new JButton("*");
		div = new JButton("/");
		equ = new JButton("=");
		dot = new JButton(".");

		// Panel p1 (adds textfield in 1st panel)
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1,0));
		p1.add(t);
		
		// Panel p2 (adds all the buttons)
		p2 = new JPanel();
		p2.setLayout(new GridLayout(4,3));
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(plus);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(minus);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(mult);
		p2.add(b0);
		p2.add(dot);
		p2.add(equ);
		p2.add(div);
		
		// add panels in frame
			
		f.setLayout(new GridLayout(2,0));
		f.add(p1);
		f.add(p2);
		
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		//adding action listener to all the buttons..
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		equ.addActionListener(this);
		dot.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s = t.getText();
		
		float ans = 0;
		
		if(e.getSource() == b0)
		{
			t.setText( s + b0.getText() );	
		
		}
		else if(e.getSource() == b1)
		{
			t.setText( s + b1.getText() );	
		
		}
		else if(e.getSource() == b2)
		{
			t.setText( s + b2.getText() );	
		
		}
		else if(e.getSource() == b3)
		{
			t.setText( s + b3.getText() );	
		
		}
		else if(e.getSource() == b4)
		{
			t.setText( s + b4.getText() );	
		
		}
		else if(e.getSource() == b5)
		{
			t.setText( s + b5.getText() );	
		
		}
		else if(e.getSource() == b6)
		{
			t.setText( s + b6.getText() );	
		
		}
		else if(e.getSource() == b7)
		{
			t.setText( s + b7.getText() );	
		
		}
		else if(e.getSource() == b8)
		{
			t.setText( s + b8.getText() );	
		
		}
		else if(e.getSource() == b9)
		{
			t.setText( s + b9.getText() );	
		
		}
		else if(e.getSource() == plus)
		{
			op1 = Float.parseFloat(t.getText());
			//t.setText( s + plus.getText() );
			t.setText("");			
			flag = 1;		
		}
		else if(e.getSource() == minus)
		{
			op1 = Float.parseFloat(t.getText());
			//t.setText( s + minus.getText() );		
			t.setText("");	
			flag = 2;		
		}
		else if(e.getSource() == mult)
		{
			op1 = Float.parseFloat(t.getText());
			//t.setText( s + mult.getText() );
			t.setText("");			
			flag = 3;		
		}
		else if(e.getSource() == div)
		{
			op1 = Float.parseFloat(t.getText());
			//t.setText( s + div.getText() );			
			t.setText("");
			flag = 4;		
		}
		else if(e.getSource() == dot)
		{
			t.setText( s + dot.getText() );			
			
		}
		else if(e.getSource() == equ)
		{
			op2 = Float.parseFloat(t.getText());
			if(flag == 1)
			{
				ans = op1 + op2; 
			}	
			else if(flag == 2)
			{
				ans = op1 - op2;
			}
			else if(flag == 3)
			{
				ans = op1 * op2;
			}
			else if(flag == 4)
			{
				ans = op1 / op2;
			}	
			

			t.setText(""+ans);	

		}
	}
		
	public static void main(String args[])
	{
		new Calculator();
	}

}
