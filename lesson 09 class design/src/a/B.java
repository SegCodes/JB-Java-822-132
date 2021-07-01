package a;

public final class B extends A {

	public B(int y) {
		super(y);
	}
	
	public void method1() {
		System.out.println("method");
	}
	
	// Final method cannot be overridden.
	/*public final void method2() {
		System.out.println("method");
	}*/
}