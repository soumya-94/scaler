/*
Write a function that takes an integer and returns the number of 1 bits it has.
 */

public class setBitsInInteger {

    public static int numSetBits (int A) {

        int count = 0 ;

        while( A > 0 )
        {
            A &= A-1;     //unsetting the rightmost set bit
            count++;
        }

        return count;

    }

    public static void main (String ar[]) {

        int A = 11;
        System.out.println(numSetBits(A));

    }

}
