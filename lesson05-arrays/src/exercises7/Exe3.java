package exercises7;

import java.util.Arrays;

public class Exe3 {

	public static void main(String[] args) {
		
		//The original array
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*11);
		}
		System.out.println(Arrays.toString(arr));
		
		//The organized array
		int[] arr2 = new int[10];
		//The number of unduplicated numbers
		int l = 0;
		
		//Transferring from original to organized  
	lbl: for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < l; j++) {
				if(arr[i] == arr2[j]) {
					continue lbl;
				}
			}
			arr2[l] = arr[i];
			l++;
		}
		
		System.out.println(l);
		
		//Rearranging organized array size
		int[] arrt = new int[l];
		System.arraycopy(arr2, 0, arrt, 0, l);
		arr2 = arrt;
		System.out.println(Arrays.toString(arr2));
	}

}
