package Shapes;

import java.util.Scanner;

public class AOT {

	long area;
	AOT(long b,long h){
		area=(b*h/2);
	}

}
class Xyz{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the width of the traiangle: ");
	long b=s.nextLong();
	System.out.println("Enter the height of the triangle: ");
	long h=s.nextLong();
	AOT A1=new AOT(b,h);
	System.out.println("Area of triangle is:"+A1.area);
	s.close();
}
}
