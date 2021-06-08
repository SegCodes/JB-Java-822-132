package b;

public class BoxApp {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(5, 2, 3);
		
		b1.height = 9;
		b1.length = 4;
		b1.width = 3;
		
		System.out.println("Box 1 dimensions: H-" + b1.height + ", W-" + b1.width + ", L-" + b1.length + ".");
		System.out.println("Box 2 dimensions: H-" + b2.height + ", W-" + b2.width + ", L-" + b2.length + ".");
	}

}
