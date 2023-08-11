package privatevariable;

public class Account {
	
	private long pin;
	private double balance;
		
	
	
	public  Account(long pin,double balance) {
		// TODO Auto-generated constructor stub
		this.pin=pin;
		this.balance=balance;
	} 
	public long getPin() {
		return pin;
		
	}
		public double getBalance() {
			return balance;
		}
	}


