package practice;

interface X{  
		void print();  
		}  
interface Y{  
		void print();  
		}  
		  
		class interface4 implements X,Y{  
		public void print(){System.out.println("Hello");}  
		public static void main(String args[]){  
		interface4 obj = new interface4();  
		obj.print();  
		 }  
		}  

