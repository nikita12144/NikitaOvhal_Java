package practice;

public class exception {
	public static void main(String args[])
	{
		try
		{
			int data = 2/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			int[] num  = {1,4,8,9};
			num[10] = 10;
			System.out.println(num[10]);
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			String s1 = null;
			System.out.println(s1.length());
		}
		catch(Exception d)
		{
		System.out.println(d);
		}
		finally
		{
		System.out.println("welcome to java exceptions");
	}

 }
}

