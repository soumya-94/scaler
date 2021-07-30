package Arrays;

/*
Given an array of integers [0,1,2.....arr.length-1], if we split the array into some number of "chunks" (partitions),
and individually sort each chunk. After concatenating them, the result equals the sorted array.
What is the most number of chunks we could have made?
 */

public class MaxChunksToSortArrayOne {

    public static void main (String ar[]) {

        int[] A = {2,0,1,4,3,5};
        int max = 0, chunks = 0;
        for(int i=0; i<A.length; i++) {

            max = Math.max(A[i], max);

            if(max==i)
                chunks++;
        }

        System.out.print(chunks);

    }

}
