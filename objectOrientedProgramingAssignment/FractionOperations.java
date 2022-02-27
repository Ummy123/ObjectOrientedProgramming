/**
 * 
 */
package objectOrientedProgramingAssignment;

/**
 * @author amer.sangha
 * @Date: February 25, 2022
 * @File: FractionOperations
 * @Description: Class for Fraction methods
 */
public class FractionOperations {
	
	//private variables for the class
	private int numerator1; 
	private int denominator1;
	private int numerator2;
	private int denominator2;
	
	/***********************
	 * Constructor Default
	 * Set standard results to one
	 **********************/
	public FractionOperations() {
		
		numerator1 = 1;
		denominator1 = 1;
		numerator2 = 1;
		denominator2 = 1;
		
	}
	
	/******************************
	 * Constructor Default
	 * Set numbers to values entered
	 *********************************/
	public FractionOperations (int numerator1, int denominator1, int numerator2, int denominator2) {
		
		this.numerator1 = numerator1;
		this.denominator1 = denominator1;
		this.numerator2 = numerator2;
		this.denominator2 = denominator2;
		
	}
	
	/**
	 * sets numerator1
	 * @return numerator1
	 */
	public  double  getNumerator1() {
		
		return numerator1;
		
	}
	
	/**
	 * sets denominator1
	 * @return denominator1
	 */
	public  double  getDenominator1() {
		
		return denominator1;
		
	}
	
	/**
	 * sets numerator2
	 * @return numerator2
	 */
	public double getNumerator2() {
		
		return numerator2;
		
	}
	
	/**
	 * sets numerator2
	 * @return denomanator2
	 */
	public double denomenator2() {
		
		return denominator2;
	}
	
	/************************************************
	 * @precondition inputed values are integers
	 * @return multiplied
	 * @postcondition returns a string
	 * @description multiplies the two fractions
	 ***********************************************/
	public String multiplication() {
		
		// multiplication of fractions
		int n = numerator1*numerator2; 
		int d = denominator1*denominator2;
		
		if (d < 0) { //put negative first
			n = -n;
			d = -d;
		}
		
		String multiplied = n + "/" + d;
		
		return multiplied;
	}
	
	/************************************************
	 * @precondition inputed values are integers
	 * @return divide
	 * @postcondition returns a string
	 * @description divides the two fractions
	 ***********************************************/
	public String division() {
		
		//division of fractions
		int n = numerator1*denominator2;
		int d = denominator1*numerator2;
		
		if (d < 0) { //put negative first
			n = -n;
			d = -d;
		}
		
		String divide = n + "/" + d;
		
		return divide;
	}
	
	/************************************************
	 * @precondition inputed values are integers
	 * @return divide
	 * @postcondition returns a string
	 * @description adds the two fractions
	 ***********************************************/
	public String addition() {
		
		// simplify variables
		int n1 = numerator1;
		int d1 = denominator1;
		
		int n2 = numerator2;
		int d2 = denominator2;
		
		// add numerators after multiplying
		n1 = n1*d2;
		n2 = n2*d1;
		int n = n2+n1;
		
		// GCF for denominator
		int d = d1*d2;
		
		if (d < 0) { // put negative first
			n = -n;
			d = -d;
		}
		
		return n + "/" + d;
		
	}
	
	/************************************************
	 * @precondition inputed values are integers
	 * @return divide
	 * @postcondition returns a string
	 * @description subtracts the two fractions
	 ***********************************************/
	public String subtraction() {
		
		int n1 = numerator1;
		int d1 = denominator1;
		
		int n2 = numerator2;
		int d2 = denominator2;
	
		// subtract numerators after multiplying
		n1 = n1*d2;
		n2 = n2*d1;
		int n = n1-n2;
		
		// GCF for denominator
		int d = d1*d2;
		
		if (d < 0) { // put negative first
			n = -n;
			d = -d;
		}
		
		return n + "/" + d;
		
	}
	
	/************************************************
	 * @precondition inputed values are integers
	 * @return reduced
	 * @postcondition returns a string
	 * @description reduces the two fractions
	 ***********************************************/
	public String reduce() {
		
		int n1 = numerator1;
		int d1 = denominator1;
		
		int n2 = numerator2;
		int d2 = denominator2;
		
		int count = 1;
		
		while (count <= Math.abs(n1)) { // loop to keep dividing until you no longer can for fraction 1
			
			try {

			// check if both are divisible by 2 then divide
			if (n1 % 2 == 0) { 
			if (d1 % 2 == 0) {
				n1 = n1/2;
				d1 = d1/2;
			}
			}
			
			// check if both are divisible by count then divide
			else if (n1 % count == 0) {
			if (d1 % count == 0) {
				n1 = n1/count;
				d1 = d1/count;
			}
			}
			
			count++; // increase count
		}
			catch (Exception e) { // check for error
				break;
			}
		}
		
		while (count <= n2) { // loop to keep dividing until you no longer can for fraction 2
			
			try {

			// check if both are divisible by 2 then divide
			if (n2 % 2 == 0) {
			if (d2 % 2 == 0) {
				n2 = n2/2;
				d2 = d2/2;
			}
			}
			
			// check if both are divisible by count then divide
			else if (n2 % count == 0) {
			if (d2 % count == 0) {
				n2 = n2/count;
				d2 = d2/count;
			}
			}
			
			count++; // increase count
		}
			catch (Exception e) { // check for error
				break;
			}
		}
		
		if (d1 < 0) { //change numerator to negative if applicable for fraction 1
			n1 = -n1;
			d1 = -d1;
		}
		if (d2 < 0) { //change numerator to negative if applicable for fraction 2
			n2 = -n2;
			d2 = -d2;
		}
		
		String reduced = n1 + "/" + d1 + " and " + n2 + "/" + d2;
		return reduced;
		
	}
	
	/************************************************
	 * @precondition both input variables are integers
	 * @param numerator
	 * @param denominator
	 * @return inverted
	 * @postcondition returns a string
	 * @description inverts the fraction
	 ***********************************************/
	public String invert(int numerator, int denominator) {
		
		int temp = numerator; //set up temp variable to switch values
	    numerator = denominator;
	    denominator = temp;
	    
	    if (denominator < 0) { // put negative at the front
			numerator = -numerator;
			denominator = -denominator;
		}
	    
	    String inverseFraction = numerator + "/" + denominator;
	    
		
	    return inverseFraction;
	}
	
}