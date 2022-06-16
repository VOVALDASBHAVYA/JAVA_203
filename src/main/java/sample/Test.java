package sample;

public class Test {

	public static void main(String[] args) {
	
		Test p = new Test();
		p.start();
	}

	void start() {
		
		boolean b1 = false;
		
		boolean b2 = fix(b1);
		System.out.println(b1 + " " + b2);
	}
	
	boolean fix(boolean b1) {
		b1 = true;
		System.out.println(b1);
		return b1;
		
		
	}

}
/*public void test(int x)
{
	int odd=1;
	if(odd)
	{
		System.out.println("odd");
		
	}
	else
	{
		System.out.println("even");
	}
}
*/