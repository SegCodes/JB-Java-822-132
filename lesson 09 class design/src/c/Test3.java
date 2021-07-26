package c;

public class Test3 {
	
	public static void main(String[] args) {
		
		Person p = new Person(300, "Moshe", 25);
		Person p2 = new Person(300, "Moshe", 25);
		
		System.out.println(p == p2);
		System.out.println(p.equals(p2));
	}
}
