package a;

public class A {
	
	private int x;
	private final int y; // Must be initalized in declaration or CTOR.
	
	public A(int y) {
		this.y = y;
		// Final Variables cannot be reassigned.
		// this.y = 500;
	}
	
	public void method1() {
		System.out.println("method");
	}
	
	// Final method cannot be overridden.
	public final void method2() {
		System.out.println("method");
	}
}
