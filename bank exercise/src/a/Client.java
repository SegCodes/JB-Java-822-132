package a;

public abstract class Client {
	
	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	protected float commission_rate;
	protected float interest_rate;
	private Logger logger = new Logger(null);
	
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
				Logger.log(new Log(System.currentTimeMillis(), this.id, "Account added", a.getBalance()));
				return;
			}
		}
		System.out.println("Account Addition failed: Array is full for Client " + this.id);
	}
	
	public Account getAccount(int index) {
		if(this.accounts[index] != null) {
			return this.accounts[index];
		}else {
			System.out.println("No account in index " + index + " exists.");
			return null;
		}
	}
	
	public void removeAccount(Account a) {
		for(int i = 0; i < this.accounts.length; i++) {
			if(this.accounts[i].equals(a.getId()) && this.accounts[i] != null) {
				Logger.log(new Log(System.currentTimeMillis(), this.id, "Account removed", a.getBalance()));
				this.balance += a.getBalance();
				this.accounts[i] = null;
				return;
			}
		}
		System.out.println("Account removal failed - No account with ID: " + a.getId() + "was found.");
	}
	
	public void deposit(float amount) throws WithrawException {
		this.balance += amount - amount * this.commission_rate;
	}
	
	public void withdraw(float amount) throws WithrawException {
		if(amount > this.balance) {			
			this.balance -= amount + amount * this.commission_rate;
			Bank.addCommission(amount * this.commission_rate);
		} else {
			throw new WithrawException("Balance too low.", this.id, this.balance, amount); 
		}
	}
	
	public void autoUpdateAccounts() {
		for(int i = 0; i < this.accounts.length; i++) {
			if(accounts[i] != null) {
				this.accounts[i].setBalance(this.accounts[i].getBalance()*(1+this.interest_rate));
				Logger.log(new Log(System.currentTimeMillis(), this.id, "Account auto update", this.accounts[i].getBalance()*this.interest_rate));				
			}
		}
	}
	
	public float getFortune() {
		float sum = getBalance();
		for(int i = 0; i < this.accounts.length; i++) {
			if(this.accounts[i] != null) {				
				sum += this.accounts[i].getBalance();
			}
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
