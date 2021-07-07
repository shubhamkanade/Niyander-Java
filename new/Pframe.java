import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;

public class Pframe extends JFrame implements ActionListener
{
	Container c;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2;
	JButton b1;
	JTextArea ta;
	JPanel p1,p2;
	Box h1,v1;
	Pframe()
	{
		c=this.getContentPane();
		c.setBackground(Color.blue);
		c.setLayout(null);
		//h1 = Box.createHorizontalBox();		
		ta=new JTextArea(50,50);
		//ta.setFont(new Font("Arial",Font.BOLD,15));

		//l4=new JLabel("Marvellous packer unpacker");
		ta.setBounds(0,0,1500,200);
		ta.setFont(new Font("Arial",Font.BOLD,20));
		String name="\n\n\n"+"\t"+"File Packer-unpacker :Login"+"\n";
		//	name.setBackground(Color.blue);
		ta.setText(name);
		ta.append("\t"+LocalDate.now()+""+"\n");
		ta.append("\t"+LocalTime.now()+"");

		//p1=new JPanel();	
		//p1.setLayout(new FlowLayout());

		l1=new JLabel("Username");
		//l1.setBounds(100,200,100,40);
		l1.setBounds(150,300,100,40);
		l1.setFont(new Font("Arial",Font.BOLD,15));
		l1.setForeground(Color.white);



		tf1=new JTextField(40);
		//tf1.setBounds(300,200,200,30);
		tf1.setBounds(300,300,200,30);


		l2=new JLabel("Password");
		//l2.setBounds(100,300,200,30);
		l2.setBounds(150,400,200,30);
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l2.setForeground(Color.white);

		tf2=new JTextField(30);
		//tf2.setBounds(300,300,200,30);
		tf2.setBounds(300,400,200,30);
		tf2.setToolTipText("Enter a password");

		b1=new JButton("Submit");
		b1.setBounds(150,500,200,30);


		//c.add(p1);
		//c.add(p2);
		c.add(l1);
		c.add(tf1);
		c.add(l2);
		c.add(tf2);
		c.add(b1);	
		c.add(ta);
	
		//l1.addActionListener(this);
		//l2.addActionListener(this);	
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		b1.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getActionCommand().equals("Submit"))
		{
			if((tf1.getText().equals("Shubham"))&&(tf2.getText().equals("Shubham123")))
				{
				JOptionPane.showMessageDialog(this,"successfully login");
				Pframe1 p=new Pframe1();
				p.setSize(500,500);
				p.setVisible(true);
				this.dispose();
				}
			else
				 JOptionPane.showMessageDialog(this,"Invalid login check username and password");
		}


	}

	public static void main(String arg[])
	{
		Pframe p=new Pframe();
		p.setTitle("Marvellous-packing unpacking");
		p.setSize(500,500);
		p.setVisible(true);
	}
}

