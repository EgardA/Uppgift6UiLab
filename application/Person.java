package application;

import java.util.*;

public class Person {
	
	private String name;
	private String pNbr;
	private LinkedList<Account> ownedAccounts = new LinkedList<>();
	private double pBalance;
	
	
		
	

	public Account findAccount(String nbr) {
		
		Account foundAccount = null;
		
		for (int i = 0; i < ownedAccounts.size(); i++) {
			
			if (nbr == ownedAccounts.get(i).getNbr()) {
				
				foundAccount = ownedAccounts.get(i);
				
				
			}
			
		}
		
		return foundAccount;
		
		
	}
	
	
	
	public double totBalance() {
		
		for (int i = 0; i < ownedAccounts.size(); i++) {
			
			pBalance = pBalance + ownedAccounts.get(i).getBalance();
			
		}
		
		return pBalance;
		
	}
		
	public void setPersonName(String newName) {
		
		name = newName;
		
	}
	
	public String getPersonName() {
		
		return name;
		
	}
	
	public LinkedList<Account> getOwnedAccounts () {
		
		 return ownedAccounts;
		
	}
	
	public void setOwnedAccounts(LinkedList<Account> newOwnedAccounts) {
		
		ownedAccounts = newOwnedAccounts;
		
	}

	public void addAccount(Account anAccount) {
		
		getOwnedAccounts().add(anAccount);
		
	}
	
	public void setpNbr(String newpNbr) {
		
		pNbr = newpNbr;
		
	}
	
	public String getpNbr() {
		
		return pNbr;
				
	}
}
