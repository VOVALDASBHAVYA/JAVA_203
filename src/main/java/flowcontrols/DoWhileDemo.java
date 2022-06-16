package flowcontrols;

public class DoWhileDemo {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			System.out.println(i);
			++i;
		}while(i<=10);
	}

}*/
	public static void main(String args[]) {
		int i=100,sum=0;
		do {
			//System.out.println(i);
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println(sum);
	}}
