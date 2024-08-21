public class InterpolationSearch {

    // interpolation search = improvement over binary search beast used for "uniformly" distributed
    //                        "guesses" where a value might be based on calculated probe result
    //                        if probe is incorrect, search area is narrowed, and a new probe is calculated
    // average case: O(log(log(n)))
    // worst case: O(n) [values increased exponentially]

    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = interpolationSearch(array, 8);

        if(index != -1){
            System.out.println("element found at index: " + index);
        }
        else{
            System.out.println("element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high  = array.length-1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high){

            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]); // formula

            System.out.println("probe: " + probe);

            if(array[probe] == value){
                return probe;
            }
            else if(array[probe] < value){
                low = probe + 1;
            }
            else{
                high = probe - 1;
            }
        }
        return -1;
    }
}
