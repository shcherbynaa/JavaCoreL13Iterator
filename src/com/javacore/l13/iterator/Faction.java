package com.javacore.l13.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction  {
	
	String name;
	List<Deputy> faction = new ArrayList<Deputy>();

	public Faction(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Deputy> getFaction() {
		return faction;
	}


	public void setFaction(List<Deputy> faction) {
		this.faction = faction;
	}


	//add deputy
	public void addDeputy() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter surname: ");
		String surname = sc.next();
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter if bribetaker (true or false): ");
		boolean isBribe = sc.hasNext();

		Deputy deputy = new Deputy(surname, name, age, isBribe);
		
		faction.add(deputy);

	}
	

	//delete deputy
	public void deleteDeputy() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter surname: ");
		String surname = sc.next();
		
		System.out.println("Enter name: ");
		String name = sc.next();
				
		Iterator<Deputy> iterator =  faction.iterator();
		while(iterator.hasNext()) {
			Deputy next = iterator.next();
			if((next.getSurname() == surname) && (next.getName() == name)) {
				System.out.println(next);
				iterator.remove();
			}
		}
	}
	
	//show all bibertakers 
	public void showBribetakers() {
		Iterator<Deputy> iterator =  faction.iterator();
		while(iterator.hasNext()) {
			Deputy next = iterator.next();
			if(next.isBribetaker() == true) {
				System.out.println(next);
			}
		}
	}
	
	//show the most bibertaker
	public void showMainBribetakers() {
		Iterator<Deputy> iterator =  faction.iterator();
		int biber = 0;
		Deputy d = null;
		while(iterator.hasNext()) {
			Deputy next = iterator.next();
			if(next.getSum() > biber) {
				System.out.println(next);
				biber = next.getSum();
				System.out.println("Nom the highest biber is .... ");
				d = next;
			}
		}
		System.out.println("The main bibertaker is - " + d);
	}

	//show all deputies
	public void showAllDeputies() {
		Iterator<Deputy> iterator =  faction.iterator();
		while(iterator.hasNext()) {
			Deputy next = iterator.next();
			System.out.println(next);	
		}
	}
	
	public void clearFaction() {
		faction.clear();
	}
}
