package a;

public class Demo2 {

	public static void main(String[] args) {
		
		//static array initialization
		int[] nums = {1, 5, 7, 89, 123, 15};
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		System.out.println("=======================");
		
		//print array
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
	}

}
