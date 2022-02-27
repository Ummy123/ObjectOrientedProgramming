/**
 * 
 */
package objectOrientedProgramingAssignment;

/**
 * @author amer.sangha
 * @Date: February 25, 2022
 * @File: FractionOperationsTest
 * @Description: Class to execute Fraction methods from FractionOperations class using object oriented programming
 */

import java.util.*;

public class FractionOperationOutputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
			
		try { // loop inputs to check for validity
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numerator for first fraction: ");
		int a = sc.nextInt(); // numerator for fraction 1
		System.out.println();
		
		System.out.print("Enter denominator for first fraction: ");
		int b = sc.nextInt(); // denominator for fraction 1
		System.out.println();
		
		System.out.print("Enter numerator for second fraction: ");
		int c = sc.nextInt(); // numerator for fraction 2
		System.out.println();
		
		System.out.print("Enter denominator for second fraction: ");
		int d = sc.nextInt(); // denominator for fraction 2
		
		FractionOperations frac = new FractionOperations(a, b, c, d); // create fraction object
		
		System.out.println();
		System.out.println("The multiplied fraction is " + frac.multiplication()); // multiplied method
		
		System.out.println();
		System.out.println("The divided fraction is " + frac.division()); // divided method
		
		System.out.println();
		System.out.println("The added fraction is " + frac.addition()); // addition method
		
		System.out.println();
		System.out.println("The subtracted fraction is " + frac.subtraction()); // subtraction method
		
		System.out.println();
		System.out.println("The reduced fractions are " + frac.reduce()); // reduction method
		
		System.out.println();
		System.out.println("The inverse of the fractions are " + frac.invert(a, b) + " and " + frac.invert(c, d)); // inverse method
		
		System.out.println();
		System.out.println("Program ended.");
		break;
		}
		catch (Exception e) {
			System.out.println("Ivalid input, please try again."); // catch for invalid input
		}
		}
	}
}