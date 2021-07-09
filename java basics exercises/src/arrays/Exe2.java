package arrays;

public class Exe2 {

	public static void main(String[] args) {

		int[] arr = new int[50];
		int max = 0;
		int ind = 0;
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			if(arr[i] > max) {
				max = arr[i];
				ind = i;
			}
		}
		System.out.println("]");
		System.out.println("Max: " + max + ", Index: " + ind);
	}

}
