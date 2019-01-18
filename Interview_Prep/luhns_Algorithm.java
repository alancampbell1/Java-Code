/*
	This example demonstrates how Luhn's Algorithm works.
	Steps: 
	Starting from the rightmost digit double the value of every second digit.
	If doubling a number results in a 2 digit number, then add these digits.
	Now take the sum of all the numbers and % 10 the result. If it equals zero,
	then the number is valid, else not.

	Example:
	1 5 8 1 9 6
	2 5 16 1 18 6
	2 5 7 1 9 6
*/

import java.util.Scanner;
public class luhns_Algorithm{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Please input your Credit Card Number: ");
		int input = sc.nextInt();

		System.out.println("Thank you, you inputted: " + input);

		/*
			Split the integer into an int array
		*/
		int temp = input;
		int count = 0;

		//Used to count the number of digits in the user's input
		while(temp != 0){
			temp = temp / 10;
			count++;
		}

		//Array created of size of number of digits
		int [] myArray = new int[count];
		//restore temp to original value
		temp = input;
		int sample = 0;
		for(int i = 0; i < myArray.length; i++){
			//gets the remainder
			sample = temp % 10;
			//updates the array with remainder
			myArray[i] = sample;
			//removes last digit and to get next one on next loop
			temp = temp / 10;
		}
		//NOTE: the Array we have created has stored the values backwards

		/*
			Double every second digit, starting at the rightmost
		*/
		for(int i = 1; i < myArray.length; i = i + 2){
			myArray[i] = myArray[i] * 2;

			/*
				Check if it is greater than 9 and if so, separate and add the digits
			*/	
			if(myArray[i] > 9){	
				//gets the first remainder		
				int value1 = myArray[i] % 10;
				//removes the second value
				myArray[i] = myArray[i] / 10;
				//gets the second remainder
				int value2 = myArray[i] % 10;
				//adds them together to get the new value for that element
				myArray[i] = value1 + value2;		
		}		
	}

	//sum all the digits
	int counter = 0;
		for(int i = 0; i < myArray.length; i++){
			counter = counter + myArray[i];
		}
		//modulus by 10 to print true or false
		if(counter % 10 == 0){
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}