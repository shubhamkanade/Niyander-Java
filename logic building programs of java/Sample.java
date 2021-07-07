import java.lang.*;
import java.util.*;

class Demo
{
	public String name;
	public int rno;
	public int marks;
	public Demo next;

	public Demo(String name,int rno,int marks)
	{
		this.name=name;
		this.rno=rno;
		this.marks=marks;
	}	
};
class Student
{
	public Demo head;

	public void Insert(String name,int rno,int marks)
	{
		Demo newn=new Demo(name,rno,marks);

		if(head==null)
		{
			head=newn;		
		}
		else
		{	
			newn.next=head;
			head=newn;
		}	
	}
	public void Display()
	{	
		Demo temp=head;
		while(temp!=null)	
		{
			System.out.println(temp.name);
			System.out.println(temp.rno);
			System.out.println(temp.marks);
			temp=temp.next;
			System.out.println();
		}
	}
	public boolean Search(int rno)
	{
		Demo temp=head;
		 //System.out.println(head);
		while(temp!=null)
		{
			if(head.rno==rno)
				break;
			temp=temp.next;
		}
		//System.out.println(head);
		if(temp==null)
			return false;
		else
			return true;		
	}
	public void Delete(int rno)
	{
		Demo temp=head;
		Demo deletenode;
		while(temp.next!=null)
		{
			if(temp.next.rno==rno)
				{
				break;
				}
				temp=temp.next;	
		}
		if(temp.next==null)
			System.out.println("THere is no such stduent");	
			else
			{
				deletenode=temp.next;
				temp.next=deletenode.next;
				System.out.println("node deleted successfully");
			}	
	}
	public void Update(int rno)
	{
		Demo temp=head;
		
		while(temp!=null)
		{
			if(temp.rno==rno)
				break;
			temp=temp.next;

		}
		if(temp==null)
		{
			System.out.println("roll number is not found");
			return;
		} 
		Scanner sobj=new Scanner(System.in);
	
		System.out.println("Enter roll no");
		temp.rno=sobj.nextInt();
	
		System.out.println("Enter name");
		temp.name=sobj.next();
		
		System.out.println("Enter marks");
		temp.marks=sobj.nextInt();			
			
		System.out.println("Updataed successfully");
	}
}
class Sample
{
	public static void main(String arg[])
	{
		Student s=new Student();
		s.Insert("shubham",3,324);
		s.Insert("Swapnil",6,453);
		s.Insert("saurabh",8,543);
		s.Display();
		if(s.Search(5)==true)
			System.out.println("Student with roll no 3 found");
		else
			System.out.println("Student is not found");
		s.Delete(3);
		s.Display();
		s.Update(8);
	s.Display();	
	}
}
