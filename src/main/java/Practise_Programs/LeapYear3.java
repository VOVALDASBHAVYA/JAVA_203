package Practise_Programs;

import java.util.Scanner;

public class LeapYear3 {

	int leap(int year) {
		int c = 0;
		{
			if (year % 400 == 0)
				c = 1;
			else if (year % 100 != 0) {
				if (year % 4 == 0)
					c = 1;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any calendar year: ");
		y=sc.nextInt();
		LeapYear3 l=new LeapYear3();
		if(y!=0) {
			a=l.leap(y);
			if(a==1)
				System.out.println(y+" "+"is a leap year");
			else
				System.out.println(y+" "+"is not a leap year");
		}
		else
			System.out.println("year zero does not exist");
		sc.close();
	}

}
