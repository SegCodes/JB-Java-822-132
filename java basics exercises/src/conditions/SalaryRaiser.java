package conditions;

public class SalaryRaiser {

	public static void main(String[] args) {
		
		int sal = (int)(Math.random()*1001) + 5000;
		System.out.println("Before: " + sal);
		
		if(sal*1.1 < 6000) {
			sal*=1.1;
		}
		System.out.println("After: " + sal);
	}

}
