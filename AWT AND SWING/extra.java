import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class extra extends JFrame 
{
	JButton b[];
	JLabel l[][];
	extra()
	{
		//Container c=getContentPane();
		setLayout(new GridLayout(4,5));
		l=new JLabel[4][4];
		b=new JButton[4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if((i==1 && j==1)||(i==1 && j==2)||(i==2 && j==1)||(i==2 && j==2))
				l[i][j]=new JLabel("      ");
				else
				l[i][j]=new JLabel("Danger");


			}
		}
		b[0]=new JButton("Up");
		b[1]=new JButton("Down");
		b[2]=new JButton("Left");
		b[3]=new JButton("Right");
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
		l[2][1].setText("*");}	
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b[0])
			{
				l[1][1].setText("*");
			}
		}


		
	
	public static void main(String arg[])
	{
		extra e=new extra();
		e.setSize(400,400);
		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
	


