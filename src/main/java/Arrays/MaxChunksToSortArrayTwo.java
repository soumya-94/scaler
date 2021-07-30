package Arrays;

/*
Given an array of integers (not necessarily distinct) A, if we split the array into some number of "chunks" (partitions),
and individually sort each chunk.
After concatenating them, the result equals the sorted array.
What is the most number of chunks we could have made?
 */

public class MaxChunksToSortArrayTwo {

    public static int solve(int[] A) {

       int chunks = 0;
       //int[] leftMax = new int[A.length+1];     //prefix max array can be generated while iterating the array to calculate chunks
       int[] rightMin = new int[A.length + 1];    //postfix min array

       rightMin[A.length] = Integer.MAX_VALUE;

       for(int i=A.length-1; i>=0; i--) {
           rightMin[i] = Math.min(rightMin[i+1], A[i]);
       }

       int leftMax = Integer.MIN_VALUE;
       for(int i=0; i<A.length; i++) {
           leftMax = Math.max(leftMax, A[i]);
           if(leftMax <= rightMin[i+1])
               chunks++;
       }

       return chunks;
    }

    public static void main (String ar[]) {

        int[] A = {2,0,1,2};

        System.out.print(solve(A));
    }

}
