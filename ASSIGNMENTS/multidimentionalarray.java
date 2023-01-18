package nikitaApplication;

public class multidimentionalarray {

	public static void main(String[] args) {
		
		int[][] marks =  {{40,50,60}, 
				          {80,75,90}};
		System.out.println(marks[1][1]);
		marks[1][1] = 99 ;
		System.out.println(marks[1][1]);
	}

    
}
