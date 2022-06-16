package Shapes;

import java.util.Scanner;

public class AOT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s1=new Scanner(System.in);
//		System.out.println("Enter 1st side: ");
//		int a=s1.nextInt();
//		System.out.println("Enter 2nd side");//ctrl+? is used to comment set of lines
//		int b=s1.nextInt();
//		System.out.println("Enter the 3rd side");
//		int c=s1.nextInt();
//		if((a+b)>c && (a+c)>b && (b+c)>a) {
//			int s=(a+b+c)/2;
//			double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
//			System.out.println("Area of triangle is:"+area);
//		}
//		else
//			System.out.println("Area of triangle not exit");
//		s1.close();
		//-------
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of the triangle: ");
		double a=s.nextDouble();
		double area=(Math.sqrt(3)/4)*(a*a);
		System.out.println("Area of triangle is: "+area);
	}

}
