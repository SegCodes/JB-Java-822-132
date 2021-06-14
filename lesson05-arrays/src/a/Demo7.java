package a;

public class Demo7 {

	public static void main(String[] args) {
		String[] arr = {"aaa","bbb","ccc"};
		
		System.out.println(arr[0]); // lowest index
		System.out.println(arr.length-1); //highest index
		System.out.println(arr[300]); // out of bounds - too high
		System.out.println(arr[-300]); // out of bounds - too low

	}

}
