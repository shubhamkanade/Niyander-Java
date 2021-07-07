import java.io.*;
import java.util.*;

class NODE
{
	public int rno;
	public int marks;
	public String name;
	//public int marks;
	public NODE next;
	{
		next=null;
	}
	public NODE()
	{
		rno=0;
		marks=0;
		name=null;
	}
	public NODE(int rno,int marks,String name)
	{
		this.rno=rno;
		this.marks=marks;
		this.name=name;
	}
}//End of NODE
class Student
{
	public NODE head;
	public Student()
	{
		head=null;
	}
	public boolean insert(int rno,int marks,String name)
	{
		NODE newn=new NODE(rno,marks,name);
		if(head==null)
			head=newn;
		else
		{
			newn.next=head;
			head=newn;
		}
		return true;
	}//End of insert
	public void display()
	{
		NODE temp=head;

		while(temp!=null)
		{
			System.out.println(temp.rno);
			System.out.println(temp.marks);
			System.out.println(temp.name);
			System.out.println();
			temp=temp.next;
		}

	}
	public void delete(int no) //delete by rollnumber
	{
		NODE temp=head;
		NODE deletenode=null;
		if(temp.rno==no)
			head=head.next;

		while(temp.next!=null)
		{
		if(temp.next.rno==no)
		{
			System.out.println("Information of student");
			System.out.println(temp.next.rno);
			System.out.println(temp.next.marks);
			System.out.println(temp.next.name);
			break;
		}
			temp=temp.next;;
		}

		deletenode=temp.next;
		temp.next=deletenode.next;
		System.out.println("node deleted successfully");

	

	}
	public void update(int rno)//update by rollnumber
	{
	
		NODE temp=head;
		while(temp!=null)
		{

		if(temp.rno==rno)
		break;
		temp=temp.next;
		}

		Scanner s=new Scanner(System.in);
		System.out.println("Enter roll number");
		temp.rno=s.nextInt();
		System.out.println("Enter marks");
		temp.marks=s.nextInt();
		System.out.println("Enter name");	
		temp.name=s.nextLine();

		System.out.println("Update Successful");
		
	}
	public void search(int rno) //search by roll number
	{
		NODE temp=head;
		while(temp!=null)
		{	
			if(temp.rno==rno)
				break;
			temp=temp.next;
		}
		if(temp==null)
			System.out.println("There is no such student");
		else
		{
			System.out.println(temp.rno);	
			System.out.println(temp.marks);
			System.out.println(temp.name);
		}
	}
	public void search(String str) //search by name
	{
		NODE temp=head;
		while(temp!=null)
		{
			if(temp.name.equals(str))
			{
				break;
			}
			temp=temp.next;
		}
		if(temp==null)
			System.out.println("There is no such student");
		else
			System.out.println(temp.rno);
		System.out.println(temp.marks);
		System.out.println(temp.name);

	}
	public void maximum()
	{
		if(head==null)
			return;
		NODE temp=head;
		NODE maxref=null;
		int max=0;

		while(temp!=null)
		{
			if(temp.marks>max)
			{
				max=temp.marks;
				maxref=temp;
			}
			temp=temp.next;
		}		
		if(maxref!=null)
		{
			System.out.println("information of maximum student");
			System.out.println(maxref.rno);	
			System.out.println(maxref.marks);
			System.out.println(maxref.name);
		}
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Student sobj1=new Student();
		Student sobj2=new Student();
		Student sobj3=new Student();
		Student sobj4=new Student();

		sobj1.insert(11,200,"abc");
		sobj1.insert(12,300,"def");
		sobj1.insert(14,400,"d");
		sobj1.insert(12,300,"e");

		sobj1.display();
		sobj2.insert(1,40,"n");
		sobj2.insert(3,60,"j");
		sobj2.display();

		sobj1.search(11);
		sobj1.search(5);
		sobj1.maximum();
		sobj1.delete(12);
		sobj1.display();
	}
}
