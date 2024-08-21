import java.util.Arrays;

public class SelectionSort {

    //selection sort = search through an array and keep track of the min value during
    //                 each iteration. At the end of each iteration, we swap variables
    // O(n^2)

    public static void main(String[] args){

        int[] array = {8,7,9,2,3,1,5,4,6};

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for(int i=0; i<array.length-1; i++){
            int min = i;
            for(int j=i+1; j<array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
