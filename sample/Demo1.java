import java.awt.*;
class Demo1
{
	public static void main(String str[])
	{
		Frame fobj=new Frame("demo");

		fobj.setSize(500,500);

		fobj.setVisible(true);

		Button bobj1=new Button("ok");

		Button bobj2=new Button("cancel");

		fobj.add(bobj1);
		fobj.add(bobj2);

		bobj1.setBounds(100,100,50,50);
		bobj2.setBounds(100,150,50,50);
	}
}

