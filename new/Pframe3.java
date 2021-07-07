import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import java.io.*;
public class Pframe3 extends JFrame implements ActionListener
{
	Container c;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2;
	JButton b1;
	JTextArea ta;
	JPanel p1,p2;
	Box h1,v1;
	Pframe3()
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

		//p1=new JPanel();	
		//p1.setLayout(new FlowLayout());

		l1=new JLabel("File name");
		//l1.setBounds(100,200,100,40);
		l1.setBounds(90,300,200,40);
		l1.setFont(new Font("Arial",Font.BOLD,15));
		l1.setForeground(Color.white);



		tf1=new JTextField(40);
		//tf1.setBounds(300,200,200,30);
		tf1.setBounds(300,300,200,30);


		b1=new JButton("Extract here");
		b1.setBounds(150,400,200,30);


		c.add(ta);
		c.add(l1);
		c.add(tf1);
		c.add(b1);
		tf1.addActionListener(this);
		b1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Extract here"))
		{
			unpack();
			JOptionPane.showMessageDialog(this,"unpack successfully");
		}

	}
	public void unpack()
	{
		int length=0,i=0,j=0;
		try
		{
			FileInputStream is=new FileInputStream(tf1.getText());
			byte header[]=new byte[100];
			byte buff[]=new byte[1024];

			while((length=is.read(header,0,100))>0)
			{	
				String s=new String(header);
				String str[]=s.split("\\s");;
				String name=str[0];
				int len=Integer.parseInt(str[1]);
				byte arr[]=new byte[len];	
				FileOutputStream os=new FileOutputStream(name);
				is.read(buff,0,len);
				os.write(buff,0,len);
				os.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String arg[])
	{
		Pframe3 p=new Pframe3();
		p.setTitle("Marvellous-packing unpacking");
		p.setSize(500,500);
		p.setVisible(true);
	}
}
