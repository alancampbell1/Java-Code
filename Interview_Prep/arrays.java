/*
	Sample logic Array Questions
*/

import java.util.*;
import java.io.*;

public class arrays{
	public static void main(String [] args){
		missingNum();
		duplicateNum();
		findSmallestLargest();
		pairsSum();
		removeDup();
	}

	public static void missingNum(){
		//find the missing numbers in the given array
		int [] sampleArray = {1,2,3,4,5,8,9,10,11,12,13,15,16,17,18,19,20};

		//stores length of given array
		int length = sampleArray.length;
		//stores last element
		int largestElm = sampleArray[sampleArray.length - 1];
		//stores first element to get our ranges right
		int smallestElm = sampleArray[0];

		//used to check in loop
		int sample = 0;
		boolean value = false;

		//will store all missing numbers
		String missingNums= "";

		//we loop from the smallest value to the largest in the array's range
		for(int i = smallestElm; i <= largestElm; i++){
			//we store each value in sample
			sample = i;

			//we loop the length of the given array
			for(int j = 0; j < length; j++){
				//we check if sample is present in the array
				if(sample == sampleArray[j]){
					//if so value becomes true
					value = true;	
				}
			}

			//if value is still false
			if(value == false){

				//we update missingNums with sample because we could not find it in the 
				//array
				missingNums = missingNums + " " + sample + " ";
			}
			value = false;
		}
		//System.out.println(missingNums);
	}

	public static void duplicateNum(){
		//print all duplicates in an Array
		int [] sampleArray = {1,2,3,4,5,6,6,7,8,9,10,11,11,12,13,14,15};

		//to count how many times each element appears in the array
		int counter = 0;
		boolean isDup = false;
		String dupValues = "";

		for(int i = 0; i < sampleArray.length; i++){
			//Used to store each element for comparison
			int elm = sampleArray[i];

			for(int j = i + 1; j < sampleArray.length - 1; j++){
				//conditional to see if elm is present in the rest of the array
				if(elm == sampleArray[j]){
					//if found again change the boolean to true
					isDup = true;
				}
			}
			//check to see if the boolean changed
			if(isDup == true){
				//if so, add the value to the String output
				dupValues = dupValues + elm + " ";
			}
			//reset the boolean for the next iteration
			isDup = false;
		}
		//System.out.println("The Duplicate values are: ");
		//System.out.println(dupValues);
	}

	public static void findSmallestLargest(){
		//print the smallest and largest values in an unsorted array

		int [] unsortedArray = {2, 7, 9, 55, 89, -5, 12};

		//Selection Sort method
		//we loop through the unsorted array from start to finish
		for(int i = 0; i < unsortedArray.length; i++){
			//firstly, we assume the first element is the smallest
			int min = i;
			//we then loop from the second element to the end
			for(int j = i; j < unsortedArray.length; j++){
				//we compare the contents of min to j
				if(unsortedArray[j] < unsortedArray[min]){
					//we update the element number to the new smallest one
					min = j;
				}
			}
			//swapping the values
			int temp = unsortedArray[i];
			unsortedArray[i] = unsortedArray[min];
			unsortedArray[min] = temp;
		}
		//printing the largest and smallest
		//System.out.println(unsortedArray[0]);
		//System.out.println(unsortedArray[unsortedArray.length - 1]);
	}

	public static void pairsSum(){
		//find all pairs of an integer array whose sum is equal to a given number
		int [] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int givenNum = 10;

		int a, b = 0;
		//get the length of half
		int halfway = myArray.length / 2;

		//loop from the start to the half way point
		for(int i = 0; i <= halfway; i++){
			//a will store the first pair starting at the start
			a = myArray[i];
			//loop backwards on the array
			for(int j = myArray.length - 1; j >= halfway; j--){
				//b will store the second pair starting at the end
				b = myArray[j];
				//if the sum of a + b equals givenNum
				if(a + b == givenNum){
					//print the pairs
					//System.out.println(a + " " + b);
				}
			}
		}
	}

	public static void removeDup(){
		//remove all duplicates from a given array

		int [] anArray = {1,2,3,3,4,5,6,6,7,8,9,8,10};

		//empty arraylist created
		ArrayList<Integer> myArrayList = new ArrayList<>();
		//counter variable declared
		int counter = 0;

		//loops through the given array
		for(int i = 0; i < anArray.length; i++){
			//loops from the second element to the end
			for(int j = i + 1; j < anArray.length - 1; j++){
				//checks if i appears more than once
				if(anArray[i] == anArray[j]){
					//if so, counter is incremented
					counter++;
				}
			}
			//if counter remains zero, then no duplicates
			if(counter == 0){
				//element added to arrayList
				myArrayList.add(anArray[i]);
			}
			//counter reset for next iteration
			counter = 0;
		}

		//Empty array of the final size created
		int [] finalArray = new int[myArrayList.size()];

		//values from arraylist copied over to standard array
		for(int i = 0; i < finalArray.length; i++){
			finalArray[i] = myArrayList.get(i);
		}	
		//original array updated with duplicates removed
		anArray = finalArray;

		//contents of original array printed to demonstrate results
		for(int i = 0; i < anArray.length; i++){
			System.out.println(anArray[i]);
		}
	}
}