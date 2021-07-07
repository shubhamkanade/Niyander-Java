package MarvellousCollection;

import java.util.*;
public class LinkedList
{
	public Node Head=null;

	public void InsertFirst(int data)
	{
		Node newn=new Node();
		newn.no=data;
		newn.next=null;

		if(Head==null)
		{
			Head=newn;
		}
		else
		{
			newn.next=Head;
			Head=newn;
		}

	}
	public void Display()
	{
		Node temp=Head;
		while(temp!=null)
		{
			System.out.println(temp.no);
			temp=temp.next;
		}

	}
	public void InsertLast(int no)
	{
		Node temp=null;
		Node newn=null;
		newn=new Node();
		newn.no=no;
		newn.next=null;

		if(Head==null)
		{
			Head=newn;
		}
		else 
		{
			temp=Head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newn;
		}


	}
	public void DeleteFirst()
	{
		if(Head==null)
		{
			return;
		}
		else
		{
			Head=Head.next;
		}

	}
	public void DeleteLast()
	{
		//Node temp;	
		if(Head==null)
		{
			return;
		}
		else if(Head.next==null)
		{
			Head=null;
		}
		else
		{
			Node temp=Head;
			while(temp.next.next!=null)
				temp=temp.next;

			temp.next=null;

		}

	}



}






































































