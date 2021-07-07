import java.lang.*;
import java.util.*;

class seta2
{
	public int rno;
	public String name;
	public double percentage;
	static Scanner sobj=new Scanner(System.in);
	public seta2()
	{
		rno=0;
		name="abc";
		percentage=0.0;
	}
	public seta2(int rno,String name,double percentage)
	{
		this.rno=rno;
		this.name=name;
		this.percentage=percentage;
	}
	void sortstudent(seta2 s[],int n)
	{
		seta2 temp;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(s[j].percentage>s[j+1].percentage)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
	}
	void accept()
	{
		System.out.println("enter the rollno,name,percentage");
		rno=sobj.nextInt();
		name=sobj.next();
		percentage=sobj.nextDouble();
	}
	void display()
	{
		System.out.println("roll no:"+rno);
		System.out.println("roll no:"+name);
		System.out.println("roll no:"+percentage);
	}
	public static void main(String arg[])
	{
		int n,i;
		System.out.println("enter the no of objects");
		n=sobj.nextInt();
		seta2 s[]=new seta2[n];
		for(i=0;i<n;i++)
		{
			s[i]=new seta2();
			s[i].accept();
		}
		System.out.println("after sorting elements");
		for(i=0;i<n;i++)
		{
			s[i].sortstudent(s,n);
			s[i].display();
		}
	}
}


















