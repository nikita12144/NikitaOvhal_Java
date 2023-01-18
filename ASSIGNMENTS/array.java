package nikitaApplication;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"Red","Blue","Green","Violet","Orange"};
		
		System.out.println(colors[2]);
		colors[2] = "Purple";
		System.out.println(colors[2]);
		System.out.println("-------------------");
		System.out.println("length of array is :  " + colors.length);

		for (String x : colors)
		{
			System.out.println(x);
		}
		System.out.println("-------------------");
      for(int i=0;i<colors.length;i++)
{
	System.out.println(colors[i]);
}
	}

}
