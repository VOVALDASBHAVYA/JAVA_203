package Practise_Programs;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count;
		System.out.println("Enter n value: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Prime numbers between 1 to "+n+"are");
		for(int j=2;j<=n;j++) {
			count=0;
			for(i=1;i<=j;i++) {
				if(j%i==0) {
					count++;
				}
			}
			if(count==2)
				System.out.print(j+" ");
		}
	}

}