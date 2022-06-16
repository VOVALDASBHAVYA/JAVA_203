package PatternsPractise;
/**
 * print square pattern with reverse order numbers
 * @author bv22074
 *
 */
public class PatternProgram_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				System.out.print(j);//from top to bottom column serial no will come as o/p
				//System.out.print(i);//only row no: will come
			}
			System.out.println();
		}

	}

}
