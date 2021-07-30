package Arrays;

/*
Given an array of integers A, sort the array into a wave like array and return it, In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

NOTE : If there are multiple answers possible, return the one that's lexicographically smallest.
 */

import java.util.Arrays;

public class WaveArray {

    public static int[] wave(int[] A) {

        /*
        for(int i=0; i<A.length; i+=2) {

            if(i > 0 && A[i-1] > A[i]) {
                int temp = A[i-1];
                A[i-1] = A[i];
                A[i] = temp;
            }

            if(i<A.length-1 && A[i] < A[i+1]) {
                int temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
            }

        }

         */

        Arrays.sort(A);

        for(int i=0; i<A.length-1; i+=2) {
            int temp = A[i];
            A[i] = A[i+1];
            A[i+1] = temp;
        }

        return A;

    }

    public static void main (String ar[]) {

        int[] A = {5, 1, 3, 2, 4};

        wave(A);

        for(int ele : A) {
            System.out.print(ele+", ");
        }

    }

}
