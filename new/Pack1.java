import java.io.*;
import java.lang.*;

class Pack1
{
	public static void main(String arg[])throws Exception
	{
		FileReader fr=null;
		String str="Demo.txt Hello.txt New.txt";
		String arr[]=str.split(" ");
		int length=arr.length;
		FileWriter fw=new FileWriter("Packing.txt");
		int no=0,i=0;
		while(length!=0)
		{
			no=0;
			fr=new FileReader(arr[i]);
			    File f=new File(arr[i]);
				fw.write(arr[i]);
				fw.write("  ");
				fw.write(f.length()+"");
				fw.write("\n");
			while((no=fr.read())!=-1)
			{
				fw.write((char)no);
				
			}
			i++;
			length--;
		}
		fr.close();
			fw.close();
	}
}
