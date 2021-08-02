package app.core;

public class App {

	public static void main(String[] args) {
		
		Store store = new Store();
		store.addItem(new Item(101, "Bread", 6.80));
		store.addItem(new Item(102, "Milk", 5.94));
		store.addItem(new Item(103, "Potatos", 19.32));
		store.printItems();
		
		store.removeItem(102);
		store.printItems();
		
		Item item = store.getItem(103);
		System.out.println(item);
		
		if(item != null) {
			item.setPrice(item.getPrice()*1.1);
			System.out.println(item);
		}
		store.printItems();
	}
	
}
