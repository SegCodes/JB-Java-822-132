package homework;

import java.util.Arrays;

public class Tar4 {

	public static void main(String[] args) {
		// create an array
		int[] arr1 = new int[10];
		// populate with random numbers
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 11);
		}
		// print
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = new int[10];

		for (int i = 0, j = 9; i < arr1.length; i++, j--) {
			arr2[j] = arr1[i];
		}

		System.out.println(Arrays.toString(arr2));

	}

}
