import java.awt.*;
import java.awt.event.*;

class Mytext extends Frame implements ActionListener
{
	TextField name,pass;
	Mytext()
	{
		setLayout(new FlowLayout());

		Label n=new Label("name: ",Label.LEFT);
		Label p=new Label("pass: ",Label.LEFT);

		name=new TextField(20);
		pass=new TextField(20);
		pass.setEchoChar('*');

		name.setBackground(Color.yellow);
		name.setForeground(Color.red);
		name.setFont(new Font("Arial",Font.PLAIN,25));

		//add the textfield and labels into frame
		add(n);
		add(name);
		add(p);
		add(pass);

		name.addActionListener(this);
		pass.addActionListener(this);

		addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});
	}//end of constructor

	public void  actionPerformed(ActionEvent ae)
	{
		Graphics g=this.getGraphics();

		g.drawString("Name :"+name.getText(),10,200);
		g.drawString("Pass :"+pass.getText(),10,240);
	
	}
	public static void main(String arg[])
	{	
		Mytext m=new Mytext();
		m.setTitle("My Text FIELD");
		m.setSize(400,400);
		m.setVisible(true);
	}
} 
