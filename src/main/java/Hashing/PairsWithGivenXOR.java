package Hashing;/*
Given an 1D integer array A containing N distinct integers.

Find the number of unique pairs of integers in the array whose XOR is equal to B.
 */

import java.util.HashMap;

public class PairsWithGivenXOR {

    //search for A[j] = k ^ A[i]

    public static int solve(int[] A, int B) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int count = 0;

        for(int i=0; i<A.length; i++) {
            if (hm.containsKey( B ^ A[i])) {
                count++;
            }
            hm.put(A[i],i);
        }

        return count;
    }

    public static void main(String ar[]) {

        int A[] =  {3,6,8,10,15,50};
        int B = 5;
        System.out.print(solve(A, B));

    }

}
