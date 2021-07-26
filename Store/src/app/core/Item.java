package app.core;

import java.util.Objects;

public class Item {
	
	// Attributes
	private int id;
	private String name;
	private double price;

	// Constructor
	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		setPrice(price); // Use the method to check the price
	}

	// Methods
	public void print() {
		System.out.println(this); // sysou(Object) prints it by accessing its toString().
	}

	public void setPrice(double price) {
		// Checks if the price isn't negative
		if (price >= 0) {
			this.price = price;
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item)) {
			return false;
		}
		Item other = (Item) obj;
		return id == other.id;
	}
	
	
}
