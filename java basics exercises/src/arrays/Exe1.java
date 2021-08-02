package arrays;

public class Exe1 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int sum = 0;
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			sum += arr[i];
		}
		System.out.println("]");
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (sum/arr.length));
	}

}
