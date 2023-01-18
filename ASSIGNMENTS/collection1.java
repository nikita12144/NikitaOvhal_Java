package practice;
	import java.util.*;  
	public class collection1 {
	public static void main(String args[]){  
	
	ArrayList<String> list=new ArrayList<String>();  
	list.add("Nikita");
	list.add("Diksha");  
	list.add("Payal");  
	list.add("Mayuri");
	list.add("Ankita");  

	Iterator<String> itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  

