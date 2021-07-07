import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;

public class Pframe1 extends JFrame implements ActionListener
{
	JButton pack,unpack;
	Container c;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2;
	//JButton b1;
	JTextArea ta;
	JPanel p1,p2;
	Box h1,v1;
	Pframe1()
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
		String name="\n\n\n"+"\t"+"Marvellous Packer-unpacker :Login"+"\n";
		//	name.setBackground(Color.blue);
		ta.setText(name);
		ta.append("\t"+LocalDate.now()+""+"\n");
	        ta.append("\t"+LocalTime.now()+"");

		pack=new JButton("Pack");
		unpack=new JButton("Unpack");
		
		pack.setBounds(100,250,70,40);
		unpack.setBounds(200,250,70,40);
		c.add(ta);
		c.add(pack);
		c.add(unpack);
		pack.addActionListener(this);
		unpack.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Pack"))
			{
			Pframe2 p=new Pframe2();
			p.setSize(500,500);
			p.setVisible(true);		
			}
	
	}

	public static void main(String arg[])
	{
		Pframe1 p=new Pframe1();
		p.setTitle("Marvellous-packing unpacking");
		p.setSize(500,500);
		p.setVisible(true);
	}
}

