import java.io.*;
import java.lang.*;

class Pack_new
{
	public static void main(String arg[]) throws Exception
	{
		int length=0,i=0,len=0;
		String fname=null;
		FileInputStream is=null;
		//String str="Demo.txt Hello.txt New.txt";
		File fd=new File("/home/lenovo/Niyander java/File handling in java/hello/Demo");
		File[] list=fd.listFiles();
		String arr=list[0].getName();
		for(int k=1;k<list.length;k++)
		{
			arr+=" ";
			//System.out.println(list[i].getName());
			arr=arr+list[k].getName();
		}

		System.out.println(arr);
		String str[]=arr.split(" ");
		for(int l=0;l<str.length;l++)
		{
			is=new FileInputStream(str[l]);
			fname=str[l];

		}

		//String arr[]=str.split("\\s");

		FileOutputStream os=new FileOutputStream("/home/lenovo/Niyander java/File handling in java/hello/Demo/Packing.txt");

		byte buff[]=new byte[1024];
		byte temp[]=new byte[100];
		len=str.length;
		while(len!=0)
		{ 
			//String fname=str[];
			//FileOutputStream os=new FileOutputStream("Packing.txt");

			File f=new File(fname);
			//FileInputStream is=new FileInputStream("/home/lenovo/Niyander java/File handling in java/hello/Demo/Packing.txt",str[i]);

			String header=f.getName()+" "+f.length();

			for(int j=header.length();j<100;j++)
				header=header+" ";

			temp=header.getBytes();
			os.write(temp,0,temp.length);

			while((length=is.read(buff))>0)
				os.write(buff,0,length);

			is.close();
			len--;
			//i++;		
		}	

	}
}
