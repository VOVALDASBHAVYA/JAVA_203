package practice_programs;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c;    
		 Random t = new Random();   
		 for (c = 1; c <= 15; c++) { 
			 System.out.println(t.nextInt(10000)); 
		 }
	}

}
