package a;

public abstract class Client {
	
	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	protected float commission_rate;
	protected float interest_rate;
	private Logger logger;
	
	public Client(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	public void addAccount(Account a) {
		for(int i = 0; i < this.accounts.length; i++) {
			if(this.accounts[i] == null) {
				this.accounts[i] = a;
				Logger.log(new Log(0,a.getId(), "Account added", a.getBalance()));
				break;
			}
		}
	}
	
	public Account getAccount(int index) {
		if(this.accounts[index] != null) {
			return this.accounts[index];
		}else {
			return null;
		}
	}
	
	public void removeAccount(Account a) {
		for(int i = 0; i < this.accounts.length; i++) {
			if(this.accounts[i].equals(a.getId())) {
				Logger.log(new Log(0, a.getId(), "Account removed", a.getBalance()));
				this.balance += a.getBalance();
				this.accounts[i] = null;
				break;
			}
		}
	}
	
	public void deposit(float amount) {
		this.balance += amount - amount * this.commission_rate; 
	}
	
	public void withdraw(float amount) {
		this.balance -= amount + amount * this.commission_rate;
		Bank.addCommission(amount * this.commission_rate);
	}
	
	public void autoUpdateAccounts() {
		for(int i = 0; i < this.accounts.length; i++) {
			this.accounts[i].setBalance(this.accounts[i].getBalance()*(1+this.interest_rate));
			Logger.log(new Log(0, this.accounts[i].getId(), "Account auto update", this.accounts[i].getBalance()*this.interest_rate));
		}
	}
	
	public float getFortune() {
		float sum = 0;
		for(int i = 0; i < this.accounts.length; i++) {
			sum += this.accounts[i].getBalance();
		}
		return sum + this.balance;
	}
	
	public boolean equals(Client c) {
		if(this.id == c.getId()) {
			return true;
		}else {
			return false;
		}
	}
}
