package arrays;

import java.util.Arrays;

public class Exe4 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int[] back = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*11);
		}
		System.out.println("Original: " + Arrays.toString(arr));
		
		for(int i = 0; i < back.length; i++) {
			back[i] = arr[(arr.length-1) - i];
		}
		System.out.println("Reversed: " + Arrays.toString(back));

	}

}
