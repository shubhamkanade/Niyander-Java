import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

class JTableDemo extends JFrame
{
	JTableDemo()
	{
		Vector data=new Vector();

		Vector row=new Vector();

		row.add("Rama Rao");
		row.add("Analyst");
		row.add("40000.00");

		data.add(row);
			
		row=new Vector();
		row.add("Shubham kande");
		row.add("programmer");
		row.add("700000.00");
		data.add(row);
		
		row=new Vector();
		row.add("vinaya devi");
		row.add("programmer");
		row.add("70000.00");

		data.add(row);
		Vector cols=new Vector();
		cols.add("name");
		cols.add("designation");
		cols.add("salary");

		//do not add column name to table

		JTable tab=new JTable(data,cols);
		//data represtens the data of tabe in the form two dimensional array
		//columnname are 1-d array
		tab.setBorder(BorderFactory.createLineBorder(Color.green,2));

		tab.setFont(new Font("Arial",Font.BOLD,25));
		tab.setRowHeight(30);
		JTableHeader head=tab.getTableHeader();

		Container c=getContentPane();

		c.setLayout(new BorderLayout());

		c.add("North",head);
		c.add("Center",tab);
	}
	public static void main(String arg[])
	{
		JTableDemo demo=new JTableDemo();
		demo.setSize(400,400);
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

