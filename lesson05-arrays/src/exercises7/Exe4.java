package exercises7;

import java.util.Arrays;

public class Exe4 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int[] arr2 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*11);
			arr2[(arr2.length - 1) - i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

}
