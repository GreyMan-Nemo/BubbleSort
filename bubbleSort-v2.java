/* Java revision work sheet 1
 * This is for revision learning OOP
 * 11/09/2019
 */

package javaHNDOOP;

// Importing required module(s)
import java.util.Scanner;

// Creating a new class
public class WorkSheet2_v1 {

	// Initialising imported module(s)
	static Scanner kboard = new Scanner( System.in);
	
	// Creating a main function
	public static void main( String[] args) {
		
		// Adding an intArray to hold random integers
		int[] intArray = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		// Defining function variables
		int temp;
		int intArr = intArray.length;
		
		// Adding a message explaining the list to follow
		System.out.println( "Array index and contained values - before sorting.");
		
/* ********* *//* Displaying array values and index
		* This will involve a for loop to iterate though the array
		* A variable "i" will be used as a place holder in the loop counter
	       */
		for( int i = 0; i < intArr; i++) {
			System.out.println( "Array index: "+ i +" Value: "+ intArray[ i]);
		
		} // Closing the for loop
		
/* ********* *//* Adding a couple blank lines between lists
 		* Will then output a message explaining the following list
 	       */
		System.out.println( "");
		System.out.println( "");
		System.out.println( "Array index and contained values - after sorting.");
		
/* ********* *//* Creating a for statement to loop through the array
 		* Will then add a nested for loop
 		* This will allow for two values to be pulled from the array for comparing 
 		* Will use a placeholder variables (j and k) within the loop counter
 	       */
		for( int j = 0; j < intArr; j++) {
			for( int k = 1; k < intArr - j; k++) {
				
				// Adding an if statement to compare one value to the next
				while( intArray[ k - 1] > intArray[ k]) {
					
					// Swap the values around
					temp = intArray[  k - 1];
					intArray[ k - 1] = intArray[ k];
					intArray[ k] = temp;
	
				} // Closing if statement
			} // Closing nested for loop	
			
			// Display sorted values and index
			System.out.println( "Array index: "+ j +" Value: "+ intArray[ j]);
			
		} // Closing the intArray loop for statement
	} // Closing main function
} // Closing WorkSheet2_v1 class
