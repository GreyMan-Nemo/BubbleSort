/* Java revision work sheet 2
 * This is for revision learning OOP
 * 14/09/2019
 */

package javaHNDOOP;

// Creating a new class
public class WorkSheet2_v3 {

	// Adding main method/function
	public static void main( String[] args) {
		
		// Adding array to house integer values
		int[] intArray = { 5, 2, 45, 99, 3, 100, 89, 101, 27, 111 };	
		
		// Display a message to user explaining the following list
		System.out.println( "Array values and index - before bubbleSort ");
		
/* ********* *//* Output array values and index
 	 	* This will involve a for statement to loop through the array
 	 	* Variable "i" will be used as a placeholder within the loop counter
 	       */
		for( int i = 0; i < intArray.length; i++) {
			System.out.println( "Array index: "+ i +" Value: "+ intArray[ i]);
		
		} // Closing the for loop
		
		// Calling bubbleSort function/method
		bubbleSort(  intArray);
		
/* ********* *//* Display the bubbleSort results
		* This will be a the same as the previous output code with a for loop
		* Variable "l" will be used within the loop counter
	       */
		for( int l = 0; l < intArray.length; l++) {
			System.out.println( "Array index: "+ l +" Value: "+ intArray[ l]);
		
		} // Closing the for loop
	} // Closing main method/function
	
	
	// Adding a bubbleSort method/function
	static void bubbleSort( int[] intArray) {
		
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
		for( int j = 0; j < intArray.length; j++) {
			for( int k = 1; k < intArray.length; k++) {
				if( intArray[ k] < intArray[ k -1]) {
					
					// Doing the swap juggling
					temp = intArray[ k -1];
					intArray[ k -1] = intArray[ k];
					intArray[ k] = temp;
					
				} // Closing the if statement
			} // Closing nested for loop	
		} // Closing for loop	
	} // Closing bubbleSort method/function
} // Closing WorkSheet2_v3 class
