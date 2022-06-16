package sample;

public class IntegerTest2 {

	// Declaration of instance variables.  

	   int a = 50, b = 30;  

	// Declaration of instance methods.  

	void m1() 

	{  

	  int p = b - a;  

	  System.out.println("p = " +p);  

	 }  

	void m2() 

	{  

	  int q = -a*b;  

	  System.out.println("q = " +q);  

	 }  

	void m3() 

	{  

	  int r = a/b;  

	  System.out.println("r = " +r);  

	 }  

	void m4() 

	{  

	  int s = -a%b;  

	  

	  int u = a%-b; 

	 System.out.println("s = " +s);  

	 //System.out.println("t = " +t);  

	 System.out.println("u = " +u);  

	}  

	public static void main(String[] args)  

	{  

	// Creating an object of class.  

	  IntegerTest2 i = new IntegerTest2();  

	   i.m1(); // Calling of m1() method.  

	   i.m2(); // Calling of m2.  

	   i.m3(); // Calling of m3.  

	   i.m4(); // Calling of m4.  

		// TODO Auto-generated method stub

	}

}

  


  