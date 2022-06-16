package PatternsPractise;
/**
 * print wave pattern using for loop
 * @author bv22074
 *
 */

public class WavePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wave_height=5;//we can change wave height to 4 or 10 like that
		int wave_length=4;
		for(int i=1;i<=wave_height;++i) {
			for(int j=1;j<=wave_length;j++) {
			for(int k=1;k<=wave_height;++k) {
				if(i==k ||i+k==wave_height+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			}
			System.out.println(" ");
		}
		
		

	}

}
