/**
 * The following code demonstrates MergeSort. 
 * To Note:
 * MergeSort is O(n*log(n)) efficiency and is only surpassed by quicksort.
 * It uses Recursion to divide its elements in an array up.
 * 
 */
public class mergeSort
{
    static int [] array;
    static int [] tempMergArr;
    static int length;
    
    public static void main(String [] args){
        //The array we want sorted
        int [] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        
        //Object created of the class so to call sort() method which is non static from static method
        mergeSort myObj = new mergeSort();
        
        //Method call to the sort() method passing the inputArr as a parameter
        myObj.sort(inputArr);
        
        //used to print sorted Array
        for(int i: inputArr){
            System.out.print(i + " ");
        }
    }
    
    public void sort(int inputArr[]){
        this.array = inputArr;                  //sets the array we want sorted to the local Array
        this.length = inputArr.length;          //sets the global length to the length of the array we want sorted
        this.tempMergArr = new int [length];    //creates a new temporary array with the same length as the unsorted one
        doMergeSort(0, length - 1);             //method call to doMergeSort() sending two variables
    }
    
    public void doMergeSort(int lowerIndex, int higherIndex){
        if(lowerIndex < higherIndex){                                   //if zero is less than length - 1 do the following...
            
            //New variable which is 0 + (9 - 0) / 2 = 4 (aka the halfway element)
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
        
            //Recursion on the first half of the array
            doMergeSort(lowerIndex, middle);
            
            //repeat Recursion on the second half of the array
            doMergeSort(middle + 1, higherIndex);
            
            /*
             * This recursion keeps breaking down the array until it is single elements
             */
            
            //Once the Array has been broken down to single elements, it re-builds in order by calling mergeParts()
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
    
    public void mergeParts(int lowerIndex, int middle, int higherIndex){
        for(int i = lowerIndex; i <= higherIndex; i++){
            tempMergArr[i] = array[i];
        }
        
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while(i <= middle && j <= higherIndex){
            if(tempMergArr[i] <= tempMergArr[j]){
                array[k] = tempMergArr[i];
                i++;
            } else{
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        
        while(i <= middle){
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}