package a;

public class Bank {
	
	private Client[] clients;
	private float balance;
	private Logger logService;
	//private account_updater;
	private Logger logger;
	private static float commissionSum;
	
	private Bank() {
		this.clients = new Client[100];
		this.balance = 0;
		//this.logService = new Logger();
	}
	
	public void setBalance() {
		balance += commissionSum;
	}
	
	public float getClientsFortune() {
		float sum = 0;
		for(int i = 0; i < this.clients.length; i++) {
			sum += this.clients[i].getFortune();
		}
		return sum;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void addClient(Client c) {
		for(int i = 0; i < this.clients.length; i++) {
			if(this.clients[i] == null) {
				this.clients[i] = c;
				Logger.log(new Log(System.currentTimeMillis(), this.clients[i].getId(), "Client added", this.clients[i].getFortune()));
				return;
			}
		}
		System.out.println("Account addition failed: The bank is full.");
	}
	
	public void removeClient(Client c) {
		for(int i = 0; i < this.clients.length; i++) {
			if(this.clients[i].equals(c) && this.clients[i] != null) {
				Logger.log(new Log(System.currentTimeMillis(), this.clients[i].getId(), "Client removed", this.clients[i].getFortune()));
				this.clients[i] = null;
				return;
			}
		}
		System.out.println("Account removal failed: no account found.");
	}
	
	public Client[] getClients() {
		return this.clients;
	}
	
	//public void viewLogs() {
	
	//}

	//public void startAutoUpdater() {
	
	//}
	
	public static void addCommission(float f) {
		commissionSum += f;
	}
	
	//public void printClientList() {
	
	//}
	
	
}
