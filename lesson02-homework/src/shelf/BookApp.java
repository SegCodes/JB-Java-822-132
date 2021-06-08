package shelf;

public class BookApp {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("The Catcher in the Rye", "J.D.Salinger", 1951, 39.99);
		
		b1.title = "Bazinga";
		b1.author = "Sheldon Coooper";
		b1.year = 2007;
		b1.price = 59.99;
		
		System.out.println("Book Info: Title-" + b1.title + ", Author-" + b1.author + ", Year-" + b1.year + ", Price-" + b1.price + ".");
		System.out.println("Book Info: Title-" + b2.title + ", Author-" + b2.author + ", Year-" + b2.year + ", Price-" + b2.price + ".");
	}

}
