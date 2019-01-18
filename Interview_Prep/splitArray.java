/*
	A long int is read in and a space is inserted after every three digits.
	If there is a single digit at the end, the second last digit is joined to it.

	E.G. 12345678 => 123 456 78
	E.G. 1234567 => 123 45 67

*/

import java.io.*;
import java.util.*;

public class splitArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a long integer: ");
		String input = sc.nextLine();

		int lengthInput = input.length();

		if(lengthInput == 1 || lengthInput == 0){
			System.out.println(input);
		} else {

		//Convert String to Char Array
		String [] stringArray = input.split("");

		//Group together each three numbers and put into int Array
		int count = 1;
		ArrayList<String> myArray = new ArrayList<String>();
		String sample = "";

		for(int i = 0; i < stringArray.length; i++){
			sample = sample + "" + stringArray[i];
			if(count == 3){
				//add onto arraylist
				myArray.add(sample);
				//reset to blank
				sample = "";
				//count back to 1
				count = 1;
				continue;
			}
			count++;
		}
		//incase of leftovers in sample once out of loop
		if(sample.equals("")){

		} else {
			myArray.add(sample);
		}

		//Convert last element to int
		int lastElm = Integer.parseInt(myArray.get(myArray.size() - 1));
		
		//check if it is greater than 9
		if(lastElm > 9){
			
		}

		else {
			//gets the 3rd digit in 2nd last element
			int secLastElm = Integer.parseInt(myArray.get(myArray.size() - 2));
			int remainder = secLastElm % 10;
			
			//Updates last element
			String original = Integer.toString(lastElm);
			String otherDigit = Integer.toString(remainder);
			String concate = otherDigit + "" + original;
			myArray.set(myArray.size() - 1, concate);

			//Removes 3rd digit from 2nd last element
			String secLast = myArray.get(myArray.size() - 2);
			String [] divided = secLast.split("");
			String joined = divided[0] + "" + divided[1];
			myArray.set(myArray.size() - 2, joined);
		}

		//convert ArrayList to Array for printing
		System.out.print("The divided Array is ");

		//Prints Array format
		String [] finalArray = new String[myArray.size()];
		for(int i = 0; i < finalArray.length; i++){
			finalArray[i] = myArray.get(i);
			System.out.print(finalArray[i] + " ");
		}
	}
	}
}



