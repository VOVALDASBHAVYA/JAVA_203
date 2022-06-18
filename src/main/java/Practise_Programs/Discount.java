package Practise_Programs;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dis,amount,markedprice,s;
		markedprice=1000;
		dis=25;
		System.out.println("Markedprice = "+markedprice);
		System.out.println("Discount rate = "+dis);
		s=100-dis;
		amount=(s*markedprice)/100;
		System.out.println("amount after disount = "+amount);
	}

}
