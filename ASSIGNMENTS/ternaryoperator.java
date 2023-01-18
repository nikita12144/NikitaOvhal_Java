package nikitaApplication;

public class ternaryoperator {

	public static void main(String[] args) {
		
           int percentage = 100;
           String a = (percentage < 35)? "Pass" : "Fail";
           System.out.println(a);
           
           int x = 10 , y = 8 ,z = 4;
           int Result= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
           System.out.println("The largest numbers is:  "+Result);  
	}

}
