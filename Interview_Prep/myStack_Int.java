/*
	Basic Stack Setup
*/

public class myStack_Int{
	public static void main(String [] args){
		//Stack created with 5 elements
		Stack myStack = new Stack(5);

		//Values pushed onto the Stack
		myStack.push(5);
		myStack.push(2);
		myStack.push(8);
		myStack.push(1);
		myStack.push(4);
		//Stack printed out
		myStack.printStack();
		//values deleted
		myStack.pop();
		myStack.pop();
		//Stack printed out
		System.out.println("After pop:");
		myStack.printStack();
	}
}

class Stack {
	int maxsize;			//stores the size of the stack
	int [] stackArray;		//used to create the stack
	int top;				//used to find the top of the stack

	/*
		This constructor is used to create the initial stack with no values.
		It's size is defined and top set to -1.
	*/
	public Stack(int x){
		maxsize = x;
		stackArray = new int[maxsize];
		top = -1;
	}

	/*
		This method pushes a value onto the stack. Top is incremented
		and used to signify that s is now on top.
	*/
	public void push(int s){
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
		Returns the value at the top of the stack.
	*/
	public int peek(){
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