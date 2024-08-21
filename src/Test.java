import java.util.Arrays;
import java.util.Stack;

public class Test {
    public static int[] reverse(int[] list) {
        // TODO Write your code here
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<list.length; i++){
            stack.push(list[i]);
        }
        for(int j=0; j<list.length; j++){
            int pop = stack.pop();
            list[j] = pop;
        }
        return list;
    }

    public static void main(String[] args) {
        // Every value in the argument array is a single element in the list
//        int[] arr = new int[args.length];
        int[] arr = {1,2,3,4,5,6};
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){}

        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }
}
