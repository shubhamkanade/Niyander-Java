import java.lang.*;
interface demo1
{
	void run();
}
abstract class hello
{
	abstract void run();
}
class Example extends hello implements demo1
{
/*	void run()
	{
		System.out.println("inside run");
	}
*/
	void run()
	{
		System.out.println("inside run");
	}

}
