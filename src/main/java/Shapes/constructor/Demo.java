package constructor;

public class Demo {
Demo(){
	System.out.println("Default constructor");
}
Demo(int i){
	System.out.println("parameterized constructor");
}
	public static void main(String[] args) {
			Demo d=new Demo(10);
			System.out.println("From Demo"+d);
		}

	}


