import java.lang.*;
class InterfaceM
{
	public static <T> void display(T arr[])
	{
		for(T i:arr)
		{
			System.out.print(i+"\t");
		}
	}
	public static void main(String arg[])
	{
		Integer iArr[]={10,20,30,40};

		Float fArr[]={10.0f,20.0f,30.0f,40.0f};

		InterfaceM.display(iArr);
		System.out.println();
		InterfaceM.display(fArr);
	}
}
