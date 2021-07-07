import java.awt.*;
import java.awt.event.*;

class Mylist extends Frame implements ItemListener
{
        int[] msg;
	List lst;
        Mylist()
        {
                setLayout(new FlowLayout());

		lst=new List(4,false);
		

                lst=new List();
                lst.add("English");
                lst.add("Hindi");
                lst.add("Telugu");
                lst.add("Sanskrit");
               	lst.add("French");

                add(lst);

                lst.addItemListener(this);

                addWindowListener(new WindowAdapter()
                                {
                                public void windowClosing(WindowEvent e)
                                {
                                System.exit(0);
                                }
                                });

        };
        public void itemStateChanged(ItemEvent ae)
	       {
                repaint();
        }

        public void paint(Graphics g)
        {
               g.drawString("Selected Language : ",100,200);
		msg=lst.getSelectedIndexes();
		for(int i=0;i<msg.length;i++)
		{
			String item=lst.getItem(msg[i]);
			g.drawString(item,100,220+i*20);
		}
		
        }
        public static void main(String arg[])
        {
                Mylist m=new Mylist();
                m.setTitle("Choice");
                m.setSize(400,400);
                m.setVisible(true);
        }
}

