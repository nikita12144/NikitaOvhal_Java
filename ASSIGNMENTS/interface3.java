package practice;

interface A{
	void print();  
	}  
interface B{  
	void show();  
	}  
	class interface3 implements A,B {  
	public void print()
	{
		System.out.println("Hello");
		}  
	public void show()
	{
		System.out.println("Welcome");
		}  
	  
	public static void main(String args[])
	{  
	interface3 obj = new interface3();  
	obj.print();  
	obj.show();  
	 }  
	}  

