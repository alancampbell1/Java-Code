/*
	Check if a word is a Palindrome
*/

public class isPalin{
	public static void main(String [] args){
		String givenWord = "otto";

		String [] myArray = givenWord.split("");

		String wordBackwards = "";

		for(int i = myArray.length - 1; i >= 0; i--){
			wordBackwards = wordBackwards + myArray[i];
		}

		if(givenWord.equals(wordBackwards)){
			System.out.println(true);
		} else{
			System.out.println(false);
		}
	}
}