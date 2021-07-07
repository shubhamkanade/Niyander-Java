package MarvellousCollection;

import java.util.*;

public class Node
{
	private static int Rcnt=1;

	public int Rno;
	public String Name;
	public String Address;
	public int Marks;
	public Node next;
	
	public Node(String name,String address,int marks)
	{
		Rno=Rcnt++;
		Name=name;
		Address=address;
		Marks=marks;
	}

}

