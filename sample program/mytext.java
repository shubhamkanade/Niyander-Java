import java.awt.*;
import java.awt.event.*;
class mytext extends Frame implements ActionListener
{
	TextField name,pass;

	mytext()
	{
		setLayout(new FlowLayout());

		Label n=new Label("name: ",Label.RIGHT);
		Label p=new Label("pass word: ",Label.RIGHT);

		name=new TextField(20);
		pass=new TextField(20);

		pass.setEchoChar('*');

		Font f=new Font("Arial",Font.PLAIN,25);
		name.setFont(f);

		add(n);
		add(name);
		add(p);
		add(pass);
		name.addActionListener(this);
		pass.addActionListener(this);			
	addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent we)
				{
				System.exit(0);
				}
				});

	}

		public void actionPerformed(ActionEvent ae)
{
Graphics g=this.getGraphics();


g.drawString("name: "+name.getText(),10,200);
g.drawString("pass: "+pass.getText(),10,240);
}
	
		











	public static void main(String args[])
	{
		mytext mt=new mytext();
		mt.setTitle("my text field");
		mt.setSize(400,400);
		mt.setVisible(true);
	}
}
