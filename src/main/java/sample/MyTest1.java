package sample;

public class MyTest1 { 

		 int x = 9;  

		 int y = 12;  

		 int z = 3;  

		void m1() 

		{  

		 int exp1 = x - y / 3 + z * 2 - 1;  

		 System.out.println("Evaluation1 = " +exp1);  

		}  

		void m2() 

		{  

		 int exp2 = (x - y)/3 + ((z * 2) - 1);  

		 System.out.println("Evaluation2 = " +exp2);  

		}  

		public static void main(String[] args)  

		{  

		  MyTest1 t = new MyTest1();  

		   t.m1(); // Calling of m1 method.  

		   t.m2(); // Calling of m2 method.  
		// TODO Auto-generated method stub

	}

}
