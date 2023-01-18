package practice;
import java.util.*;  
public class collection3 {
	public static void main(String args[])
	{  
	Stack<Integer> stud = new Stack<Integer>();  
	stud.push(1);  
	stud.push(2);
	stud.pop();
    stud.push(3);  
	stud.push(4);  
	stud.push(5);  
	// stud.pop();  
	stud.push(6);
	stud.pop();

	Iterator<Integer> itr=stud.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  


