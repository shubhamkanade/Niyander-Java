//This is second version of button program in which instead of Bounds we are using layout concept and instead of get
//ActionCommand() we are uisng getSource() method
//FlowLayout it is the simplest layout of all
//The default is BorderLayout
import java.awt.*;
import java.awt.event.*;

class Mybuttons1 extends Frame implements ActionListener
{
        Button b1,b2,b3;

        Mybuttons1()
        {
                setLayout(new FlowLayout());

                b1=new Button("Yellow");
                b2=new Button("Blue");
                b3=new Button("Pink");

                /*b1.setBounds(100,100,70,40);
                b2.setBounds(100,160,70,40);
                b3.setBounds(100,220,70,40);*/

                add(b1);
                add(b2);
                add(b3);

                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);

                addWindowListener(new WindowAdapter()
                                {
                                public void windowClosing(WindowEvent e)
                                {
                                System.exit(0);
                                }
                                });

        }//end of constructor

        public void actionPerformed(ActionEvent ae)
        {
                String str=ae.getActionCommand();

                if(ae.getSource()==b1) this.setBackground(Color.yellow);
                if(ae.getSource()==b2) this.setBackground(Color.blue);
                if(ae.getSource()==b3) this.setBackground(Color.pink);
        }
        public static void main(String arg[])
        {
                Mybuttons1 mb=new Mybuttons1();
                mb.setSize(400,400);
                mb.setTitle("My buttons");
                mb.setVisible(true);
        }
}

