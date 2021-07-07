import java.lang.*;
import java.io.*;
import java.util.*;

class Date
{
public String day,month;
public int year;
Scanner s=new Scanner(System.in);
public void Accept()
{
System.out.println("Enter the date in the form of (dd,mm,yy)");
day=s.next();
month=s.next();
year=s.nextInt();
}
public void Display()
{
System.out.println("The day is "+day+"\nThe month is "+month+"\nThe year is "+year);
}


