import java.util.Arrays;

public class BinarySearch {

    // Search Algorithm that finds the position of target value within a sorted array.
    // Half of the array is eliminated during each step
    // Checks middle ...
    // good for big number of elements/data sets

    public static void main(String[] args){

        int array[] = new int[100];
        int target = 42;

        for(int i=0; i<array.length; i++){
            array[i] = i;
        }
        //int index = Arrays.binarySearch(array, target);  // using Array lib
        int index = binarySearch(array, target);

        if(index == -1){
            System.out.println(target + "not found");
        }
        else{
            System.out.println("elemnt found at: " + index);
        }

    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;

        while(low <= high){
            int middle = low+(high - low)/2;
            int value  = array[middle];

            System.out.println("middle: " + value); // number of steps

            if(value < target){
                low = middle + 1;
            }
            else if(value > target){
                high = middle - 1;
            }
            else{
                return middle; // target is found
            }
        }
        return -1; // target not found
    }
}
