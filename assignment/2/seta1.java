import java.util.*;
import java.lang.*;

class seta1
{
	public int rno;
	public String name;
	public double percentage;
	static int count;
	static Scanner s=new Scanner(System.in);
	public seta1()
	{
		rno=0;
		name="ab";
		percentage=0.0;
	}
	public seta1(int rno,String name,double percentage)
	{
		this.rno=rno;
		this.name=name;
		this.percentage=percentage;
		count++;
	}
	void display()
	{
		System.out.println("roll no:"+rno+" "+ "name is:"+name+" "+ "percentage is:"+percentage);
	}
	public static void main(String arg[])
	{
		seta1 sobj=new seta1(1,"shubham",65.00);
		sobj.display();
		System.out.println("count is:"+count);
		seta1 sobj1=new seta1(2,"saurabh",70.00);
		sobj1.display();
		System.out.println("count is:"+count);
	}
}












