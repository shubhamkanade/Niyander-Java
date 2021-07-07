import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class maths extends JFrame implements ActionListener
{
	private JMenuBar b1;
	private JMenu m1,m2,m3,m4;
	private JMenuItem f1,f2,f3,f4,f5,f6,f7,f8,f9;
	private JRadioButtonMenuItem r1,r2;
	private JTextArea t1;
	private JTextField t2;
	private JFileChooser jc;
	private File fi;
	private int arr[]=new int[10];
	private	int sum=0;
	private int cnt=0;
	public maths()
	{
		b1=new JMenuBar();
		m1=new JMenu("File");
		m2=new JMenu("Compute");
		m3=new JMenu("Operations");
		m4=new JMenu("Sort");
		f1=new JMenuItem("Load");
		f2=new JMenuItem("Save");
		f3=new JMenuItem("Exit");
		f4=new JMenuItem("Sum");
		f5=new JMenuItem("Average");
		f6=new JMenuItem("Maximum");
		f7=new JMenuItem("Minimum");
		f8=new JMenuItem("Median");
		f9=new JMenuItem("Search");
		r1=new JRadioButtonMenuItem("Ascending");
		r2=new JRadioButtonMenuItem("Descending");
		t1=new JTextArea(10,5);
		t2=new JTextField(20);
		this.setLayout(new BorderLayout());
		m4.add(r1);
		m4.add(r2);
		m3.add(f9);
		m3.add(m4);
		m2.add(f4);
		m2.add(f5);
		m2.add(f6);
		m2.add(f7);
		m2.add(f8);
		m1.add(f1);
		m1.add(f2);
		m1.addSeparator();
		m1.add(f3);
		b1.add(m1);
		b1.add(m2);
		b1.add(m3);
		this.add(b1,BorderLayout.NORTH);
		this.add(t1,BorderLayout.CENTER);
		this.add(t2,BorderLayout.SOUTH);
		f1.addActionListener(this);	
		f2.addActionListener(this);	
		f3.addActionListener(this);	
		f4.addActionListener(this);	
		f5.addActionListener(this);	
		f6.addActionListener(this);	
		f7.addActionListener(this);	
		f8.addActionListener(this);	
		f9.addActionListener(this);	
		r1.addActionListener(this);	
		r2.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==f1)
		{
                        JFrame f=new JFrame("Choose File");
                        jc=new JFileChooser();
                        jc.setCurrentDirectory(new File("."));
                        jc.showOpenDialog(f);
                        fi=jc.getSelectedFile();
			String s="",str="";
			int i=0;
                                try
                                {
					BufferedReader br=new BufferedReader(new FileReader(fi));
					while((s=br.readLine())!=null)
					{
						arr[i++]=Integer.parseInt(s);
					}
					for(int j=0;j<arr.length-2;j++)
					{
						str=str+arr[j]+" ";
					}
					t1.setText(str);
                                }
                                catch(Exception ex)
                                {t1.setText("Opening File Error");
                                }

		}
		else if(e.getSource()==f2)
		{
			try
			{
				BufferedWriter bw=new BufferedWriter(new FileWriter(fi));
				for(int j=0;j<arr.length-2;j++)
				{
					bw.write(arr[j]+"\n");
				}
			}
                                catch(Exception ex)
                                {t1.setText("Opening File Error");
                                }


		}
		else if(e.getSource()==f3)	
		{
			System.exit(0);
		}
		else if(e.getSource()==f4)
		{
			for(int j=0;j<arr.length-2;j++)
			{
				sum=sum+arr[j];
			}
			t2.setText("Sum of integers is "+sum);
		}
		else if(e.getSource()==f5)
		{
			for(int j=0;j<arr.length-2;j++)
                        {
                                sum=sum+arr[j];cnt++;
                        }
			float avg=sum/cnt;
			t2.setText("The average is "+avg);
		}
		else if(e.getSource()==f6)
		{
			int max=0;
                        for(int j=0;j<arr.length-2;j++)
                        {
				if(max<arr[j])
					max=arr[j];
                        }
                        t2.setText("Maximum is "+max);
		}
                else if(e.getSource()==f7)
                {
                        int min=100;
                        for(int j=0;j<arr.length-2;j++)
                        {
                                if(min>arr[j])
                                        min=arr[j];
                        }
                        t2.setText("Minimum is "+min);
                }
		else if(e.getSource()==f8)
		{
			int t;
			int temp[]=new int[10];
			for(int j=0;j<arr.length-2;j++)
                        {
                                cnt++;
				temp[j]=arr[j];
                        }
			for(int pass=1;pass<=arr.length-3;pass++)
			{
				for(int j=0;j<=arr.length-pass-3;j++)
				{
					if(arr[j]>arr[j+1])
					{
						t=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=t;
					}
				}
			}
			int med;
			if(cnt%2==0)
			{
				med=arr[(cnt/2)+1];
			}
			else
			{
				med=arr[cnt/2];
			}
			t2.setText("Median is "+med);
		}
		else if(e.getSource()==f9)
		{
			String s=JOptionPane.showInputDialog(null,"Enter the number to be searched : ");
			int num=Integer.parseInt(s);
                        for(int j=0;j<arr.length-2;j++)
			{
				if(arr[j]==num)
				{
					t2.setText("Number "+num+" found at "+j+"th position");
				}
			}
		}
		else if(e.getSource()==r1)
		{
			int t;
                        int temp[]=new int[10];
                        for(int j=0;j<arr.length-2;j++)
                        {
                                cnt++;
                                temp[j]=arr[j];
                        }

                        for(int pass=1;pass<=arr.length-3;pass++)
                        {
                                for(int j=0;j<=arr.length-pass-3;j++)
                                {
                                        if(arr[j]>arr[j+1])
                                        {
                                                t=arr[j];
                                                arr[j]=arr[j+1];
                                                arr[j+1]=t;
                                        }
                                }
                        }
			String s="";
                        for(int j=0;j<arr.length-2;j++)
			{
				s=s+arr[j]+" ";
			}
			t2.setText("The ascending sorted array is "+s);
		}
		if(e.getSource()==r2)
		{
                        int t;
                        int temp[]=new int[10];
                        for(int j=0;j<arr.length-2;j++)
                        {
                                cnt++;
                                temp[j]=arr[j];
                        }

                        for(int pass=1;pass<=arr.length-3;pass++)
                        {
                                for(int j=0;j<=arr.length-pass-3;j++)
                                {
                                        if(arr[j]>arr[j+1])
                                        {
                                                t=arr[j];
                                                arr[j]=arr[j+1];
                                                arr[j+1]=t;
                                        }
                                }
                        }
                        String s="";
                        for(int j=arr.length-3;j>=0;j--)
                        {
                                s=s+arr[j]+" ";
                        }
                        t2.setText("The descending sorted array is "+s);
		}	
	}
			
			
		
	public  static void main(String arg[])
	{
		maths t=new maths();
                t.setSize(400,200);
                t.setVisible(true);
                t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
		
}
