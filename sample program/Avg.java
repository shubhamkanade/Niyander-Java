import java.io.*;
public class Avg
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int num=0,sum=0,n,i;
		float avg;
		System.out.println("enter how many numbers");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter the numbers");
		for(i=0;i<n;i++)
		{
			num[i]=Integer.parseInt(br.readLine());
			sum=sum+num[i]; //sum+=num;
		}
		avg=sum/num;
		System.out.println("sum is"+sum+"\n"  +"avarage is"+avg);
	}
}
