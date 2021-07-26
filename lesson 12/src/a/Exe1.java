package a;


import javax.swing.JOptionPane;

public class Exe1 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the Second number:"));
		
		JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1 + n2));

	}

}
