package exercises7;

import java.util.Arrays;

public class Exe1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			sum+=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.printf("Sum: %d.%n", sum);
		System.out.println("Average: " + (double)(sum/arr.length));
	}

}
