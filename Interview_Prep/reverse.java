/*
	This example demonstrates how to reverse a String and an int without using
	any API's
*/

public class reverse{
	public static void main(String [] args){
		String entry = "Hello World";

		String [] myArray = entry.split("");

		String reversed = "";

		for(int i = myArray.length - 1; i >= 0; i--){
			reversed = reversed + myArray[i];
		}

		System.out.println(reversed);


		//Initial value
		int x = 1234567;
		//stores the initial value while we discover how many digits in it
		int temp = x;
		//counts the digits
		int counter = 0;

		//using divide by 10 to count digits in initial value
		while(x != 0){
			x = x / 10;
			counter++;
		}

		//reset the initial value after discovering count
		x = temp;

		//create an array of same amount of digits
		int [] myIntArray = new int[counter];
		int store = 0;

		//loop through and extract each digit from the last to the first
		for(int i = 0; i < myIntArray.length; i++){
			store = x % 10;
			//update the array moving forward through it
			myIntArray[i] = store;
			//reducing the initial value on each loop like before
			x = x / 10;
		}

		//String used to store combined values
		String myValue = "";
		//For loop to update the String with the elements from the Array
		for(int i = 0; i < counter; i++){
				myValue = myValue + "" + myIntArray[i];
		}
		//converting the String into an int
		int result = Integer.parseInt(myValue);

		//printing the result - an int printed backwards
		System.out.println(result);
	}
}