package exercises7;

import java.util.Arrays;

public class Exe2 {

	public static void main(String[] args) {
		
		int[] arr = new int[50];
		arr[0] = (int)(Math.random()*101);
		int max = arr[0];
		int d = 0;
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			if(max<arr[i]) {
				max = arr[i];
				d = i;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Max num: " + max);
		System.out.println("Max index: " + d);

	}

}
