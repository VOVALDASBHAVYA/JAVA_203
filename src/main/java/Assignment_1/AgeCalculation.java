package Assignment_1;

import java.util.Scanner;

public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //double personAge=calculateAge(2,1999);
		 //System.out.printf("personage=%.2f",personAge);
		System.out.printf("personAge = %.2f",calculateAge(2,1998));
	}

	static double calculateAge(int birthMonth, int birthYear) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current year : ");
		int currentYear = sc.nextInt();
		System.out.println("Enter current month : ");
		int currentMonth = sc.nextInt();
		double personAge = (currentYear - (double)birthYear) + ((currentMonth -(double)birthMonth) / 12);//tip of the day
				sc.close();
		return personAge;

	}

}
