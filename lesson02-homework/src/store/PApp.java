package store;

public class PApp {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product("Vaccum Cleaner", "Utilites", 129.99);
		
		p1.name = "Healing Crystal";
		p1.category = "Mysticism";
		p1.price = 1999.99;
		
		System.out.println("Product Details: Name-" + p1.name + ", Category-" + p1.category + ", Price-" + p1.price + ".");
		System.out.println("Product Details: Name-" + p2.name + ", Category-" + p2.category + ", Price-" + p2.price + ".");
	}

}
