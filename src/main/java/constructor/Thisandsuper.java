package constructor;
class Parent{
	Parent(){
		System.out.println("parent deafault");
	}
	Parent(int a){
		this();
		System.out.println("parent parameter");
	}
}
class Child extends Parent{
	public Child() {
		this(10);
		//super(10);
		System.out.println("child default");
	}
	public Child(int x) {
		super(10);
		System.out.println("child parameterized");
	}
}

public class Thisandsuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					Child c=new Child();	
	}

}
