<<<<<<< Upstream, based on origin/master
package e.exercise;

import javax.swing.JOptionPane;

public class RectTest {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();

		while (true) {
			try {
				rect.setWidth(Integer.parseInt(JOptionPane.showInputDialog("Enter Rectangle width:")));
				rect.setLength(Integer.parseInt(JOptionPane.showInputDialog("Enter Rectangle length:")));
				break;
			} catch (IllegalWidthLengthException | NumberFormatException e) {
				System.out.println("Input Error: " + e);		
			} catch (Exception e) {
				System.out.println("General Error: " + e.getMessage());				
			}
		}
		
		System.out.println("Rectangle [Width=" + rect.getWidth() + ",  Length=" + rect.getLength() + "]");
		System.out.println("Rectangle Space: " + rect.getLength() * rect.getWidth());
	}

=======
package e.exercise;

import javax.swing.JOptionPane;

public class RectTest {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();

		while (true) {
			try {
				rect.setWidth(Integer.parseInt(JOptionPane.showInputDialog("Enter Rectangle width:")));
				rect.setLength(Integer.parseInt(JOptionPane.showInputDialog("Enter Rectangle length:")));
				break;
			} catch (IllegalWidthLengthException | NumberFormatException e) {
				System.out.println("Input Error: " + e);		
			} catch (Exception e) {
				System.out.println("General Error: " + e.getMessage());				
			}
		}
		
		System.out.println("Rectangle [Width=" + rect.getWidth() + ",  Length=" + rect.getLength() + "]");
		System.out.println("Rectangle Space: " + rect.getLength() * rect.getWidth());
	}

>>>>>>> 2904016 Updated code.
}