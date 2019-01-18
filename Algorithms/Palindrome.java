/**
 * How to check for a Palindrome
 * 
 * 
 */
public class palindrome
{
    public static void main(String [] args){
        String myWord = "1otto1";
        boolean result = isPalin(myWord);
        
        System.out.println("The word" + myWord + " is a palindrome " + result );
    }
    
    public static boolean isPalin(String aWord){
        
        String backwards = "";
        char specificWord;
        for(int i = aWord.length() -1 ; i >= 0; i--){
            specificWord = aWord.charAt(i);
            backwards += specificWord;
        }
        
        System.out.println("The word backwards is " + backwards);
        
        if(aWord.equals(backwards)){
            return true;
        } else{
            return false;
        }
    }
}