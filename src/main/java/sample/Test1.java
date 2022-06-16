package sample;

public class Test1 {
		// TODO Auto-generated method stub
		 int x = 30;  

		 float y = 50.5F;  

		 int z = 60;  

		void compare() 

		{  

		 if(y > x) 

		 {  

		   System.out.println("y is greater than x");  

		 }  

		else  

		{  

		  System.out.println("y is less than x");  

		 }  

		if(y < z) 

		{  

		  System.out.println("y is less than z");  

		 }  

		else  

		{  

		  System.out.println("y is greater than z");  

		 }  

		}  

		public static void main(String[] args)  

		{  

		// Create an object of class.  

		   Test1 t = new Test1();  

		   t.compare(); // Calling compare method using reference variable t.  
	}

}
