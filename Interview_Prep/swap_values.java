/*
	This example demonstrates how to swap two variables without using a third
	variable.
*/

public class swap_values{
	public static void main(String [] args){
	
		int a = 10;
		int b = 20;

		a = a + b; 			//a is now 30 and b is 20
		b = a - b;			//a is now 30 and b is 10 (aka a's original value)
		a = a - b;			//b is now 20 and a is 10 (aka b's original value)

		System.out.println(a);
		System.out.println(b);

	}
}