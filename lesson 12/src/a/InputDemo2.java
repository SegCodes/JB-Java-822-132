package a;

import javax.swing.JOptionPane;

public class InputDemo2 {

	public static void main(String[] args) {
		
		// Input via window.
		String name = JOptionPane.showInputDialog("Enter your name:");
		
		// Message via window.
		JOptionPane.showMessageDialog(null,"Hello " + name + ".");

	}

}
