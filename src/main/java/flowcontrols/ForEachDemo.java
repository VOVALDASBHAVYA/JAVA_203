package flowcontrols;
/**
 * reading five value using for loop and for each loop
 * @author bv22074
 *
 */

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};//providing 5 values using array 
		System.out.println("--Normal for loop--");
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
		System.out.println("=-For each loop--");
		for(int k:arr) {
			System.out.println(k);
		}

	}

}
