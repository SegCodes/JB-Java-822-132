package exercises7;

public class Exe5 {

	public static void main(String[] args) {

		int[][] cLass = new int[20][10];
		int cSum = 0;
		
		for(int i = 0; i < cLass.length; i++) {
			int sSum = 0;
			System.out.printf("Student #%d's grades:\t", i);
			for(int j = 0; j < cLass[i].length; j++) {
				cLass[i][j] = (int)(Math.random()*101);
				sSum += cLass[i][j];
				System.out.print(cLass[i][j] +"\t");
			}
			cSum += sSum;
			System.out.println();
			System.out.println("Student #" + i + "'s average:\t" + (double) sSum / cLass[i].length);
			System.out.printf("%n%n");
		}
		System.out.print("Class Average:\t" + (double) cSum/(cLass.length*cLass[0].length));

	}

}
