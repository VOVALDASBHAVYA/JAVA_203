package Shapes;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the width of the triangle: ");
		double b=s.nextDouble();
		System.out.println("Enter the height of the triangle: ");
		double h=s.nextDouble();
		double area=AOT(b,h);
		System.out.println("Area of triangle is:"+area);
		s.close();

	}
	static double AOT(double b,double h) {
		return ((b*h)/2);
	}

}
