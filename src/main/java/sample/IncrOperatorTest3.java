package sample;

public class IncrOperatorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int m = ++x * x++;// 11*11=121
		int y = ++x * 10 / x++ + ++x;
		
		System.out.println("x =" + x);
		System.out.println("m = " + m);
		System.out.println("y =" + y);
	}
}
