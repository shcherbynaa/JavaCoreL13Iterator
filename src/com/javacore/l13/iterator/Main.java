package com.javacore.l13.iterator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ParliamentSingleton parliament = ParliamentSingleton.getInstance();
		System.out.println("Enter a num to make your choice");
		System.out.println();
		
		System.out.println("1. Add faction");
		System.out.println("2. Delete the fraction");
		System.out.println("3. Show all factions");
		System.out.println("4. Clear the faction");
		System.out.println("5. Show the faction");
		System.out.println("6. Add deputy to the faction");
		System.out.println("7. Delete deputy from the faction");
		System.out.println("8. Show all bribetakers");
		System.out.println("9. Show the main bribetaker");
		System.out.println("_________________________________");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: parliament.addFaction();
		break;
		
		case 2: parliament.deleteFaction();
		break;
		
		case 3: parliament.showFactions();
		break;
		
		case 4: parliament.deleteFaction();
		break;
		
		case 5: parliament.showTheFaction();
		break;
		
		case 6: parliament.addDeputyToFaction();
		break;
		
		case 7: parliament.deleteDeputyToFaction();
		break;
		
		case 8: parliament.showAllBribetakersFaction();
		break;
		
		case 9: parliament.showMainBribetakersFaction();
		break;
		}
	}

}
