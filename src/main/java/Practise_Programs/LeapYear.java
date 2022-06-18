package Practise_Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a,y,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any calendar year: ");
		y=sc.nextLong();
		if(y!=0) {
			a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));
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


