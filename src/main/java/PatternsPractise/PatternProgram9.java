package PatternsPractise;
/**
 * reverse pyramid program using for loop
 * @author bv22074
 *
 */

public class PatternProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p_height=5;
		for(int i=p_height;i>=1;i--) {
			for(int k=p_height-1;k>=i;k--) {
				System.out.print("");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("*");
		
		//for(int i=5;i>=1;i--) {
			//for(int j=5;j>=1;j--) {
				//if(i>=j) {
					//System.out.print("*");
				//}else
				//{
					//System.out.print("");
				//}
			}
			System.out.print("\n");
		}

	}

}
