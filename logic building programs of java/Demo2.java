import java.lang.*;
import java.io.*;
class Demo2
{
	public static void main(String arg[]) throws Exception
	{
		int i=0, iSize=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the n number of elements");
		iSize = Integer.parseInt(br.readLine());

		int arr[] = new int[iSize];
		System.out.println("enter elements");
		for(i = 0;i < iSize;i++)
		{
		arr[i] = Integer.parseInt(br.readLine());
		}

		hello h=new hello();
		h.segregate(arr);
		System.out.println();
		for(i=0;i<iSize;i++)
		{
			System.out.println(arr[i]);
		}

	}
}
class hello
{
	public void segregate(int ptr[])
	{
		int start=0;
		int end=ptr.length-1;

		while(start<end)
		{
			while((ptr[start]==11)&&(start < end))
			{
				start++;
			}
			while((ptr[end]==21)&&(start < end))
			{
				end--;
}
				if(start<end)
				{
					ptr[start]=11;
					ptr[end]=21;
					start++;
					end--;
				}
			}
		}
	}























