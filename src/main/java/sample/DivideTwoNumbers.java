package sample;

import java.util.Scanner;

public class DivideTwoNumbers {

	public static void main(String[] args) {
		//int c;
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter a value: ");
		int a=sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		int c=a/b;
		System.out.println(" C value is :" + c);
		sc.close();
	}

}
