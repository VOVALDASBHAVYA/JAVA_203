package flowcontrols;

/**
 * for each sample program to know the difference between for loop & for each
 * loop both methods are combinely programmed
 * 
 * @author bv22074
 *
 */
public class ContinueDemo {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * for(int i=1;i<=10;i++) { if(i==5) { continue;//skkiping value i==5; which is
	 * 5 no: } System.out.println(i); }
	 * 
	 * }
	 * 
	 * }
	 */
	public static void main(String args[]) {
		for (int i = 1; i <= 10; ++i) {
			if (i == 5) {
				continue;

			}
			System.out.println(i);
			// System.out.println();
			int k = 1;
			for (; k <= 5; ++k) {
				System.out.println(k);
				// System.out.println();
			}
		}
	}
}
