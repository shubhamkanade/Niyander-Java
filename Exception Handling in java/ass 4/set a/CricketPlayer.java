import java.lang.*;
import java.util.*;

class AvgException extends Exception
{
	{
		System.out.println("BATTTING AVG CANNOT BE ZERO");
	}
}
class CricketPlayer
{
	Scanner s=new Scanner(System.in);
	String name;
	int no_of_innings,no_times_notout,total_runs;
	double bat_avg;

	void accept()
	{
		System.out.println("Enter the player name");
		name=s.next();
		System.out.println("Enter player's no of innings");
		no_of_innings=s.nextInt();
		System.out.println("Enter how many times player is not out");
		no_times_notout=s.nextInt();
		System.out.println("Enter the total runs");
		total_runs=s.nextInt();
	}
	void display()
	{
		System.out.println("\nplayer name :"+name+"\nno of innnings :"+no_of_innings+"\nthe count of not out is :"+no_times_notout+"\ntotal runs :"+total_runs);
	}

	static void avg(CricketPlayer  cp[])
	{
		for(CricketPlayer player:cp)
		{
			player.bat_avg=((player.total_runs))/player.no_of_innings;

			try
			{
				player.bat_avg=((player.total_runs))/player.no_of_innings;
				if(player.bat_avg<0)
					throw new AvgException();
			}
			catch(AvgException e)
			{
				System.out.println(e);
			}
		}
	}
	static void sort(CricketPlayer cp[])
	{
		for(int i=0;i<cp.length;i++)
		{
			for(int j=i+1;j<cp.length;j++)
			{
				if(cp[i].bat_avg>cp[j].bat_avg)
				{
					CricketPlayer temp=cp[i];
					cp[i]=cp[j];
					cp[j]=temp;
				}
			}
		}
	}

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter how many players\n");
			n=s.nextInt();
		CricketPlayer cp[]=new CricketPlayer[n];
		for(int i=0;i<n;i++)
		{
			cp[i]=new CricketPlayer();
			cp[i].accept();
		}
		CricketPlayer.avg(cp);
		CricketPlayer.sort(cp);
		for(int i=0;i<n;i++)
                {
                        //cp[i]=new CricketPlayer();
                        cp[i].display();
                }

	}
}
















