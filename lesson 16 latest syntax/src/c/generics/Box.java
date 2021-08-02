package c.generics;

public class Box<T> { // Generic class is defined with type parameters (T).

	private T content;

	public Box(T content) {
		super();
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	public static void main(String[] args) {
		// WHen creating an object from generic class we assign a type argument.
		Box<Integer> boxOfInt = new Box<>(5);
		Box<String> boxOfStr = new Box<>("Off");
		
		boxOfInt.setContent(50);
		boxOfStr.setContent("On");
		
		int x = boxOfInt.getContent();
		String str = boxOfStr.getContent();
	}

}
