package sample;

import java.util.Scanner;

public class Cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr x value is:");
		int x=sc.nextInt();
		System.out.println("Enter y value is:");
		int y=sc.nextInt();	
		sc.close();
//int x,y;
if(x<=y) {
	System.out.println(y);
}
	}

}