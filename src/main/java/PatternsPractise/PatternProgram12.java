package PatternsPractise;

public class PatternProgram12 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for(int i=3;i>=-3;i--) {
			for(int j=1;j<=Math.abs(i);j++){
				System.out.print("");
			}
			for(int k=3;k>=Math.abs(i);k--) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}

	}

}
