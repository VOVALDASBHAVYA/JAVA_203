package PatternsPractise;
/**
 * print even numbers in a square pattern
 * @author bv22074
 *
 */
public class PatternProgram5 {

	public static void main(String[] args) {
		int x=2;
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%4d",x);
				x+=2;	
			}
			
			System.out.println();
		}

	}

}
