package Practise_Programs;

import java.util.Scanner;

public class LeapYear4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any calendar year: ");
		year=sc.nextInt();
		if(year!=0) {
			if(year%400==0)
				System.out.println(year+" "+"is a leap year");
			else if(year%100!=0) {
				if(year%4==0)
					System.out.println(year+" "+"is a leap year");
				else
					System.out.println(year+" "+"is not a leap year");
			}
			else
				System.out.println(year+" "+"is not a leap year");
		}
		else
			System.out.println("year zero does not exist");
		sc.close();
	}

}
