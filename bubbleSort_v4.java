/* Java revision work sheet 2
 * This is for revision learning OOP
 * 15/09/2019
 */

package javaHNDOOP;

// Import required modules
import java.util.Scanner;

// Creating a new public class
public class WorkSheet2_v4 {

	// Initialising imported module(s)
	static Scanner kboard = new Scanner( System.in);
	
	// Adding a main function/method
	public static void main( String[] args) {
		
		// Adding a new array
		int[] intArr = { 33, 45, 1, 9, 100, 67, 5, 10, 56, 2};

		// Defining function/method variables
		String userInput = " ";
		boolean selection = false;
		
/* ********* *//* Output array values and index
 	 	* This will involve a for statement to loop through the array
 	 	* Variable "i" will be used as a placeholder within the loop counter
 	       */
		System.out.println( "Array values and index - before bubbleSort");
		for( int i = 0; i < intArr.length; i++) {
			System.out.println( "Array Index: "+ i +" Value: "+ intArr[ i]);
		
		} // Closing the for loop

		// Ask user for sort order (ascending or descending)
		System.out.println( " ");
		System.out.println( "Please choose a sort order: ");
		System.out.println( "A for Ascending or D for Descending");
			userInput = kboard.next();
			
		// Using an if statement to handle user input and call applicable function/method
		if( userInput.equalsIgnoreCase( "A")) {
			selection = true;
			sortAscending( intArr);	
			
/* ****************** *//* Display the bubbleSort results
			* This will be a the same as the previous output code with a for loop
			* Variable "l" will be used within the loop counter
		        */
			for( int l = 0; l < intArr.length; l++) {
				System.out.println( "Array index: "+ l +" Value: "+ intArr[ l]);
			
			} // Closing for statement
		} // Closing the if statement
		
		// Adding an else if statement
		if( userInput.equalsIgnoreCase( "D")) {
			selection = true;
			sortDescending( intArr);
			
/* ****************** *//* Display the bubbleSort results
			* This will be a the same as the previous output code with a for loop
			* Variable "l" will be used within the loop counter
		        */
			for( int l = 0; l < intArr.length; l++) {
				System.out.println( "Array index: "+ l +" Value: "+ intArr[ l]);
			
			} // Closing for statement
		} // Closing else if statement
	} // Closing main function/method
	
	
	// Adding a method/function to sort values in ascending order
	static void sortAscending( int[] intArr) {
		
		// Defining function/method variables
		int temp = 0;
		
		// Display message to the user explaining the following list
		System.out.println( " ");
		System.out.println( "Array values and index - after bubbleSort");
		
/* ********* *//* Creating the bubbleSort
 		* This will include a nested for loop, these will be used to pull values from the array
 		* Variables "j" and "k" will be used as place-holders within the for loop counters
 		* An if statement will be used to compare two values
 		* If the values require positions swapped, this will involve a little code juggling 
 	        */
		for( int j = 0; j < intArr.length; j++) {
			for( int k = 1; k < intArr.length; k++) {
				if( intArr[ k] < intArr[ k -1]) {
					
					// Doing the swap juggling
					temp = intArr[ k -1];
					intArr[ k -1] = intArr[ k];
					intArr[ k] = temp;
					
				} // Closing the if statement
			} // Closing nested for loop	
		} // Closing for loop
	} // Closing sortAscending function/method
	
	
	// Adding a function/method to sort descending
	static void sortDescending( int[] intArr) {
		
		// Defining function/method variables
		int temp = 0;
		
		// Display message to the user explaining the following list
		System.out.println( " ");
		System.out.println( "Array values and index - after bubbleSort");
		
/* ********* *//* Creating the bubbleSort
 		* This will include a nested for loop, these will be used to pull values from the array
 		* Variables "j" and "k" will be used as place-holders within the for loop counters
 		* An if statement will be used to compare two values
 		* If the values require positions swapped, this will involve a little code juggling 
 	        */
		for( int j = 0; j < intArr.length; j++) {
			for( int k = 1; k < intArr.length; k++) {
				if( intArr[ k] > intArr[ k -1]) {
					
					// Doing the swap juggling
					temp = intArr[ k -1];
					intArr[ k -1] = intArr[ k];
					intArr[ k] = temp;
					
				} // Closing the if statement
			} // Closing nested for loop	
		} // Closing for loop
	} // Closing sortDesending function/method
	
} // Closing WorkSheet_v4 class
