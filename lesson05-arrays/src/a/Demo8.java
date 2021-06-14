package a;

import java.util.Arrays;

public class Demo8 {

	public static void main(String[] args) {
		// create an array with length of 3
		int[] arr = {2,4,6};
		
		// print array
		System.out.println(Arrays.toString(arr));
		
		// create temporary longer array
		int[] arr2 = new int[5];
		
		// copy elements from array to temporary array
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		// assign the arr reference to the new array
		arr = arr2;
		
		// print updated array
		System.out.println(Arrays.toString(arr));
		

	}

}
