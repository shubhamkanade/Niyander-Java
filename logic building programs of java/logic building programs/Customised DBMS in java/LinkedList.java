package MarvellousCollection;

public class LinkedList
{
	public Node Head=null;
	public int count=0;

	//insert into student values("abc",81);

	public void InsertFirst(String name,String address,int marks)
	{

		//initialise a node 
		Node newn=new Node(name,address,marks);
		newn.next=null;

		if(newn==null)
		{
			Head=newn;
		}
		else
		{
			newn.next=Head;
			Head=newn;
		}
		count++;

	}

	//selet * from student
	public void DisplayAll()
	{
		Node temp=Head;
		while(temp!=null)
		{
			System.out.println("Roll no :"+temp.Rno);
			System.out.println("name is :"+temp.Name);
			System.out.println("Address is  :"+temp.Address);
			System.out.println("Marks is:"+temp.Marks);
			temp=temp.next;
		}


	}

	//select * from student where name='ABC';

	public void DisplaySpecificName(String name)
	{
		Node temp=Head;

		while(temp!=null)
		{
			if(temp.Name.equals(name))
			{
				System.out.println("Roll no :"+temp.Rno);
				System.out.println("name is :"+temp.Name);
				System.out.println("Address is  :"+temp.Address);
				System.out.println("Marks is:"+temp.Marks);
			}
			temp=temp.next;

		}
	}
	//select * from student where address='pune'

	public void DisplaySpecificAddress(String address)
	{
		Node temp=Head;

		while(temp!=null)
		{
			if(address.equals(temp.Address))
			{
				System.out.println("Roll no :"+temp.Rno);
				System.out.println("name is :"+temp.Name);
				System.out.println("Address is  :"+temp.Address);
				System.out.println("Marks is:"+temp.Marks);
			}
			temp=temp.next;

		}

	}
	//sum
	public int Sum()
	{
		int sum=0;
		Node temp=Head;

		while(temp!=null)
		{
			sum=sum+temp.Marks;
			temp=temp.next;
		}

		return sum;
	}

	//Avarage
	public int Avg()
	{
		int iSum=0;
		Node temp=Head;

		while(temp!=null)
		{
			iSum=iSum+temp.Marks;
			temp=temp.next;
		}

		return (iSum/count);
	}

	//min
	public int Min()
	{
		int iMin=0;
		Node temp=Head;

		if(Head!=null)
		{
			iMin=Head.Marks;
		}
		else
		{
			return -1;
		}
		while(temp!=null)
		{
			if(temp.Marks<iMin)
			{
				iMin=temp.Marks;
			}
			temp=temp.next;
		}

		return iMin;
	}

	//max
	public int Max()
	{
		int iMax=0;
		Node temp=Head;

		if(Head!=null)
		{
			iMax=Head.Marks;
		}
		else
		{
			return -1;
		}

		while(temp!=null)
		{
			if(temp.Marks>iMax)
			{
				iMax=temp.Marks;
			}
			temp=temp.next;
		}

		return iMax;
	}
	
	


}
