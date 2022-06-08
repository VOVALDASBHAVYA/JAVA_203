package sample;

import java.util.Scanner;

public class Addition_Program {

	public static void main(String[] args) {
		/**
		 *  TODO Auto-generated method stub 
		 *  int a, b, C;
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		int c = a + b;
		System.out.println(c);
		sc.close();
		
	}

}
