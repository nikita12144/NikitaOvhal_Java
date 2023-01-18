package nikitaApplication;

public class dupliacte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,2,4,5,4,6,7,6};
		for(int i = 0 ;i<array.length; i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i] == array[j])
				{
					System.out.println(array[i]);
				}
			}
		}

	}

}
