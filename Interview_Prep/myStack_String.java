/*
	Basic Stack Setup
*/

import java.util.Scanner;

public class myStack_String{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the stack: ");
		int length = sc.nextInt();

		//Stack created with x elements
		Stack myStack = new Stack(length);

		//Demonstration of how to read in user String inputs
		for(int i = 0; i < length; i++){
			System.out.println("Please input the value for this elm on the stack: ");
			String x = sc.next();
			myStack.push(x);
		}

		System.out.println("Your full stack is: ");
		myStack.printStack();

		isPalin();
		
	}

	/*
		Checking if a word is a Palindrome 
	*/
	public static void isPalin(){
		//Read in the user's entry
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word to check if a Palindrome: ");
		String userEntry = sc.nextLine();
		System.out.println("You entered: " + userEntry);

		//split it into an Array of each character
		String [] userArray = userEntry.split("");
		//create a stack of the array's length
		Stack userStack = new Stack(userArray.length);

		//push each of the Array's elements on the stack
		for(int i = 0; i < userArray.length; i++){
			userStack.push(userArray[i]);
		}
		//variable to store backwards version of entry
		String backwardsEntry = "";
		//pop off each element in stack into new variable
		for(int i = 0; i < userArray.length; i++){
			backwardsEntry = backwardsEntry + userStack.popReturn();
		}

		//check if the words are still equal, returning true or false
		System.out.print("The word is a Palindrome: " );
		if(userEntry.equals(backwardsEntry)){
			System.out.println(true);
		} else{
			System.out.println(false);
		}
	}
}

class Stack {
	int maxsize;				//stores the size of the stack
	String [] stackArray;		//used to create the stack
	int top;					//used to find the top of the stack

	/*
		This constructor is used to create the initial stack with no values.
		It's size is defined and top set to -1.
	*/
	public Stack(int x){
		maxsize = x;
		stackArray = new String[maxsize];
		top = -1;
	}

	/*
		This method pushes a value onto the stack. Top is incremented
		and used to signify that s is now on top.
	*/
	public void push(String s){
		top++;
		stackArray[top] = s;
	}

	/*
		This method removes a value from the stack. Simply by moving 
		the increment value of top
	*/
	public void pop(){
		top--;
	}

	/*
		Removes values and also returns the deleted value
	*/
	public String popReturn(){
		return stackArray[top--];
	}

	/*
		Returns the value at the top of the stack.
	*/
	public String peek(){
		return stackArray[top];
	}

	/*
		returns true or false depending on if the stack is empty
	*/
	public boolean isEmpty(){
		if(top == -1){
			return true;
		} else {
			return false;
		}
	}

	/*
		returns true or false depending on if the stack is full or not
	*/
	public boolean isFull(){
		if(top == maxsize - 1){
			return true;
		} else{
			return false;
		}
	}

	/*
		To empty out the entire stack simple make top equal -1
	*/
	public void makeEmpty(){
		top = -1;
	}

	/*
		Prints all elements in the stack
	*/
	public void printStack(){
		for(int i = 0; i <= top; i++){
			System.out.println(stackArray[i]);
		}
	}

}