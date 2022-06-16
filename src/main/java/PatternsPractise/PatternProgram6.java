package PatternsPractise;
/**
 * real number square pattern
 * @author bv22074
 *
 */
public class PatternProgram6 {

	public static void main(String[] args) {
		int x=1;//if x=2 means will get even; if x=1 meANS WILL odd numbers
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%4d",x);
				//x++;
				x+=2;//odd numbers
			}System.out.println();
		}

	}

}
