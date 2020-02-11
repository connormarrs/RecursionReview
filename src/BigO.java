/**
 * Connor Marrs
 * Bowdoin College
 * February 10, 2020
 *
 * This class serves as an introduction to Big O notation and searching related to recursion
 * We explore two different sorting algorithms - one for an unsorted array; another for sorted
 *
 */
public class BigO{
    /**
     * Arrays- they're our simplest data structure.
     * Arrays class-helper class that has methods for computing arrays quickly
     */

    //don't declare variables in a loop - you only wanna do it once so do it here
    private static int target = 5;
    private static int[] array = new int[]{5, 2, 3, 6, 1, 4, 8};

    /**
     * Let's make a basic search for a target value in an array
     *
     * @param a is the array
     * @param tar is the target value
     * @return true if tar is in the array, false if not
     *
     * Let's note that in the worst case this algorithm runs at O(n).
     */
    public static boolean search(int tar, int[] a){
        //we're gonna loop through every value and then check if the element is the target
        for(int i = 0; i<a.length; i++){
            if(a[i]==tar){
                return true;
            }
        }
        return false;
    }

    /**
     * Let's make a search algorithm for a target value in an array
     *
     * @param a is the sorted array
     * @param tar is the target value
     * @return true if tar is in the array, false if not
     *
     * This algorithm runs in O(log n) *fun ... does the base matter?
     */
    public static boolean binarySearch(int tar, int[] a){
        //calculate the middle, left, and right values;
        int left = 0;
        int right = a.length-1;
        int mid = (left+right)/2;

        //run a while loop that updates this baby
        while(left<=right){
            //calculate new middle value
            mid = (left+right)/2;

            //if the middle value is our target, we've done it
            if(tar == a[mid]){
                return true;
            }
            // if target is in the right half of the array
            else if(tar>a[mid]){
                //make the left bound one to the right of the middle
                left = mid+1;
                //don't change the right side
            }
            //we know that the target is in the left side if we get here
            else{
                //make the right bound one to the left of the middle
                right = mid-1;
            }
        }
        return false;
    }

    /**
     * This is a recursive implementation of the binary search algorithm
     *
     * @param a is the sorted array
     * @param tar is the target value
     * @return true if tar is in the array, false if not
     */
    public static boolean binarySearchRec(int tar, int[] a){
        return true;
    }

    public static void main(String[] args) {

    }
}