import java.lang.*;
class demo<T>
{
T no1;
T no2;
public demo(T no1,T no2)
{
this.no1=no1;
this.no2=no2;
}

public T add()
{
T ans=no1+no2;
return ans;
}
}
class InterfaceC
{
public static void main(String arg[])
{
demo<Integer> obj=new demo<Integer>(10,20);

obj.add();
}
}
