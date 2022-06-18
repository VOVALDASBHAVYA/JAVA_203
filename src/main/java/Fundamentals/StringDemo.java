package Fundamentals;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hyderabad";
		String str2 = "BIBI NAGAR";
		System.out.println("String length=" + str.length());
		System.out.println("0 index character=" + str.charAt(0));
		System.out.println("d character index value=" + str.indexOf('d'));
		System.out.println("bad is there in str=" + str.contains("bad"));
		System.out.println("sub_string value=" + str.substring(6, 9));
		System.out.println("Uppercase=" + str.toUpperCase());
		System.out.println("Lower case=" + str.toLowerCase());
		System.out.println("Hello" + " " + str);
		String str1 = " Hi ";
		String str3="Hello";
		System.out.println(str1);
		System.out.println(str1.trim());
		System.out.println(str2);
		//// 2)concat
		System.out.println(str.concat(str2));
		System.out.println(str + " to " + str2);
		//// 1)length
		System.out.println(str.length() + " " + str1.length() + " " + str2.length());
		//// 3) String to char
		System.out.println("=============");
		char[] chars = str.toCharArray();
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		System.out.println(chars);
		System.out.println(chars1);
		System.out.println(chars2);
		// for(int i=0;i<chars.length;i++) {
		// for(int i=0;i<chars1.length;i++) {
		for (int i = 0; i < chars2.length; i++) {
			// System.out.println(chars[i]);
			// System.out.println(chars1[i]);
			System.out.println(chars2[i]);
		}
		//// 4)String charAt()
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		////5)java String compare To()
		System.out.println(str1.compareTo(str3));
		System.out.println(str.compareTo(str2));
		//6)string contains
		String str4="bad";
		System.out.println(str.contains(str4));
		System.out.println(str1.contains(str3));
		///7)java string split
		String str5 = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
		String[] split = str5.split("xyz");
		for (String obj: split) {
		System.out.println(obj);
		}
		////8)string index of
		String str6 = "Saket Saurav " + "performing a sos search";
		System.out.println(str6);
		System.out.println("index of 'p' is " + str6.indexOf('p'));
		System.out.println("index of 'u' is " + str6.indexOf('u'));
		System.out.println("last index of 'S' is " + str6.lastIndexOf('S'));
		System.out.println("last index of 's' is " + str6.lastIndexOf('s'));
		///9)java string to string
		Integer obj = new Integer(10);
		String str7 = obj.toString();
		String str8 = obj.toString(80);  ///sravani
		String str9 = obj.toString(9823, 2); 
		//The above line will represent the String in base 2
		System.out.println("The String representation is " + str7);
		System.out.println("The String representation is " + str8);
		System.out.println("The String representation is " + str9);
///10)string reverse
		String str10 = "plehgnitseterawtfos";
		StringBuffer sb = new StringBuffer(str10);
		sb.reverse();
		System.out.println(sb);
		////11)string replace()
		String replace = str.replace('y', 'i');
		System.out.println(str);
		System.out.println(replace);
///12)substring method
		System.out.println(str5.substring(8,12));
		//It will start from 8th character and extract the substring till 12th character
		System.out.println(str6.substring(15,19));
		////
		StringBuilder std = new StringBuilder("saket");
		System.out.println(std);
		System.out.println("length of std is " + std.length());
		std.setLength(10);
		System.out.println("Increased the length to 10, string = " + std);
		System.out.println("length = " + std.length());


	}

}
