package practice;
 
public class Throwsexception {
	
	static void validate(int age) throws ArithmeticException
	{ 
	    if (age < 18)
	    {
	      throw new ArithmeticException("Access denied - Person is not eligible to vote"); 
	    } 
	    else 
	    {
	      System.out.println("Access granted - Person is eligible to vote!!"); 
	    }
	 } 
	 
	 public static void main(String[] args) { 
	   validate(10); 
	 } 
	}
