import java.lang.*;
import java.util.*;
class Avgexception extends Throwable
{
	{
		System.out.println("Batting avarage cannot be zero");
	}
}
class CricketPlayer
{
	public String name;
	public int no_of_innings;
	public int no_of_notout;
	public int total_runs;
	public double bat_avg;
	Scanner s=new Scanner(System.in);
	public void Accept()
	{
		System.out.println("Enter the name of player");
		name=s.next();
		System.out.println("Enter no_of_innings,no_of_not_out_times_total_runs");
		no_of_innings=s.nextInt();
		no_of_notout=s.nextInt();
		total_runs=s.nextInt();
	}
	public void Display()
	{
		System.out.println("The name is "+name+"\nThe no_of_innings_of_player_is "+no_of_innings+"\nThe count of not out is "+no_of_notout+"\nTotal runs of player are "+total_runs);
	}
	static void avg(CricketPlayer cp[])
	{
		for(CricketPlayer cp1:cp)
		{
			cp1.bat_avg=(cp1.total_runs)/(cp1.no_of_innings);
			try
			{
				if(cp1.bat_avg<0)
					throw new Avgexception();
			}
			catch(Avgexception a)
			{
				System.out.println(a);
			}
		}

	}
	static void sortPlayer(CricketPlayer cp[])
	{
		CricketPlayer temp;
		for(int i=0;i<cp.length-1;i++)
		{
			for(int j=i+1;j<cp.length;j++)
			{
				if(cp[i].bat_avg>cp[j].bat_avg)
				{
					temp=cp[i];;;;;;
					cp[i]=cp[j];;
					cp[j]=temp;
				}
			}
		}
	}
}
class Player
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of objects");
		int n=s.nextInt();
		CricketPlayer cp[]=new CricketPlayer[n];
		for(int i=0;i<n;i++)
		{
			cp[i]=new CricketPlayer();
		}
		for(int i=0;i<n;i++)
		{
			cp[i].Accept();
			//cp[i].Display();
		}
		CricketPlayer.avg(cp);
		CricketPlayer.sortPlayer(cp);
		for(int i=0;i<n;i++)
		{
			cp[i].Display();
			//cp[i].Display();
		}
	}
}
