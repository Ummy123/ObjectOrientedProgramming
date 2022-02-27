/**
 * 
 */
package objectOrientedProgramingAssignment;

/**
 * @author amer.sangha
 * @Date: February 25, 2022
 * @File: MySavings
 * @Description: Class for manipulating total
 */
public class MySavings {

	
	//private variable for the class
	private double total;
	
	/***********************
	 * Constructor Default
	 * Set standard to one
	 **********************/
	public MySavings() {
		
		total = 0;
		
	}
	
	/******************************
	 * Constructor Default
	 * Set total to value entered
	 *********************************/
	public MySavings(double total) {
		
		this.total = total;
	}
	
	/**
	 * gets total
	 * @return total
	 */
	public double getTotal() {
		
		return total;
				
	}
	
	/************************************************
	 * @precondition inputed value is a double
	 * @return total displayed
	 * @postcondition returns a string
	 * @description displays the total amount
	 ***********************************************/
	public String showTotal() {
		
		total = Math.round(total * 100.0) / 100.0;
		
		return "The total is " + total;
	}
	
	/************************************************
	 * @precondition inputed value is a double
	 * @return total
	 * @postcondition returns a double
	 * @description adds a penny to the total
	 ***********************************************/
	public double addPenny() {
		
		total = total + 0.01;
		return total;
		
	}
	
	/************************************************
	 * @precondition inputed value is a double
	 * @return total
	 * @postcondition returns a double
	 * @description adds a nickel to the total
	 ***********************************************/
	public double addNickel() {
		
		total = total + 0.05;
		return total;
		
	}
	
	/************************************************
	 * @precondition inputed value is a double
	 * @return total
	 * @postcondition returns a double
	 * @description adds a dime to the total
	 ***********************************************/
	public double addDime() {
		
		total = total + 0.1;
		return total;
		
	}
	
	/************************************************
	 * @precondition inputed value is a double
	 * @return total
	 * @postcondition returns a double
	 * @description adds a quarter to the total
	 ***********************************************/
	public double addQuarter() {
		
		total = total + 0.25;
		return total;
		
	}
	
	/************************************************
	 * @precondition inputed value is a double
	 * @return total
	 * @postcondition returns a double
	 * @description removes money from the total
	 ***********************************************/
	public double removeMoney(double amount) {
		
		if (amount > total || amount < 0) { // check if operation is possible
			System.out.println("Unable to perform, invalid entry.");
		}
		
		else {
			total = total - amount;
		}
		return total;
	}
	
}