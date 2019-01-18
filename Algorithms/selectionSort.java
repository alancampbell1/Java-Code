/**
 * - Selection sort improves on bubble sort by reducing the number of swaps from O(n2)
 * to O(n).
 * - However, the number of comparisons remains at O(n2). However, comparisons use less
 * memory than swaps.
 * How it works:
 * - Look through an Array and find the smallest element. Then put this in location 0.
 * - Repeat starting at element 1 and find the next smallest. Put this in element 1.
 * - Continue until there is nothing left.
 * 
 * 
 */

public class selectionSort
{
    public static void main(String [] args){
        
        int [] myArray = {5, 3, 1, 9, 6, 12, 90, 0};
        
        for(int i = 0; i < myArray.length - 1; i++){
            //Takes the first element and stores in index
            int index = i;
            
            //Loops through again
            for(int j = i + 1; j < myArray.length; j++){
                //compares j to index
                if(myArray[j] < myArray[index]){
                    //reassigns index
                    index = j;
                }
            }
            //Takes the smallest number and updates the first element and so forth.
            int smallestNumber = myArray[index];
            myArray[index] = myArray[i];
            myArray[i] = smallestNumber;
        }
        
        
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}