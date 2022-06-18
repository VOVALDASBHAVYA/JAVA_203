package Practise_Programs;
public class LeapYear2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=Integer.parseInt(args[0]);
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

