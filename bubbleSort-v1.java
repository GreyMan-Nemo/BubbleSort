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
		
		// Defining function variables
		int swap = 0;
		
		// Adding an array to hold random integers
		int[] integerArray = new int[ 10];
		
		// Adding values to the array
		integerArray[ 0] = 10;
		integerArray[ 1] = 1;
		integerArray[ 2] = 8;
		integerArray[ 3] = 2;
		integerArray[ 4] = 5;
		integerArray[ 5] = 3;
		integerArray[ 6] = 7;
		integerArray[ 7] = 9;
		integerArray[ 8] = 4;
		integerArray[ 9] = 6;
		
		// Adding a message explaining the list to follow
		System.out.println( "Array index and contained values - before sorting.");
		
/* * *//* Displaying array values and index
		* This will involve a for loop to iterate though the array
		* A variable "i" will be used as a place holder in the loop counter
	   */
		for( int i = 0; i < integerArray.length; i++) {
			System.out.println( "Array index: "+ i +" Value: "+ integerArray[ i]);
		
		} // Closing the for loop
		
/* * *//* Adding a couple blank lines between lists
 		* Will then output a message explaining the following list
 	   */
		System.out.println( "");
		System.out.println( "");
		System.out.println( "Array index and contained values - after sorting.");
		
/* * *//* Creating a for statement to loop through the array
 		* Will use a placeholder variables (j and k) within the loop counter
 	   */
		for( int j = 0; j < integerArray.length; j++) {
			for( int k = 1; k < integerArray.length - j; k++) {
				// Adding an if statement to compare one value to the next
				if( integerArray[ j] > integerArray[ k]) {
					// Swap the values around
					swap = integerArray[ j];
					integerArray[ j] = integerArray[ k];
					integerArray[ k] = swap;
	
				} // Closing if statement
			} // Closing nested for loop
			
			// Display sorted values and index
			System.out.println( "Array index: "+ j +" Value: "+ integerArray[ j]);
			
		} // Closing the array loop for statement
	} // Closing main function
} // Closing WorkSheet2_v1 class
