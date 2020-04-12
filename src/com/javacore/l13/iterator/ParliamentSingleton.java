package com.javacore.l13.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ParliamentSingleton {
	
	private static ParliamentSingleton instance;
	private ParliamentSingleton() {}
	
	public static ParliamentSingleton getInstance() {
		if(instance == null) {
			instance = new ParliamentSingleton();
		}
		return instance;
	}
	
	List<Faction> parliament = new ArrayList<Faction>();
	
	//add faction
	public void addFaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter faction name: ");
		String name = sc.next();
		
		parliament.add(new Faction(name));
	}
	
	public void deleteFaction() {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter fraction name to delete: ");
		String name = sc.next();
					
		Iterator<Faction> iterator =  parliament.iterator();

		while(iterator.hasNext()) {
			Faction next = iterator.next();
			if(next.getName() == name)
				iterator.remove();
		}
	}
	
	//show all factions
	public void showFactions() {
		Iterator<Faction> iterator =  parliament.iterator();
		while(iterator.hasNext()) {
			Faction next = iterator.next();
				System.out.println(next);
		}
	}
	
	//show the fraction
	public void showTheFaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fraction name to delete: ");
		String name = sc.next();
		
		Iterator<Faction> iterator = parliament.iterator();
		
		while(iterator.hasNext()) {
			Faction next = iterator.next();
			if(next.getName() == name) {
				System.out.println(next.getName());
			}
		}
	}
	
	public void addDeputyToFaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fraction name to add a deputy: ");
		String name = sc.next();
		
		Iterator<Faction> iterator = parliament.iterator();
		while(iterator.hasNext()) {
			Faction next = iterator.next();
			if(next.getName() == name) {
				next.addDeputy();
				}
		}
	}
	
	public void deleteDeputyToFaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fraction name to delete a deputy: ");
		String name = sc.next();
		
		Iterator<Faction> iterator = parliament.iterator();
		while(iterator.hasNext()) {
			Faction next = iterator.next();
			if(next.getName() == name) {
				next.deleteDeputy();
				}
		}
	}
	
	public void showAllBribetakersFaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fraction name to see all bribetakers: ");
		String name = sc.next();
		
		Iterator<Faction> iterator = parliament.iterator();
		while(iterator.hasNext()) {
			Faction next = iterator.next();
			if(next.getName() == name) {
				next.showBribetakers();
				}
		}
	}
	
	public void showMainBribetakersFaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fraction name to see the main bribetakers: ");
		String name = sc.next();
		
		Iterator<Faction> iterator = parliament.iterator();
		while(iterator.hasNext()) {
			Faction next = iterator.next();
			if(next.getName() == name) {
				next.showMainBribetakers();
				}
		}
	}
	
	public void showAllDeputiesFaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fraction name to see the main bribetakers: ");
		String name = sc.next();
		
		Iterator<Faction> iterator = parliament.iterator();
		while(iterator.hasNext()) {
			Faction next = iterator.next();
			if(next.getName() == name) {
				next.showAllDeputies();
				}
		}
	}
}
