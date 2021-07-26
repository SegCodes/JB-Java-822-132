package a;

public class WithrawException extends Exception {
	
	private int clientId;
	private float currentBalance;
	private float withrawAmount;
	
	public WithrawException(String message, int clientId, float currentBalance, float withrawAmount) {
		super(message);
		this.clientId = clientId;
		this.currentBalance = currentBalance;
		this.withrawAmount = withrawAmount;
	}

	public int getClientId() {
		return clientId;
	}

	public float getCurrentBalance() {
		return currentBalance;
	}

	public float getWithrawAmount() {
		return withrawAmount;
	}
	
}
