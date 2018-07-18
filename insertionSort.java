/**
 * Insertion Sort is still O(n2) but is faster than Bubble or Selection.
 * - You take the second element out of the array and compare it to the element before hand.
 * - If the element taken out is smaller than the one to the left, you shift the larger
 * element into the space where the second element was.
 * - This is then repeated until the element taken out is larger than the one to left,
 * where it is put back in.
 * 
 * 
 */

public class insertionSort
{
    public static void main(String [] args){
        int [] array = {5,4,3,8,0,9,6, 100, 0};
        
        int n = array.length;
        for(int j = 1; j < n; j++){
            int key = array[j];
            int i = j - 1;
            while((i > -1) && (array[i] > key)){
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
