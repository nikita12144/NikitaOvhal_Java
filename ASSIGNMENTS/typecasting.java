package nikitaApplication;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =  5 ;
		float b = a;             //implicit typecasting
		System.out.println(a);
		System.out.println(b);   
		
		double d = 2.65446d ;
		int i = (int)d;           //explicit typecasting
		System.out.println(d);
		System.out.println(i); 
		
		float f = 9.7f;
		double x = (double)f;
		System.out.println(f);
		System.out.println(x); 
		
		double d1 = 2.65464656566232d ;
		 float y = (float)d1;           
		System.out.println(d1);
		System.out.println(y); 
		
}

}
