package Practise_Programs;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r=s.nextDouble();
		double area=(22*r*r)/7;
		System.out.println("Area of circle is: "+area);
		s.close();
	}

}
