import java.io.*;
import java.lang.*;

//Any opened stream please close it
class Filewriter
{
	public static void main(String arg[])throws Exception
	{
		File fname;
		String str="Demo.txt Hello.txt New.txt";
                FileReader fr=null;
                String arr[]=str.split(" ");
		System.out.println(arr[0]);
                int length=arr.length;	
		System.out.println(length);
                int i=0,no=0;
		    FileWriter fw=new FileWriter("Packing.txt");

                for(int j=0;j<length;j++,i++)
                {
                        fr=new FileReader(arr[i]);
			fname=new File(arr[i]);
                        if(fname.exists())
                        {
                        //fo.write(
                        fw.write(fname.getName()+"");
                        fw.write("   ");
                        fw.write(fname.length()+"");
                        fw.write("\n");
                        while((no=fr.read())!=-1)
                        fw.write(no);
                        }
                        no=0;
		}

		//length=arr.length;
		//String str;
		//fr=new FileReader(arr[0]);
		/*FileWriter fw=new FileWriter("Packing.txt");
		while(length!=0)
                {

                        fname=new File(arr[i]);
			if(fname.exists())
			{
                        //fo.write(
                        fw.write(fname.getName()+"");
                        fw.write("   ");
                        fw.write(fname.length()+"");
                        fw.write("\n");
			while((no=fr.read())!=-1)
			fw.write(no);
                        i++;
                        length--;
			}
			no=0;

                }*/
	System.out.println("Write successfully");	
		/*if(f.exists())
		{
			
			fw.write(f.getName());
			fw.write("     ");
			fw.write(f.length()+"");
			fw.write("\n");	
			while((no=fr.read())!=-1)
			{
				fw.write((char)no);
			}
		}*/
		//fw.write("educating for better tomorrow");
		fw.close();
		fr.close();

	}
}

