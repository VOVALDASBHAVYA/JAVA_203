package Practise_Programs;

import java.util.Scanner;

interface AreaCircle{
	void circle(double r);
}
class AreaCal implements AreaCircle{
double area;
public void circle(double r) {
	area=(22*r*r)/7;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCal x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double rad=s.nextDouble();
		x=new AreaCal();
		x.circle(rad);
		System.out.println("Area of circle is: "+x.area);
		s.close();
	}

}

