public class Recursion {

    // recursion = Apply the result of a procedure, to a procedure.
    //             A recursive method calls itself. Can be substitute for iteration.
    //             Divide problem into sub-problems of the same type
    //             Commonly used with advanced sorting algorithms and navigating tree

    public static void main(String[] args){
        walk(5);
    }

    private static void walk(int steps) {
        if(steps < 1) // base case
        return;
        System.out.println("you take a step");

        walk(steps -1); // recursive
    }
}
