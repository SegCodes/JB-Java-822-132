package e.exercise;

public class Rectangle {
	
	private int width;
	private int length;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws IllegalWidthLengthException {
		if(width >= 0) {			
			this.width = width;
		} else {
			IllegalWidthLengthException e = new IllegalWidthLengthException("Cannot enter negative value to width.");
			throw e;
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) throws IllegalWidthLengthException {
		if(length >= 0) {
			this.length = length;
		} else {
			IllegalWidthLengthException e = new IllegalWidthLengthException("Cannot enter negative value to length.");
			throw e;
			// throw new Exception("Cannot enter negative value to length.");
		}
	}
	
}