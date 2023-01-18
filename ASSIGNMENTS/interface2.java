package practice;

interface bank {
	float rateofinterest();
	}
class SBI implements bank{
	public float rateofinterest()
	{
		return 9.15f;
	}
}
	class PNB implements bank{
		public float rateofinterest()
		{
			return 9.7f;
		}
	}
		class interface2 {
			public static void main(String args[]) {
				bank b=new SBI();
				bank d= new PNB();
				System.out.println("ROI SBI:" +b.rateofinterest());
				System.out.println("ROI PNB:" +d.rateofinterest());
				
			}
		}
