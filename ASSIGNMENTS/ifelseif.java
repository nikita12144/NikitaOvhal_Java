package nikitaApplication;

public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5 , b = 1 ,c = 6, d = 2;
		
		 if (a > b && a > c && a > d)
		 {
			 System.out.println("a is greater :" +a);
		 }
		 else if(b > a && b > c && b > d)
		 {
			 System.out.println("b is greater:" +b);
		 }
		 else if(c >  a && c > b && c >d)
		 {
			 System.out.println("c is greater:" +c);
		 }
		 else
		 {
			 System.out.println("d is greater:" +d);
		 }
	}

}
