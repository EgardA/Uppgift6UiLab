package application;

import java.util.*;

public class Account{
	
	
	private Person owner;
	private String nbr;
	private static double balance = 0;

	
	System.out.println ("fabricexzd");
	public static void credit(double amount) {
		
		balance = balance + amount;
		
	}
	
	public static void withdraw(double amount) {
		
		balance = balance - amount;
		
	}
	
	public double getBalance() {
		
		return balance;
		
	}
	
	public String getNbr() {
		
		return nbr;
		
	}
	
	public void setNbr(String newNbr) {
		
		nbr = newNbr;
		
	}
	
	public static double print() {
		
		System.out.println("Ditt saldo �r: " + balance);
		return balance;
		
	}
	

	
	public Person getOwner() {
		
		return owner;
		
	}
	
	public void setOwner (Person newOwner) {
		
		owner = newOwner;
		
	}

}




