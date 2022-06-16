package Shapes;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the width of triangle: ");
		double b=s.nextDouble();
		System.out.println("Enter the height of triangle: ");
		double h=s.nextDouble();
		double area=(b*h)/2;
		System.out.println("Area of triangle is: "+area);
		s.close();
	}

}
