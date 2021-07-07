import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

class valid extends JFrame {
	
	JLabel l;
	JLabel Login;
	JLabel passl;
	JTextField username;
	JTextField password;
	JButton ok;
	JButton cancel;
	JPanel textf;
	
	String urname = "anuja";
	String pas = "123";
	
	
	
	
	public valid()  {
		
		
		l = new JLabel("Status");
		Login = new JLabel("Login :");
		passl = new JLabel("Password: ");
		username = new JTextField(15);
		password = new JTextField(15);
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		textf = new JPanel();
		
		setTitle("Login screen");
		add(Login);
		add(username);
		add(passl);
		add(password);
		
		textf.add(ok);
		textf.add(cancel);
		
		add(textf , BorderLayout.AFTER_LAST_LINE);
		add(l,BorderLayout.AFTER_LAST_LINE);
	
		HandlerClass handler = new HandlerClass();
		
		ok.addActionListener(handler);
		
		
		setLayout(new FlowLayout());
		setSize(280,180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class HandlerClass implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			// TODO Auto-generated method stub
		
			if(ae.getSource() == ok) {
				
				String lusername  = username.getText();
				String lpassword  = password.getText();
				
				if(urname.equals(lusername) && pas.equals(lpassword)) {
					
					l.setText("Logged In Successfully !!");
				}
				else {
					
					l.setText("Username or Password is Wrong .");

				}
 			}
		}
		
		
		
	}
	
}


public class login {

	public static void main(String args[]) {

		new valid();
	}
	
}
