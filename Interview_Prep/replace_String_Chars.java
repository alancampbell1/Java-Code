/*
	Replace all the o's with variable stored in char 'x'

*/

public class replace_String_Chars{
	public static void main(String [] args){
		String word = "Hello World";
		char x = 'X';

		//convert the char to a String
		String myX = "" + x;

		//break up the word into a String Array
		String [] myArray = word.split("");
		//loop through the array
		for(int i = 0; i < myArray.length; i++){
			//if an element equals "o"
			if(myArray[i].equals("o")){
				//replace it with 'X'
				myArray[i] = myX;
			}
		}

		//reset the original word to blank
		word = "";

		//update it with the elements from myArray with the replaced values
		for(int i = 0; i < myArray.length; i++){
			word = word + myArray[i];
		}
		//print the result
		System.out.println(word);
	}
}


