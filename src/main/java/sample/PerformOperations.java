package sample;

//import java.util.Scanner;

public class PerformOperations {

	public static void main(String[] args) {
		int a=150,b=56;
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in);
		*System.out.println("Enter y value :");
		*int y = sc.nextInt();
		*System.out.println("Enter x value :");
		*int x = sc.nextInt();
		*System.out.println(y+x);
		*System.out.println(y-x);
		*System.out.println(y*x);
		*System.out.println(y/x);
		*System.out.println(y%x);*/
		int x=a+b;
		int y=a-b;
		int z=a*b;
		int d=a/b;
		int e=a%b;
		System.out.printf(" a+b=%d\n a-b=%d\n a*b=%d\n a/b=%d\n a mod b= %d",x,y,z,d,e);//use only printf, wheneverthere izz "%"
		//sc.close();
	}

}
