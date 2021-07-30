/*
Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value.
Report the minimum XOR value.
 */

import java.util.Arrays;

public class MinXor {

    public static int findMinXor(int[] A) {

        Arrays.sort(A);
        int min = Integer.MAX_VALUE;

        for(int i=0; i<A.length-1; i++) {
            int xor = A[i] ^ A[i+1];
            if(xor<min)
                min=xor;
        }
        return min;
    }

    public static void main (String ar[]) {

        int [] A = {0, 4, 7, 9};

        System.out.println(findMinXor(A));
    }

}
