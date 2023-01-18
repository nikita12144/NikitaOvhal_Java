package nikitaApplication;

public class largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int a;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] < arr[j])
				{
			      a=arr[i];
			      arr[i]=arr[j];
			      arr[j]=a;
		}
			}
		}
		
		System.out.println("second largest number is:" +arr[1]);
		System.out.println("second smallest number is:" +arr[arr.length - 2]);
     }
}


 
 
   
