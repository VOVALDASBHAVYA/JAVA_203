package Practise_Programs;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any calendar year: ");
		year=sc.nextLong();
		leapOrNot(year);
		sc.close();
	}
	
	static void leapOrNot(long year) {
		if(year!=0) {
			if(year%400==0)
				System.out.println(year+" "+"is a leap year");
			else if(year%100==0)
				System.out.println(year+" "+"is not a leap year");
			else if(year%4==0)
				System.out.println(year+" "+"is a leap year");
			else
				System.out.println(year+" "+"is not a leap year");
		}
		else
			System.out.println("year zero does not exist");
	}

}
