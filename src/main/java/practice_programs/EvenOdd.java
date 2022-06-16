package practice_programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;//i97
		
		System.out.println("Please Enter any No. u Want to Check :");

	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	if(n%2==0)
	{
		System.out.println("Entered number is Even Number");
	}
	else
	{
		System.out.println("Entered number is Odd Number");
	}
	sc.close();
}

}

