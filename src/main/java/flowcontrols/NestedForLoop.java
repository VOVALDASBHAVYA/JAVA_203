package flowcontrols;
/**
 * print 1-3 tables using for loop and also in reverse order 
 * @author bv22074
 *
 */
public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		//for(i=1;i<=3;i++) {
			//for(j=1;j<=10;j++) {
				//System.out.println(i+"x"+j+"="+(i*j));
			//}
			//System.out.println("-------------");
		for(i=3;i>=1;i--) {// or for(i=1;i<=3;i++){
			for(j=10;j>=0;j--) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			//System.out.println("-------------");
			System.out.println();
		}

	}

}
