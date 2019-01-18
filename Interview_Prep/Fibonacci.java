/*
	Example of the Fibonacci numbers:
	0 1 1 2 3 5 8 13 21 34

	Print all the Fibonacci numbers between 0 and 100
*/

public class Fibonacci{
	public static void main(String [] args){
		
		/*
			This first example uses Iteration to print the Fibonacci numbers
		*/

		System.out.println(0);
		System.out.println(1);
		int n1 = 0, n2 = 1, n3 = 0;
		for(int i = 1; i < 100; i++){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			if(n3 < 100){
				System.out.println(n3);
			} else {
				break;
			}
		}

		FibonacciRecursion();
	}

	/*
		This example uses Recursion to print the Fibonacci numbers
	*/

	public static void FibonacciRecursion(){
		System.out.println("Fibonacci by Recursion: ");
		System.out.println(0);
		System.out.println(1);

		callFibo();
	}

static int a1 = 0, a2 = 1, a3 = 0;

	public static void callFibo(){
			
		//We swap the values in the call
		a3 = a1 + a2;
		a1 = a2;
		a2 = a3;

		//we see if a3 is less than 100
		if(a3 < 100){
			//if so print the value of a3
			System.out.println(a3);
			//and call the function again
			callFibo();
		}
	}
}