package dot;

public class App1 {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(2, 5);
		
		p1.x = 7;
		p1.y = 9;
		
		System.out.println("P1 Coordinates: [" + p1.x + "," + p1.y + "].");
		System.out.println("P2 Coordinates: [" + p2.x + "," + p2.y + "].");
	}

}
