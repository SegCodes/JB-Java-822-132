package c;

public class Test2 {

	public static void main(String[] args) {
		
		Person p = new Person(300, "Moshe", 25);
		Person p2 = new Person(300, "David", 27);
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
	}
	
}
