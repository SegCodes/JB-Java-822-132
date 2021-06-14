package a;

public class Demo5 {

	public static void main(String[] args) {
		
		int[][] gradeMatrix = new int[20][5];
		
		//gradeMatrix[0][0] = 100;
		//gradeMatrix[0][1] = 90;
		
		//the row of arrays
		for (int i = 0; i < gradeMatrix.length; i++) {
			System.out.printf("Student #%d's grades:\t", i);
			//the array itself
			for (int j = 0; j < gradeMatrix[i].length; j++) {
				gradeMatrix[i][j] = (int)(Math.random()*101);
				System.out.printf("%d\t", gradeMatrix[i][j]);
			}
			System.out.println();
		}
		
	}

}
