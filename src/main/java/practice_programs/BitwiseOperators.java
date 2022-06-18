package practice_programs;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,a1,b1,i;
		int[] x=new int[16];
		int[] y=new int[16];
		int[] AND=new int[16];
		int[] or=new int[16];
		int[] XOR=new int[16];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1");
		a=sc.nextInt();
		System.out.println("Enter number2");
		b=sc.nextInt();
		binary(a,b,x,y);
		System.out.print(a+"=========>");
		print(x);
		System.out.print(b+"=========>");
		print(y);
		calAND(x,y,AND);
		calor(x,y,or);
		calXOR(x,y,XOR);
		System.out.print("bitwiseAND"+"("+a+","+b+")----->");
		print(AND);
		System.out.print("bitwiseor"+"("+a+","+b+")----->");
		print(or);
		System.out.print("bitwiseXOR"+"("+a+","+b+")----->");
		print(XOR);
		sc.close();
	}
	static void binary(int a1,int b1,int x[],int y[]) {
		for(int i=15;i>=0;i--) {
			x[i]=a1%2;
			y[i]=b1%2;
			a1/=2;
			b1/=2;
		}
	}
	static void calor(int x[],int y[],int or[]) {
		int b=0,s;
		for(int i=15;i>=0;i--) {
			s=0;
			s=x[i]+y[i]+b;
			or[i]=s%2;
			b=s/2;
		}
	}
	static void calAND(int x[],int y[],int AND[]) {
		for(int i=15;i>=0;i--) {
			if(x[i]==1&&y[i]==1)
				AND[i]=1;
		}
	}
	static void calXOR(int x[],int y[],int XOR[]) {
		for(int i=15;i>=0;i--){
			if(x[i]+y[i]==1)
				XOR[i]=1;
		}
	}
	static void print(int a[]) {
		for(int i=0;i<=15;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
