/**
 * 
 */
package objectOrientedProgramingAssignment;

/**
 * @author amer.sangha
 * @Date: February 25, 2022
 * @File: MySavingsOutputTest
 * @Description: Class to execute methods from MySavings class using object oriented programming
 */

import java.util.*;
public class MySavingsOutputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please enter the total in the bank currently: ");
			
			double total = sc.nextDouble();
			MySavings bank = new MySavings(total); // create bank object
			
			while (true) { // loop menu and methods 
				
			System.out.print(menu()); // call menu method
			
			int MenuChoice = sc.nextInt();
			
			if (MenuChoice == 0) {
				
				System.out.println("Program ended.");
				break;
			}
			
			switch (MenuChoice) { // choices based on user input
						
			case 1:
				System.out.println();
				System.out.println(bank.showTotal()); // show total
				System.out.println();
				break;
				
			case 2:
				System.out.println();
				bank.addPenny(); // add penny
				System.out.println();
				break;
				
			case 3:
				System.out.println();
				bank.addNickel(); // add nickel
				System.out.println();
				break;
				
			case 4:
				System.out.println();
				bank.addQuarter(); // add quarter
				System.out.println();
				break;
				
			case 5:
				System.out.println();
				bank.addDime(); // add dime
				System.out.println();
				break;
				
			case 6:
				System.out.println();
				System.out.print("Enter amount you would like to remove: ");
				double amount = sc.nextDouble();
				bank.removeMoney(amount); // remove entered amount
				System.out.println();
				break;
				
				}
			}
		}
		catch (Exception e) {
			System.out.println("Invalid entry, program ended.");
			}
		}
	
	public static String menu() {
		
		// create menu
		String m = "1. Show total in bank\n"
				+ "2. Add a penny\n"
				+ "3. Add a nickel\n"
				+ "4. Add a quarter\n"
				+ "5. Add a dime\n"
				+ "6. Take money out of the bank\n"
				+ "Enter 0 to quit\n"
				+ "Enter your choice: ";
		
		return m;
	}

}