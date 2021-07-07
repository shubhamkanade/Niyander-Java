
class Hello <T>
{
	<T> T add(T one,T two)
	{
		if(one.getClass() == Double.class)
		{	
			//return (T) (Integer) ((Integer)one + (Integer)two);
			return (T) (Double)((Double)one + (Double)two);
		}
		return (T) (Double)((Double)one + (Double)two);
		//return (T) (Integer)((Integer)one + (Integer)two);
		//return (T) (Double)((Double)one + (Double)two);
		//return(T)Integer.valueOf(((Integer)one).integerValue() + ((Integer)two.integerValue()));
	}

}
class generic_method
{
	public static void main(String arg[])
	{
		Hello<Integer> hobj = new Hello<Integer>();
		Double i = 12.60;
		Double j = 13.70;
		System.out.println(hobj.add(i,j));
	}

}
