package practice;

public class Stringbuffer_builder {
	    public static void main(String[] args)
	    {  
	    	// ------------StringBuffer-------------
	    	
	        StringBuffer buffer=new StringBuffer("Hello ");  
	        int length = buffer.length();
	        int capacity = buffer.capacity();
	        System.out.println("length: " +length); 
	        System.out.println("capacity: "+capacity);
	        
	        buffer.append("I am nikita"); 
	        {
	            System.out.println(buffer);  
	            }
	        System.out.println("After adding string length and capacity is:"); 
	        System.out.println("length:  "   +buffer.length()); 
	        System.out.println("capacity: " +buffer.capacity());
	        
	        //----------StringBuilder--------

         StringBuilder builder=new StringBuilder("StringBuilder: Hello ");  
         builder.append("welcome to java"); 
         {
         System.out.println(builder);  
         }
         builder.replace(14, 20, "hi");
         
         System.out.println(builder);
     }
}




