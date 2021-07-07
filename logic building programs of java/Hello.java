import java.lang.*;
import java.io.*;
import java.util.*;
class Time
{
public int hrs,min,sec; //characteristics of a class

public Time(int hrs,int min,int sec) //paramerized constructor
{
this.hrs=hrs;
this.min=min;
this.sec=sec;
}


}
class Employee
{
String name;
int id;
Time t=new Time(0,0,0);
public void accept()
{
Scanner sobj=new Scanner(System.in);

System.out.println("enter name of the empolyee:");
name=sobj.next();

System.out.println("enter id");
id=sobj.nextInt();
}
public void addTime()
{
Scanner s=new Scanner(System.in);
System.out.println("enter hrs");
t.hrs=nextInt();

System.out.println("enter min");
t.min=s.nextInt();
System.out.println("enter sec");
t.sec=s.nextInt();
}









}

class Hello
{
public static void main(String arg[])
{
}
}















































