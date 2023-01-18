package practice;
import java.util.*;  
public class collection4 {
	public static void main(String args[])
	{  
	Vector<String> v=new Vector<String>();  
	v.add("Nikita");  
	v.add("Diksha");  
	v.add("Payal");  
	v.add("Garima");  
	Iterator<String> i=v.iterator();  
	while(i.hasNext()){  
	System.out.println(i.next());  
	}  
	}  
}  