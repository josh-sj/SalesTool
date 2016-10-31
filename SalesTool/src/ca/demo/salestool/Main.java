package ca.demo.salestool;

import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();

		displayGreeting();
		data.display();
	}
	
public static void displayGreeting(){
	//String GREET1 = "HELLO HAPPY SALES PEOPLE!";
	
	 
	System.out.println("Hello Happy Sales People");
	System.out.println("This app shares sales data.");
	
	System.out.println("Test 1");
	System.out.println("Test 2 added from github");
	}
}
