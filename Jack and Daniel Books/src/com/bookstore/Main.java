package com.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	private Customer currentCustomer = new Customer();

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/University", "postgres", "postgres");
	            Statement statement = connection.createStatement();){
			
			final Scanner myObj = new Scanner(System.in); 
			System.out.println("(1) Login Returning Customer");
			System.out.println("(2) Restistar New Customer");
			System.out.println("(3) Sign in as Owner");
			System.out.println("(4) Search Inventory");
			System.out.println("(0) Exit");

			String choice = myObj.nextLine(); 
			myObj.close();
			
			if (choice == "1") {
				
				
			}
			
			if (choice == "2") {
				
			}
			
			if (choice == "3") {
				
			}

			if (choice == "4") {
	
			}
			
			if (choice == "0") {
				return;
			}
			
		} catch (Exception sqle) {
	            System.out.println("Exception: " + sqle);
	    }

	}

}
