import java.util.Arrays;

public class MergeSort {

    // merge sort = recursively divide array in 2, sort, re-combine
    // run-time complexity = O(n log n)
    //space complexity = O(n)

    public static void main(String[] args){
        int[] array = {8,2,5,3,4,7,6,1};

        mergeSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int len = array.length;

        if(len <= 1) return; // base case

        int middle = len/2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[len-middle];

        int i =0; //for leftArr
        int j =0; //for rightArr

        for(; i<len; i++){
            if(i<middle){
                leftArr[i] = array[i];
            }
            else{
                rightArr[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, array);
    }
    private static void merge(int[] leftArr, int[] rightArr, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0;
        int l = 0;
        int r = 0;

        //check the conditions for merging
        while(l < leftSize && r < rightSize){
            if(leftArr[l] < rightArr[r]){
                array[i] = leftArr[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArr[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArr[r];
            i++;
            r++;
        }
    }
}
