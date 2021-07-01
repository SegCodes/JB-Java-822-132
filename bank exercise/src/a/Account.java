package a;

public class Account {
	
	private int id;
	private float balance;
	
	public Account(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		//Logger.log(new Log(System.currentTimeMillis(), this.id, "Balance changed", balance-this.balance));
		this.balance = balance;
		
	}

	public int getId() {
		return id;
	}
	
	public boolean equals(int id) {
		if(this.id == id) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
