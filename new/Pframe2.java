import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import java.io.*;
public class Pframe2 extends JFrame implements ActionListener
{
	Container c;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2;
	JButton b1;
	JTextArea ta;
	JPanel p1,p2;
	Box h1,v1;
	Pframe2()
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

		l1=new JLabel("directory name");
		//l1.setBounds(100,200,100,40);
		l1.setBounds(90,300,200,40);
		l1.setFont(new Font("Arial",Font.BOLD,15));
		l1.setForeground(Color.white);



		tf1=new JTextField(40);
		//tf1.setBounds(300,200,200,30);
		tf1.setBounds(300,300,200,30);


		l2=new JLabel("Enter destination file");
		//l2.setBounds(100,300,200,30);
		l2.setBounds(100,400,200,30);
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l2.setForeground(Color.white);

		tf2=new JTextField(50);
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
			pack();
			JOptionPane.showMessageDialog(this,"Packing successfully");
		} 

	}
	public void pack()
	{
		int len,no=0;
		FileInputStream io=null;
		FileOutputStream os=null;
		try
		{
			File fd=new File(tf1.getText());
			File[] list=fd.listFiles();


			os=new FileOutputStream(tf2.getText());
			for(int i=0;i<list.length;i++)
			{
				io=new FileInputStream(list[i]);
				File f=new File(list[i]+"");
				byte buffer[]=new byte[1024];
				byte temp[]=new byte[100];
				//os=new FileOutputStream("/home/lenovo/Niyander java/File handling in java/hello/Demo/Packing.txt");
				// 1 packing.txt
				String first=f.getName()+" "+f.length();
				//System.out.println(first);	
				for(int j=first.length();j<100;j++)
					first=first+" " ;								
				//System.out.print(str[0]);
				temp=first.getBytes();

				os.write(temp);
				while((len=io.read(buffer))>0)
					os.write(buffer,0,len);
				while((no=io.read())!=-1)
				{
					os.write((char)no);

				}


				//os.close();
				//io.close();
			}
			os.close();
			io.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String arg[])
	{
		Pframe2 p=new Pframe2();
		p.setTitle("Marvellous-packing unpacking");
		p.setSize(500,500);
		p.setVisible(true);
	}
}

