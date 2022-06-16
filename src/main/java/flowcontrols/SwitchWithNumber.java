package flowcontrols;
/**
 * simple calculator program design using switch case method
 */
import java.util.Scanner;

public class SwitchWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("|Switch appns  |");
		System.out.println("----------------");
		System.out.println("| 1. Addition  |");
		System.out.println("| 2. Subtractin|");
		System.out.println("| 3. Multiplicn|");
		System.out.println("| 4. Division  |");
		System.out.println("----------------");
		System.out.println("First enter your choice: ");
		//int choice=sc.nextInt();
		char choice=sc.next().charAt(0);
		System.out.println("Enter A value: ");
		int a=sc.nextInt();
		System.out.println("Enter B value: ");
		int b=sc.nextInt();
		switch(choice) {
		//case 1: System.out.println("Result ="+(a+b));
		case 'a': System.out.println("Result ="+(a+b));
		break;
//		case 2: System.out.println("Result ="+(a-b));
		case 'b': System.out.println("Result ="+(a-b));
		break;
//		case 3: System.out.println("Result ="+(a*b));
		case 'c': System.out.println("Result ="+(a*b));
		break;
//		case 4: System.out.println("Result ="+(a/b));
		case 'd': System.out.println("Result ="+(a/b));
		break;
		default: System.out.println("please select your choice range From 1-4 only: ");
		}
		sc.close();
	}

}
