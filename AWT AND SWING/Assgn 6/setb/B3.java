
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.*;
public class B3 extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//JPanel p1=new JPanel();
	//JPanel p2=new JPanel();
	JLabel l[][]=new JLabel[4][4];
	
	JButton b[]=new JButton[4];
	int x,y;
	B3()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if((i==1||i==2)&&(j==1||j==2))
				{
					l[i][j]=new JLabel("  ");
				}
				else
					l[i][j]=new JLabel("Danger");
			}
		}
		l[2][1].setText(" * ");
		x=2;
		y=1;
		b[0]=new JButton("UP");
		b[0].addActionListener(this);
		b[1]=new JButton("DOWN");
		b[1].addActionListener(this);
		b[2]=new JButton("LEFT");
		b[2].addActionListener(this);
		b[3]=new JButton("RIGHT");
		b[3].addActionListener(this);
		setLayout(new GridLayout(4,5));
		add(l[0][0]);
		add(l[0][1]);
		add(l[0][2]);
		add(l[0][3]);
		add(b[0]);
		add(l[1][0]);
		add(l[1][1]);
		add(l[1][2]);
		add(l[1][3]);
		add(b[1]);
		add(l[2][0]);
		add(l[2][1]);
		add(l[2][2]);
		add(l[2][3]);
		add(b[2]);
		add(l[3][0]);
		add(l[3][1]);
		add(l[3][2]);
		add(l[3][3]);
		add(b[3]);
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b[0])
		{
			//JOptionPane.showMessageDialog(b[0],"X is "+x+" Y is "+y+" and label is "+l[x-1][y]);
			if(l[x-1][y].getText().equalsIgnoreCase("Danger"))
			{
				JOptionPane.showMessageDialog(b[0], "Invalid Move"); 
			}
			else
			{
				l[x][y].setText(" ");
				l[x-1][y].setText(" * ");
				x=x-1;
			}
		}
		if(ae.getSource()==b[1])
		{
			if(l[x+1][y].getText().equalsIgnoreCase("Danger"))
			{
				JOptionPane.showMessageDialog(b[1], "Invalid Move"); 
			}
			else
			{
				l[x][y].setText(" ");
				l[x+1][y].setText(" * ");
				x=x+1;
			}
		}
		if(ae.getSource()==b[2])
		{
			if(l[x][y-1].getText().equalsIgnoreCase("Danger"))
			{
				JOptionPane.showMessageDialog(b[2], "Invalid Move"); 
			}
			else
			{
				l[x][y].setText(" ");
				l[x][y-1].setText(" * ");
				y=y-1;
			}
		}
		if(ae.getSource()==b[3])
		{
			if(l[x][y+1].getText().equalsIgnoreCase("Danger"))
			{
				JOptionPane.showMessageDialog(b[3], "Invalid Move"); 
			}
			else
			{
				l[x][y].setText(" ");
				l[x][y+1].setText(" * ");
				y=y+1;
			}
		}
	}
	public static void main(String args[])
	{
		new B3();
	}
}
