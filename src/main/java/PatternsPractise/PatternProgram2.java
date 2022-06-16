package PatternsPractise;
/**
 * print square pattern using for loop
 * @author bv22074
 *
 */
public class PatternProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;++i) {
			for(int j=1;j<=5;j++) {
			//for(int j=1;j<=i;j++) {//if we take j<=5 will get result as square pattern or if we take j<=i will get triangle pattern 
				System.out.print("*"); 
			}
			System.out.println();
		}

	}

}
