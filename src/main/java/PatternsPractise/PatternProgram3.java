package PatternsPractise;
/**
 *  print square pattern with numbers
 * @author bv22074
 *
 */

public class PatternProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;++j) {
			//for(int j=1;j<=i;++j) {
				//System.out.print(i);//if will take sout(i), u'll get row no: only u'll not get 12345
				
				System.out.print(j);//u'll get o/p like row1:12345;row2:12345;..so on
			}
			System.out.println();
			
		}

	}

}
