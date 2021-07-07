
enum Days
{
SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
class Enum
{
public static void main(String arg[])
{
Days alldays[]=Days.values();
for(Days d:alldays)
System.out.println(d);
}
}


