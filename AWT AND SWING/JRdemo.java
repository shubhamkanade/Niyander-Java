import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JRdemo extends JFrame implements ActionListener,ItemListener
{
	JTextField jtf,jtf1;
	JRadioButton jrb1,jrb2,jrb3;
	JCheckBox jcb1,jcb2,jcb3;
	public JRdemo()
	{
		setLayout(new FlowLayout());

		ButtonGroup bg=new ButtonGroup();
		
		
		jrb1=new JRadioButton("FY");
		jrb1.addActionListener(this);
		bg.add(jrb1);
		add(jrb1);
	
		jrb2=new JRadioButton("SY");
		jrb2.addActionListener(this);
		bg.add(jrb2);
		add(jrb2);


		jrb3=new JRadioButton("TY");
		jrb3.addActionListener(this);
		bg.add(jrb3);
		add(jrb3);
		
		jtf=new JTextField(5);
		add(jtf);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jcb1=new JCheckBox("Music");
		jcb1.addItemListener(this);
		bg.add(jcb1);
		add(jcb1);

		jcb2=new JCheckBox("Dance");
		jcb2.addItemListener(this);
		bg.add(jcb2);
		add(jcb2);

		jcb3=new JCheckBox("Sports");
		jcb3.addItemListener(this);
		bg.add(jcb3);
		add(jcb3);

		jtf1=new JtextField(30);
		add(jtf1);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(Jfarme.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		jtf.setText(ae.getActionCommand());
		}

		public static void main(String[] args)
		{
			new JRdemo();
		}
	}
