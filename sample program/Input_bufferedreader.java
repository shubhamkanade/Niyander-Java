import java.io.*;
public class Input_bufferedreader
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,sum=0,n,i;
		float avg;
		System.out.println("enter how many numbers");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter the numbers :");
		for(i=0;i<n;i++)
		{
			//num=Integer.parseInt(br.readLine());
			sum+=num;
		}
		avg=sum/n;
		System.out.println("sum is="+sum+"avg is="+avg);
	}
}
