package sample;

import java.util.Scanner;

public class Dam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr x value is:");
		int x=sc.nextInt();
		System.out.println("Enter y value is:");
		int y=sc.nextInt();	
		System.out.println("Enter z value is:");
		int z=sc.nextInt();	
		sc.close();
		if(x>y && y>z) {  

			  System.out.println("Hello");  

			}  
		if(x==y || y==z || z==x) 
			//if(z > y && z < x) 

			{  

			  System.out.println("java");  

			}  
			if((y+200) > x && (y+150) > z) 

			{  

			  System.out.println("Hello Java");  

			}  

	}

}
