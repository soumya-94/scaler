package Hashing;

/*
Given an unsorted integer array A of size N.
Find the length of the longest set of consecutive elements from the array A.
A = [100, 4, 200, 1, 3, 2]
The set of consecutive elements will be [1, 2, 3, 4].
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(final int[] A) {

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for(int i : A) {
            hm.put(i, true);
        }

        int count = 0, start = 0, answer=Integer.MIN_VALUE;

        //we traverse the array and try to find possible starting points of consecutive sequences

        for(int i=0; i<A.length; i++) {

            //cannot be a starting point
            if(hm.containsKey(A[i]-1)) {
                continue;
            }

            //this can be a starting point
            else
            {
                start = A[i];
                count = 1;
                //increase count for every consecutive number found
                while(hm.containsKey(start+1))
                {
                    count++;
                    start++;
                }
                //there can be more than one consecutive sequences, we want longest
                answer = Math.max(answer, count);
            }
        }
        return answer;
    }


    public static void main (String ar[]) {

        int A[] = {100, 4, 200, 1, 2, 3};

        System.out.print(longestConsecutive(A));

    }

}
