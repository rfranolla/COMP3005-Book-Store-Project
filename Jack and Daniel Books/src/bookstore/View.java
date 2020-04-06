package bookstore;

import java.util.Scanner;

public class View {
	
	public int mainMenu() {
		final Scanner myObj = new Scanner(System.in); 
		System.out.println("(1) User");
		System.out.println("(2) Restistar New Customer");
		System.out.println("(0) Exit");

		final int choice = myObj.nextInt(); 
		myObj.close();
		
		return choice;
	}

	public int userMenu() {
		final Scanner myObj = new Scanner(System.in); 
		System.out.println("(1) Search Books");
		System.out.println("(2) View Cart");
		System.out.println("(3) View Orders");
		System.out.println("(4) Login");
		System.out.println("(5) Sign In");
		System.out.println("(0) Exit");

		final int choice = myObj.nextInt(); 
		myObj.close();
		
		return choice;
	}

}
