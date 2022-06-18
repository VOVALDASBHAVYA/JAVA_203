package Practise_Programs;

import java.util.Scanner;

//public class Hcf {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n1=Integer.parseInt(args[0]);
//		int n2=Integer.parseInt(args[1]);
//		int temp;
//		while(n2>0)
//		{
//			temp=n2;
//			n2=n1%n2;
//			n1=temp;
//		}
//		System.out.println("HCF="+n1);
//	}
//
//}
/////////////////////////
public class Hcf {
	public static void main(String args[]) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		n1=sc.nextInt();
		System.out.println("Enter number 2: ");
		n2=sc.nextInt();
		int result=hcfCal(n1,n2);
		System.out.println("HCF of two numbers="+result);
		sc.close();
	}
	static int hcfCal(int a,int b) {
		int temp;
		while(b>0) {
			temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
}
