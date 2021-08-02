package b;

public class Test {
	public static void main(String[] args) {
		
		Point p1 = new Point(5, 2);
		Point p2 = new Point(5, 2);
		Point p3 = new Point(10, 4);
			
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p2.hashCode());
		System.out.println(p2.equals(p1));
	}
	
}
