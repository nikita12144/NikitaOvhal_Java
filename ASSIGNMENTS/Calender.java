package nikitaApplication;

public class Calender {

	public static void main(String[] args) {
	
		String[] month = {"January","February","March","April","May","June","July","August","September","Octomber","November","December"};
		String[] days = {"Monday","Tuesday","Wenesday","Thursday","Friday","Saturday","Sunday"};
	
		 for(String x : month) {
		        	 System.out.println(x);
		        	 
		 for(int j = 1;j<=4;j++)
		             {
		             System.out.println("   Week:" +j);

         for(String y : days) 
         {
         System.out.println("      " +y);
        	 
         }
       }
	}
  }
}



