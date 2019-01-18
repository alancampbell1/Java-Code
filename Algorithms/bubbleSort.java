/**
 * - Take an array and compare the first two elements
 * - If the element on the right is bigger than the one on the left, swap them.
 * - Move one position to the right and start again until the end.
 * - Go back to the beginning and start again until all sorted.
 * - A comparison involves a memory read because you are checking values.
 * - A swap involves a memory write because you are changing the arrangement of data
 * in memory.
 * - Basically, swaps take longer than comparisions because it uses more memory to
 * write than read.
 * 
 */

public class bubbleSort
{ 
    public static void main(String [] args){
        
        int [] array = {4,2,7,5,7,8,1,90,4,0};
        
        int nElems = array.length;
        int temp = 0;
        
        for(int i = 0; i < nElems; i++){
            for(int j = 1; j < (nElems - i); j++){
                if(array[j-1] > array[j]){              //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}