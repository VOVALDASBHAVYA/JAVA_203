package flowcontrols;
/**
 * find whether the given number is even or odd
 */

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Given number is even: ");
		} else {
			System.out.println("Given number is odd: ");
		}
		sc.close();
	}

}
