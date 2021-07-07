//import java.lang.*;
import java.io.*;
import java.sql.*;

class demo
{
	public static void main(String a[]) throws Exception
	{
		
		Connection conn=null;
		Statement stmt=null;
			try
			{
			//step-2 register the driver
			Class.forName("com.mysql.jdbc.Driver");

			//step-3 create the connection
			System.out.println("connecting to the database");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=true","root","root");

			//step-4 execute the query
			System.out.println("create the database");
			stmt=conn.createStatement();

			stmt.executeUpdate("USE Student");
			System.out.println("dtabase created succesfully");

			ResultSet rs=stmt.executeQuery("SELECT * from Student");
			
			while(rs.next())
			{
				int id=rs.getInt("rno");
				String name=rs.getString("Name");
				
				System.out.println(id);
				//stem.out.println(name);
			}
			
		}
		catch(Exception e)
		{
		//PrintStackTrace();
		System.out.println(e);
		}
		finally
		{
			stmt.close(); 
			conn.close();
		}
	}
}
