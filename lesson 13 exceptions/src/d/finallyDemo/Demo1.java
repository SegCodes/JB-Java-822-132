package d.finallyDemo;

import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {
		try {			
			String str = JOptionPane.showInputDialog("Enter number");
			int x = Integer.parseInt(str);
			if(Math.random() < 0.5) {
				System.out.println("...");
				x /= 0;
			}
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("This is not a number: " + e.getMessage());
			return;
		} catch (ArithmeticException e) {
			System.out.println("ArithemicError: " + e.getMessage());
			return;
		} catch (Exception e) {
			System.out.println("Some other error: " + e.getMessage());
			return;
		} finally {
			// Do it anyway block
			System.out.println("from finally block");
		}
		
		System.out.println("Success");

	}

}
