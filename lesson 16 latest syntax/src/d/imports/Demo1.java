package d.imports;

// Static imports - for importing static members (fields or methods)
import static java.lang.Math.PI;
import static java.lang.Math.random;

// Regular (non-static) imports - for importing types in other packages
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		// Static import will save us writing classes names.
		System.out.println(PI);
		System.out.println(random());
		
		// Import will saves us writing fully qualified names (package's name).
		Scanner sc;
	}

}
