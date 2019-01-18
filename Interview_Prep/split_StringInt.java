/*
	Split a String into an Array of Strings without using an ArrayList
*/

public class split_StringInt{
	public static void main(String [] args){
		String entry = "Hello";
		String [] arrayOfStrings = entry.split("");

		for(int i = 0; i < arrayOfStrings.length; i++){
			//System.out.println(arrayOfStrings[i]);
		}


		int num = 123456;
		int temp = num;
		int counter = 0;

		//we use this while loop and counter to determine how many digits in num
		while(temp % 10 != 0){
			temp /= 10;
			counter++;
		}

		//Array declared of length num digits
		int [] myArray = new int[counter];

		/*
			Modulus works backwards so you need to populate the Array
			backwards to match original int value
		*/
		for(int i = myArray.length - 1; i >= 0; i--){
			myArray[i] = num % 10;
			num /= 10;
		}

		for(int i = 0; i < myArray.length; i++){
			System.out.println(myArray[i]);
		}
	}
}