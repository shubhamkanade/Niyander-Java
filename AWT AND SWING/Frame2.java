import java.awt.*;
import java.awt.event.*;

class Frame2 extends Frame implements ActionListener
{
	Button b1;
	Frame2()
	{
		setLayout(new FlowLayout());

		//Create the Button
		b1=new Button("back");

		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//if(ae.getSource()==b1)
		//Removes the memory from memory
		this.dispose();
	}
}
