
import java.util.Scanner;

public class PatternProgram19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		System.out.println("Enter Symbol: ");
		char c=sc.next().charAt(0);
		int i=1,j;
		int k=n*2-1;
		while(i<=k) {
			if(i==1 || i==n || i==k) {
				j=1;
				while(j<=n) {
				if(j==1 || j==n) 
					System.out.print(" ");
				else
					System.out.print(c);
				j++;}}
			else {
				j=1;
				while(j<=n) {
					if(j==1 || j==n)
						System.out.print(c);
					else
						System.out.print(" ");
					j++;
				}
			}
			System.out.println();
			i++;
			sc.close();
			}
				
				
	}

}
