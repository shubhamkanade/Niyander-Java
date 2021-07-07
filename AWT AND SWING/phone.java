import java.util.*;
import java.io.*;
 
class Phone 
{

	void searchNumber(RandomAccessFile raf,String person) throws Exception
	{	
		raf.seek(0);
		String data = null;
		int flag = 0;
		
		while( (data = raf.readLine()) != null )
		{
			String data2[] = data.split("\\s");
				
			if(data2[0].equals(person))
			{	
				System.out.println(data);
				flag = 1;				
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Phone number not found");
		}

	}

	void addNumber(RandomAccessFile raf,String info) throws Exception
	{
		 raf.seek(raf.length());
		 raf.writeBytes(info);
		 raf.writeBytes("\n");		
	}
	public static void main(String args[]) throws Exception
	{

		int ch;
		try
		{	
			RandomAccessFile raf = new RandomAccessFile("phone.txt","rw");
			Phone pobj = new Phone();
			Scanner sc = new Scanner(System.in);
			

			do
			{
				System.out.println("\n 1. Search phone number \n 2. Add phone number  \n 3.Exit");
				System.out.println("Enter the choise");
				ch = sc.nextInt();
		
				switch(ch)
				{
			
					case 1: 
						String person;
						System.out.println("Enter the name of person you want to search");
						person = sc.next();
						
						pobj.searchNumber(raf,person);				
					
						break;
					case 2:
						
						System.out.println("Enter the name of person");
						String name = sc.next();
						System.out.println("Enter the ph number");
						String ph = sc.next();
						String info =  name +" "+ph; 
						
						pobj.addNumber(raf,info);
						
						break;
					case 3:
						 System.out.println("Exit ..");
						
						break;
			
				}	
			}while(ch != 3);
			
		raf.close();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
}


