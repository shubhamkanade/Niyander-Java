import java.lang.*;
import java.io.*;

class Demo
{
	public static void main(String arg[]) throws Exception
	{
		FileReader fr=null;
		FileWriter fw=null;
	//	RandomAccessFile data=new  RandomAccessFile("Packing1.txt","r");
		fr=new FileReader("Packing1.txt");
		BufferedReader br=new BufferedReader(fr);
		//FileInputStream fis=new  FileInputStream("Packing1.txt");
		 //BufferedReader br=new BufferedReader(fis);
		String line=null;
		String arr[]=null;
		//int str[40]=null;
		int i=0,j=0,no=0;
		while((line=br.readLine())!=null)
		{
					
			
			arr=line.split("\\s+");
			fw=new FileWriter(arr[0]);
			
			//no=Integer.parseInt(arr[1]);
			
			System.out.println(arr[0]);
			  //System.out.println(arr[1]);
				fw.write(line);
		

			//j=data.read(no);
			//System.out.println((char)(j));
				//while((fr.read())!='\n');
				//System.out.println(line);
					/*if((i=fr.read())!=no)
					{
					System.out.println((char)i);
					}*/
				
			/*char arr1[]=new char[no];
			fr.read(arr1,0,no);
			fw.write(arr1,0,no);*/
				
				
							
			//no=0;
		}



	}
}
