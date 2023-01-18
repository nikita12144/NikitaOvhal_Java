package nikitaApplication;

public class private_mod {
	private int a = 40;
	private void msg()
	{
	System.out.println("Hello java");	
	}
	
	private void mul()
	{
		int x = 2;
		int y = 5;
		int result = x*y;
		System.out.println(result);
	}
	 // public class simple{
		public static void main(String args[])
		{
		private_mod obj = new private_mod();
		System.out.println(obj.a);
		obj.msg();
		obj.mul();
	}

}


