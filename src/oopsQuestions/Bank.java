package oopsQuestions;
/*Write a Java program to create a class called "Bank" with a collection of accounts and methods to add
and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain 
account details of a particular customer. 
*/

import java.util.ArrayList;

public class Bank {

	
	private ArrayList<Account> accountsDetails = new ArrayList<Account>();
	
	public void addAccount(Account customer) {
		accountsDetails.add(customer);
	}
	
public void removeAccount(Account customer) {
	accountsDetails.remove(customer);
	}

public void creditMoney(double money) {
	
	}

public void debitMoney(Account customer) {
	accountsDetails.remove(customer);
	}
}
