package c.applicationExceptions;

public class Demo1 {

	public static void main(String[] args) {
		try {			
			Object classInstance = Class.forName("java.lang.String");
			System.out.println(classInstance);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}