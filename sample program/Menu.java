import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

class Menu implements ActionListener
{
	JFrame f;
	JTextField t;	
	JMenuBar mb;	
	JMenu m1,m2,m3,sort;
	JMenuItem load,save,exit;
	JMenuItem sum,avg,max,min,med;
	JMenuItem search;	
	JRadioButton rb1;
	JRadioButton rb2;
	JLabel l1;
	JPanel p1;
	ButtonGroup bg;
	int arr[] = new int[50];	

	public Menu()
	{
		initialize();
		prepare();
		addlistener();
	}

	void initialize()	
	{
				
		
		f = new JFrame("My Frame");

		l1 = new JLabel("Numbers");
		t = new JTextField(20);				
		
		mb = new JMenuBar();

		m1 = new JMenu("File");
		m2 = new JMenu("Compute");
		m3 = new JMenu("Operations");

		load = new JMenuItem("Load");
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");

		sum = new JMenuItem("Sum");		
		avg = new JMenuItem("Average");
		max = new JMenuItem("Maximum");
		min = new JMenuItem("Minimum");
		med = new JMenuItem("Median");
		
		search = new JMenuItem("Search");		
		sort = new JMenu("Sort");
		
		rb1 = new JRadioButton("Ascending");
		rb2 = new JRadioButton("Descending");
		bg = new ButtonGroup();
		p1 = new JPanel();
		
	
	}

	void prepare()
	{
		
		bg.add(rb1);
		bg.add(rb2);
	
		m1.add(load);
		m1.add(save);
		m1.add(exit);

		m2.add(sum);
		m2.add(avg);
		m2.add(max);
		m2.add(min);
		m2.add(med);

		sort.add(rb1);
		sort.add(rb2);

		m3.add(search);
		m3.add(sort);	
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
				
	
		f.setLayout(new GridLayout(3,0));
		f.setJMenuBar(mb);
		f.add(p1);
		f.add(l1);		
		f.add(t);

		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	void addlistener()
	{
				
			
		load.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);

		sum.addActionListener(this);
		avg.addActionListener(this);
		max.addActionListener(this);
		min.addActionListener(this);
		med.addActionListener(this);

		search.addActionListener(this);
		
		rb1.addActionListener(this);
		rb2.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int i;
		String s = null;
		
		//Load

		if(e.getSource() == load)	
		{	
			Random r = new Random();
			
			for(i = 0 ; i < 50; i++)
			{
				arr[i] = r.nextInt(10)+20;
			
					
					if(s == null)
					{
						s =" "+arr[i];
					}
					else
					{			
						s = s + " "+arr[i];
					}
			}
			t.setText(s);
			
		}

		// Save
		else if(e.getSource() == save )
		{
			try
			{
				FileWriter fos = new FileWriter("number.txt");
				for(i=0;i<50;i++)
				{						
					fos.write(" "+arr[i]);
				}
				fos.close();
			}
			catch(Exception ex)
			{
				
			}	
	
		}
		
		//Exit
		else if(e.getSource() == exit)
		{					
			f.dispose();
		}

		// Sum
		else if(e.getSource() == sum)
		{
			int sum1 = 0;
			for(i = 0; i < 50 ; i++ )
			{
				sum1 += arr[i];
			}
			s = ""+ sum1;
			JOptionPane.showMessageDialog(f,s);	
		}
		
		//Average
		else if(e.getSource() == avg)
		{
			int sum1 = 0;
			for(i = 0; i < 50 ; i++ )
			{
				sum1 += arr[i];
			}
			sum1 /= 50;
			s = ""+ sum1;
			JOptionPane.showMessageDialog(f,s);	
		}
		
		//Median

		else if(e.getSource() == med)
		{
			int sum1 = 0;
			int j;
			int a;
			int index = 0;				
			
			for(i = 0; i < 50 ; i++ )
			{
				for(j = 0; j < 50-i-1 ; j++ )
				{
					if(arr[j] > arr[j+1])
					{
						a = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = a;
					}
					
				}		
			}

			// median = ( n + 1 ) / 2;

			index = 51/2;	
			sum1 = arr[index];		
			s = ""+ sum1;
			JOptionPane.showMessageDialog(f,s);	
		}
	
		// Maximum

		else if(e.getSource() == max)
		{
			int sum1 = 0;
			for(i = 0; i < 50 ; i++ )
			{
				if(sum1 < arr[i])
				{
					sum1 = arr[i];	
				}
			}
			s = ""+ sum1;
			JOptionPane.showMessageDialog(f,s);	
		}
		// Minimum

		else if(e.getSource() == min)
		{
			int sum1 = 1000;
			for(i = 0; i < 50 ; i++ )
			{
				if(sum1 > arr[i])
				{
					sum1 = arr[i];	
				}
			}
			s = ""+ sum1;
			JOptionPane.showMessageDialog(f,s);	
		}

		// search 
		else if(e.getSource() == search)
		{
			int sum1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the input"));
			
			for(i = 0; i < 50 ; i++ )
			{
				if(sum1 == arr[i])
				{
					sum1 = i;	
				}
			}
			s = "Number found at "+ sum1 +" position";
			JOptionPane.showMessageDialog(f,s);	
		}
		
		// ascending 
		else if(e.getSource() == rb1)
		{
			int sum1 = 0;
			int j;
			int a;
							
			
			for(i = 0; i < 50 ; i++ )
			{
				for(j = 0; j < 50-i-1 ; j++ )
				{
					if(arr[j] > arr[j+1])
					{
						a = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = a;
					}
					
				}		
			}
			s="";
			for(i = 0; i < 50 ; i++)
			{
				s = s + " "+arr[i]; 
			}
			t.setText(s);
			
						
			
				
		}
		//descending
		else if(e.getSource() == rb2)
		{
			int sum1 = 0;
			int j;
			int a;
							
			
			for(i = 0; i < 50 ; i++ )
			{
				for(j = 0; j < 50-i-1 ; j++ )
				{
					if(arr[j] < arr[j+1])
					{
						a = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = a;
					}
					
				}		
			}
			s="";
			for(i = 0; i < 50 ; i++)
			{
				s = s + " "+arr[i]; 
			}
			t.setText(s);
			
						
			
				
		}			

		
	}

	public static void main(String args[])
	{
		new Menu();		
	}
}
