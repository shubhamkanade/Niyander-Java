enum Color
{
	RED,GREEN,BLUE,WHITE,BLACK
}
class Enumcolor
{


	Color c;
	Enumcolor(Color c)
	{
		this.c=c;
	}
	void Display()
	{
		switch(c)
		{
			case RED:System.out.println("color is red");break;
			case GREEN:System.out.println("color is green");break;
			case BLUE:System.out.println("color is blue");break;
			case WHITE:System.out.println("color is white");break;
			case BLACK:System.out.println("color is black");break;
		}
	}
	public static void main(String arg[])
	{
		Enumcolor ec=new Enumcolor(Color.GREEN);
		ec.Display();
	}
}

