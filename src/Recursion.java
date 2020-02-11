/**
 * Connor Marrs
 * Bowdoin College
 * February 2020
 *
 * This class serves as a reference for a review of recursion.
 */
public class Recursion{
    /**
     * This is a basic recursion example
     *
     * @param bunnies is the number of bunnies in the box
     * @return the number of ears counted that step
     */
    public static int bunnyEars(int bunnies){
        if(bunnies==0){
            return 0;
            //if there's an empty basket give us back 0 ears
        }
        else{
            return 2+bunnyEars(bunnies-1);
            //if there's a bunny, add 2 ears and repeat
        }
    }

    /**
     * This recursive method will check if the divisor divides the numerator by implementing Euclid's algorithm.
     *
     * @param numer is the numerator
     * @param denom is the divisor
     * @return true if denom|numer and false otherwise
     */
    public static boolean divBy(int numer, int denom){
        //forbid division by zero
        if(denom == 0){
            return false;
        }
        else if(numer == 0){
            return true;
        }
        else if(numer<denom){
            return false;
        }
        else{
            return divBy(numer-denom, denom);
        }
    }

    public static void main(String[] args) {
        int bunnies = 15;
        //call bunnyEars
        int ears = bunnyEars(bunnies);
        System.out.println(ears);

        int numer = 0;
        int denom = 5;

        //Printing the result of divBy
        String str = Boolean.toString(divBy(numer, denom));
        System.out.println(str);
    }
}
