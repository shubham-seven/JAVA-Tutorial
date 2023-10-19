package oopsQuestions;

public class Account {

	private String firstName;
	 private String lastName;
	private String IFSC;
	private long accountNumber;
	private double balance;
	
	public Account(String firstName,String lastName,String IFSC,long accountNumber,double balance) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.IFSC=IFSC;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String IFSC) {
		this.IFSC=IFSC;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
}
