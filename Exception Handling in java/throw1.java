//we can create the class and we can throe the object
//throw keyword is generally used with user definedd exceptions


import java.lang.*;
import java.io.*;

class throw1
{
public static void main(String arg[])
{
try
{
IOException iobj=new IOException("my exception");
throw iobj;
}
catch(IOException i)
{
System.out.println(i);
}
}
}

