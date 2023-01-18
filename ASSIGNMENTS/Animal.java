package nikitaApplication;

 class Animal {
	  public void eat()
		{
			System.out.println("eating"); 
		}  
  
     public void sleep()
      {
	 System.out.println("sleeping");
      }
 }
	class dog extends Animal
		{  
		public void bark()
		{
			System.out.println("barking");
			}  
		}  
	class puppy extends dog{
		public void run()
		{
			System.out.println("running");
		}
	}

	


