package PatternsPractise;
//////i didn't got the logic
public class Patternprogram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int size=3;
		for(int i=size;i>=-size;i--) {
			for(int j=size;j>=Math.abs(i);j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}*/
		for(int i=1;i<=5;i++) {
		for(int j=5;j>=1;j--) {
			if(i>=j) {
				System.out.print("*");
			}else
			{
				System.out.print("");
			}
		}
		System.out.print("\n");
		}
	}
}
