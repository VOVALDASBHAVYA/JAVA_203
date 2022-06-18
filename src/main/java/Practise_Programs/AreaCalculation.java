package Practise_Programs;

import java.util.Scanner;

public class AreaCalculation {
	double area;
	void circle(double r)
	{
		area=(22*r*r)/7;
	}

}
class AreaOf extends AreaCalculation{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the radius: ");
	double rad=s.nextDouble();
	AreaOf a=new AreaOf();
	a.circle(rad);
	System.out.println("Area of circle is:"+a.area);
	s.close();
}
}
