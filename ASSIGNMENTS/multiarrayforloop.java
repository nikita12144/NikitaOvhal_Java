package nikitaApplication;

public class multiarrayforloop {

	public static void main(String[] args) {
	

		String [][] student =  {{"nikita","diksha","pooja"}, 
				                {"ankita","gita","reena"}};
		for(int i = 0; i < student.length; i++)
		{
			for(int j=0; j < student[i].length; j++)
			{
				System.out.println(student[i][j]);
			}
				
		}

	}

}
