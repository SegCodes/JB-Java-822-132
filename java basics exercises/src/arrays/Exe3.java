package arrays;

import java.util.Arrays;

public class Exe3 {

	public static void main(String[] args) {

		int[] org = new int[10];
		int[] temp = new int[org.length];
		int l = 0;

		for(int i = 0; i < org.length; i++) {
			org[i] = (int)(Math.random()*11);
		}
		System.out.println("Original: " + Arrays.toString(org));
		
		for(int i = 0; i < org.length; i++) {
			int j = 0;
			for(j = 0; j < l; j++) {
				if(temp[j] == org[i]) {
					break;
				}
			}
			if(j == l) {					
				temp[j] = org[i];
				l++;			
			}
		}
		System.out.println("Temporary: " + Arrays.toString(temp));
		
		int[] edited = new int[l];
		System.arraycopy(temp, 0, edited, 0, l);
		System.out.println("Final: " + Arrays.toString(edited));
	}

}
