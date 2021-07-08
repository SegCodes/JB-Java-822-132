package app.core;

public class Store {
	
	// Attributes
	private Item[] items = new Item[10];
	
	// CTOR
	public Store() {
		
	}
	
	// Methods
	public void addItem(Item item) {
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
			
		}
	}
	
	public void removeItem(int itemId) {
		for(int i = 0; i < items.length; i++) {
			// In case of an Object parameter use equals().
			if(items[i] != null && items[i].getId() == itemId) {
				items[i] = null;
				break;
			}
			
		}
	}
	
	public void printItems() {
		System.out.println("====================");
		System.out.println("Store Items:");
		for (int i = 0; i < items.length; i++) {
			if(items[i] != null) {				
				System.out.println(items[i]);
			}
		}
		System.out.println("====================");
	}
	
	public Item getItem(int itemId) {
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null && items[i].getId() == itemId) {
				return items[i];
			}
		}
		return null;
	}
	
	public void raiseEntireStore(double percent) {
		double rate = 1 + percent / 100;
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null) {
				items[i].setPrice(items[i].getPrice()*rate);
			}
		}
	}
	
	public void raisePrice(int itemId, double percent) {
		double rate = 1 + percent / 100;
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null && items[i].getId() == itemId) {
				items[i].setPrice(items[i].getPrice()*rate);
				break;
			}
		}
	}
	
	public void showOverPrice(double price) {
		System.out.println("====================");
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null && items[i].getPrice() >= price) {System.out.println(items[i]);}
		}
		System.out.println("====================");
	}

	public void showUnderPrice(double price) {
		System.out.println("====================");
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null && items[i].getPrice() <= price) {System.out.println(items[i]);}
		}
		System.out.println("====================");
	}
}
