import java.io.*;

class Arr1
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("how many subjects?");
		int n=Integer.parseInt(br.readLine());

		int [] marks=new int[n];

		//store elements into array
		for(int i = 0;i < n;i++)
		{
			System.out.print("Enter marks :");
			marks[i] = Integer.parseInt(br.readLine());
		}

		//store total into array
		int tot=0;
		for(int i=0;i<n;i++)
			tot += marks[i];

		//Display the total
		System.out.println("The total is "+tot);

		//Find percentage
		float per=(float)tot/n;

		System.out.println("The percentage is "+per);
	}
}



