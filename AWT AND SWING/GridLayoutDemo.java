import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;

class GridLayoutDemo extends JFrame 
{
        Container c;
        GridLayout grid;
        JButton b1,b2,b3,b4;
        GridLayoutDemo()
        {
                c=getContentPane();

                grid=new GridLayout(2,3,50,50);

                c.setLayout(grid);

                b1=new JButton("Button1");
                b2=new JButton("button2");
                b3=new JButton("button3");
                b4=new JButton("button4");

                c.add(b1);
                c.add(b2);
                c.add(b3);
                c.add(b4);

                /*b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);*/
	}
	    public static void main(String arg[])
        {
                GridLayoutDemo cld=new GridLayoutDemo();
                cld.setSize(400,400);
                cld.setVisible(true);
                cld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}

