<<<<<<< Upstream, based on origin/master
package f.enhanced;

import java.util.Scanner;

public class Demo2ARM {

	public static void main(String[] args) {
		
		// ARM - Auto Resource Management.
		
		// try with resources is ARM.
		// Said resources will be automatically closed.
		try (Scanner sc = new Scanner(System.in); Phone p = new Phone();) {
			System.out.print("Enter name: "); 
			String name = sc.nextLine();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
=======
package f.enhanced;

import java.util.Scanner;

public class Demo2ARM {

	public static void main(String[] args) {
		
		// ARM - Auto Resource Management.
		
		// try with resources is ARM.
		// Said resources will be automatically closed.
		try (Scanner sc = new Scanner(System.in); Phone p = new Phone();) {
			System.out.print("Enter name: "); 
			String name = sc.nextLine();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
>>>>>>> 2904016 Updated code.
}