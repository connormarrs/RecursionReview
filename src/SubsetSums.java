/**
 * Connor Marrs
 * Bowdoin College
 * February 10, 2020
 *
 * This class is used as an introduction to recursion and tracing recursive methods
 *
 */
public class SubsetSums{
    /**
     * This method will print out the power set of the given set a
     *
     * @param a is an array of numbers
     * @param left is the left bound to sum
     * @param right is the right bound to sum
     * @param sum is the seed sum
     */
    public static void ss(int[] a, int left, int right, int sum){
        //base case: print the current subset sum
        if (left > right) {
            System.out.println(sum+" ");
            return; // first return from ss
        }

        //A: include a[left]
        ss(a,left + 1, right, sum + a[left]);

        //B: subset excluding a[left]
        ss(a, left + 1, right, sum);
    }

    /**
     * This is the driver code for the above recursive method
     */
    public static void main(String[] args) {
        int[] a = {1,2};
        int n = a.length;

        ss(a,0,n-1,0);
        System.out.println();
    }
}
