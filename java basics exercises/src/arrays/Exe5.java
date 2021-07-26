package arrays;

import java.util.Arrays;

public class Exe5 {

	public static void main(String[] args) {
		
		int[][] cLass = new int[20][10];
		int cSum = 0;
		
		for(int i = 0; i < cLass.length; i++) {
			int sSum = 0;
			System.out.println("Student #" + (i+1) + "'s Grades: ");
			for(int j = 0; j < cLass[i].length; j++) {
				  cLass[i][j] = (int)(Math.random()*101);
				  cSum += cLass[i][j];
				  sSum += cLass[i][j];
			}
			System.out.println(Arrays.toString(cLass[i]));
			System.out.println("Student #" + (i+1) + "'s Average: " + sSum/cLass[i].length);
			System.out.println();
		}
		System.out.println("Class average: " + cSum/(cLass.length*cLass[0].length));

	}

}
