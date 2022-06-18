package Practise_Programs;

import java.util.Scanner;

public class Char_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		// char ch=sc.nextChar();
		char ch = sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("Entered character"+ch+ "is vowel");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Entered character"+ch+"is consonant");
		else
			System.out.println("not an alphabet");
		sc.close();
	}

}
