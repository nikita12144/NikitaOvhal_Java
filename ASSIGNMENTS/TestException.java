package practice;

class AddressChangeException extends Exception  
	{  
	    public AddressChangeException (String str)  
	    {  
	        super(str);  
	    }  
	}  
	    
	public class TestException
	{  
	  
	    static void validate (int address) throws AddressChangeException{    
	       if(address > 2){  
	  
	        throw new AddressChangeException("you are not able to change address");    
	    }  
	       else {   
	        System.out.println("you are able to change address");   
	        }   
	     }    
	  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            validate(3);  
	        }  
	        catch (AddressChangeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	     
	    }
	}
	

