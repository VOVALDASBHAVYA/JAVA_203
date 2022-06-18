
import java.util.Scanner;

public class AreaCircleOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double rad=s.nextDouble();
		double a=area(rad);
		System.out.println("Area of circle is:"+a);
		s.close();
	}
	static double area(double r) {
		return (22*r*r)/7;
	}

}
