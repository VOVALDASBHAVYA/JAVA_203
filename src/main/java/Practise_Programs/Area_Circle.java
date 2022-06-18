package Practise_Programs;

import java.util.Scanner;

class Area {
	double area;

	Area(double r) {
		area = (22 * r * r) / 7;
	}
}

public class Area_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double rad=s.nextDouble();
		Area a=new Area(rad);
		System.out.println("Area of circle is:"+a.area);
		s.close();
	}

}
