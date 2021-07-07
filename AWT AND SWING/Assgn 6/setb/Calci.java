import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calci extends JFrame implements ActionListener
{
        private JTextField t1;
        private JButton b[],b1;
        private JPanel p1,p2;
        StringBuffer s1=new StringBuffer();
        double n1,n2;
        char ch;
        public Calci(String s)
        {
                p1=new JPanel();
                p2=new JPanel();
                t1=new JTextField(25);
                b1=new JButton("Reset");
                String str[]={"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
                b=new JButton[str.length];
                for(int i=0;i<str.length;i++)
                {
                        b[i]=new JButton(str[i]);
                }
                p1.setLayout(new BorderLayout());
                p1.add(t1,BorderLayout.NORTH);
                p1.add(b1,BorderLayout.EAST);

                p2.setLayout(new GridLayout(4,4));
                b1.addActionListener(this);
                for(int i=0;i<b.length;i++)
                {
                        p2.add(b[i]);
                        b[i].addActionListener(this);
                }
                setLayout(new BorderLayout());
                add(p1,BorderLayout.NORTH);
                add(p2,BorderLayout.CENTER);
        }
        public void actionPerformed(ActionEvent ae)
        {
                if(ae.getSource()==b1)
                {
                        n1=n2=0;
                        ch=' ';
                        t1.setText(" ");
                }
                for(int i=0;i<b.length;i++)
                        if(ae.getSource()==b[i])
                        {
                                String s=b[i].getActionCommand();
                                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                {
                                        ch=s.charAt(0);
                                        n1=Double.parseDouble(new String(s1));
                                        s1.replace(0,s1.length()," ");
                                }
                                else
                                        if(s.equals("."))
                                        {
                                                s1.append(".");
                                                        String s22=new String(s1);
                                                t1.setText(s22);
                                        }
                                        else
                                                if(s.equals("="))
                                                {
                                                        double res=0;
                                                        n2=Double.parseDouble(new String(s1));
                                                        if(ch=='+')
                                                                res=n1+n2;
                                                        else
                                                                if(ch=='-')
                                                                        res=n1-n2;
                                                                else
                                                                        if(ch=='*')
                                                                                res=n1*n2;
                                                                        else
                                                                                if(ch=='/')
                                                                                        res=n1/n2;
                                                        t1.setText(new Double(res).toString());
                                                        s1.replace(0,s1.length()," ");
                                                        n1=res;
                                                    res=0;
                                                        ch=' ';
                                                }
                                                else
                                                {
                                                        for(int j=0;j<=b.length;j++)
                                                                if(s.equals(new Integer(j).toString()))
                                                                {
                                                                        s1.append(new Integer(j).toString());
                                                                        String s22=new String(s1);
                                                                        t1.setText(s22);
                                                                }
                                                }
                        }
        }



        public static void main(String args[])
        {
                Calci c=new Calci("Simple Calculator");
                c.setSize(300,300);
                c.setVisible(true);
                c.setLocation(500,200);
                c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }
}

