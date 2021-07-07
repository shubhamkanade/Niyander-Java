import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Mymenu extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file,edit,font;
	JMenuItem op,sa,co,pa,f1,f2;
	Mymenu()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());

		mb=new JMenuBar();

		c.add("North",mb);

		//Create Jmenu items
		file=new JMenu("File");
		edit=new JMenu("Edit");
		//add  to the JMenubar
		mb.add(file);
		mb.add(edit);

		//Crate JMenuItem and add to the JMenuBar
		op=new JMenuItem("open");
		sa=new JMenuItem("save");
		co=new JMenuItem("copy");
		pa=new JMenuItem("paste");

		//add this item to menu 
		file.add(op);
		file.add(sa);
		edit.add(co);
		edit.add(pa);

		//create a submenu font and add it to the file menu
		font=new JMenu("Font");
		file.add(font);

		f1=new JMenuItem("arIAL");
		f2=new JMenuItem("Times New Roman");

		font.add(f1);
		font.add(f2);
	}
		public void actionPerformed(ActionEvent ae)
		{}
	
	public static void main(String arg[])
	{
		Mymenu mm=new Mymenu();
		mm.setSize(400,400);
		mm.setVisible(true);
		mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}

