package practice;

	interface A1{  
		void print();  
		}  
		interface B1 extends A1{  
		void show();  
		}  
		class interface5 implements B1{  
		public void print(){System.out.println("Hello");}  
		public void show(){System.out.println("Welcome");}  
		  
		public static void main(String args[]){  
			interface5 obj = new interface5();  
		obj.print();  
		obj.show();  
		 }  
		}  

