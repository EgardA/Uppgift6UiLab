package application;

import java.util.*;

public class PersonRegister {
	
	private LinkedList<Person> persons = new LinkedList<>();
	
	public void addPerson(Person p) {
		
		getPersons().add(p);
		
	}

	public Person findPerson(String pNbr) {
			
		Person foundPerson = null;
			
		for (int i = 0; i < persons.size(); i++) {
				
			if (pNbr == persons.get(i).getpNbr()) {
					
				foundPerson = persons.get(i);
					
					
				}
				
			}
			
			return foundPerson;
		
		
	}
	
	public Person removePerson(String pNbr) {
		
		Person personToRemove = findPerson(pNbr);
		
		int indexToRemove = persons.indexOf(personToRemove);
		
		persons.remove(indexToRemove);
		
		return personToRemove;
		
	}
	
	public Account findAccount(String pNbr, String nbr) {
		
		Person personToCheck = findPerson(pNbr);
		
		Account foundAccount = personToCheck.findAccount(nbr);
		
		return foundAccount;
		
	}
	
	public double totBalancePerson(String pNbr) {
		
		Person personToCheck = findPerson(pNbr);
		
		double personBalance = personToCheck.totBalance();
		
		return personBalance;
	}
	
	public LinkedList<Person> getPersons () {
		
		 return persons;
	
	}
	
}
