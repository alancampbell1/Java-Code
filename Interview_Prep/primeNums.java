/*
	Print out all the prime numbers between 0 and 100
*/

public class primeNums{
	public static void main(String [] args){

		int num = 6;
		boolean isPrime = true;

		for(int i = 2; i < num; i++){
			if(num % i == 0){
				isPrime = false;
			}
		}

		System.out.println("The number " + num + " is Prime: " + isPrime);

		primeTo100();
	}

	public static void primeTo100(){
		
		System.out.println("Prime up to 100: ");
		int num = 0;
		String primeNums = "";

		//loop from 1 to 100
		for(int i = 1; i <= 100; i++){
			//declare counter
			int counter = 0;
			/*
				Take the number 20. num is now equal to 20 and this nested loop
				goes backwards from 20 to 1
			*/
			for(num = i; num >= 1; num--){
				/*
					On each iteration it modulus the new decreased value for 20
					on 20, e.g. 20 % 19, 20 % 18...
				*/
				if(i % num == 0){
					/*
						If a return of zero occurs, counter is incremented by 1
					*/

					counter++;
				}
			}
			/*
				If counter is equal to 2, then i, aka 20 is a prime number
				and the String primeNums to updated.
			*/
			if(counter == 2){
				primeNums = primeNums + i + " ";
			}
		}
		System.out.println(primeNums);
	}
}