package flowcontrols;
/**
 * finding largest number among the 3 numbers using for loopS
 */

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first, second and third number: ");
		int firstnumber=sc.nextInt();
		int secondnumber=sc.nextInt();
		int thirdnumber=sc.nextInt();
		if(firstnumber>secondnumber && firstnumber>thirdnumber) {
			System.out.println("First number is a largest number: "+firstnumber);
		}
		else if(secondnumber>thirdnumber && secondnumber>firstnumber) {
			System.out.println("Second number is a largest number: "+secondnumber);
		}
		else if(thirdnumber>firstnumber && thirdnumber>secondnumber) {
			System.out.println("Third number is a largest number: "+thirdnumber);
		}
		else {
			System.out.println("Any two or more numbers are equal");
		}
		sc.close();
	}

}
