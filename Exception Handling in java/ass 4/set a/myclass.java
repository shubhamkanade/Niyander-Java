import java.util.*;

class AvgException extends Throwable
{
{
System.out.println("AVG CANNOT BE NEGATIVE AND ZERO");
}
}
class CricketPlayer
{
	Scanner sc=new Scanner(System.in);
	String name;
	int no_of_innings,no_times_notout,total_runs;
	double bat_avg;

	void accept()
	{
		System.out.println("ENTER PLAYER NAME===>>>");
		name=sc.next();
		System.out.println("ENTER NUMBER OF INNINGS=====>>>");
		no_of_innings=sc.nextInt();
		System.out.println("ENTER HOW MANY TIMES REMAINS NOTOUT===>>>");
		no_times_notout=sc.nextInt();
		System.out.println("TOTAL RUNS===>>>>");
		total_runs=sc.nextInt();
	}

	void display()
	{
		System.out.println("\nPLAYER NAME==>>"+name+"\nNUMBER OF INNINGS==>>"+no_of_innings+"\nNUMBER OF TIMES NOTOUT==>>"+no_times_notout+"\nTOTAL RUNS==>>"+total_runs);

	}

	static void avg(CricketPlayer[] cp)
	{
		for(CricketPlayer player:cp)
		{
			player.bat_avg=((player.total_runs)/(player.no_of_innings));
		
				//System.out.println("BAT AVG==>"+player.bat_avg);
				try
				{
				player.bat_avg=((player.total_runs)/(player.no_of_innings));
				if(player.bat_avg<=0)
{
				throw new AvgException();
}

				}
				catch(AvgException e)
				{
				System.out.println(e);

				}
}

	}



	static void sort(CricketPlayer[] cp)
	{
		for(int iCnt=0;iCnt<cp.length;iCnt++)
		{
			for(int jCnt=iCnt+1;jCnt<cp.length;jCnt++)
			{
				if(cp[iCnt].bat_avg > cp[jCnt].bat_avg)
				{
					CricketPlayer temp=cp[iCnt];
					cp[iCnt]=cp[jCnt];
					cp[jCnt]=temp;
				}
				for(CricketPlayer player:cp)
				{
					System.out.println("sort"+player.bat_avg);
				}
			}


		}
	}
}
class myclass
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER HOW MANY PLAYER===>>>");
		int no=sc.nextInt();

		CricketPlayer[] cp=new CricketPlayer[no];
		for(int i=0;i<no;i++)
			cp[i]=new CricketPlayer();

		for(int i=0;i<no;i++)
		{
			cp[i].accept();

		}
		CricketPlayer.avg(cp);

		CricketPlayer.sort(cp);
		for(int i=0;i<no;i++)
		{
			cp[i].display();

		}
/*		try
		{
			player.bat_avg=((player.total_runs)/(player.no_of_innings));
			if(player.bat_avg<0)
				throw new ArithmaticException();

		}
		catch(ArithmaticException e)
		{
			System.out.println("bat avg is negative");

		}
*/




	}

}

