package practice;
import java.util.*;  
public class collection2 {
	public static void main(String args[]){ 
		
	LinkedList<String> ll= new LinkedList<String>();  
	ll.add("Nikita");  
	ll.add("Diksha");  
	ll.add("Nikita");  
	ll.add("Diksha");  
	Iterator<String> itr=ll.iterator();  
	while(itr.hasNext())
	{  
	System.out.println(itr.next());  
	}  
}  
}  

