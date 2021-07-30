package Hashing;

/*
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
If the given array contains a sub-array with sum zero return 1 else return 0.
 */

import java.util.HashMap;

public class ZeroSumSubarray {

    public static int solve(int[] A) {

        //hashing the prefix sum array of input array
        HashMap<Long, Long> hm = new HashMap<>();

        long sum = 0;
        for(int i=0; i<A.length; i++) {
            sum = sum + A[i];
            //repetition in prefix sum array means there is a subarray with sum = 0
            //a zero is prefix sum array also means there is a subarray with sum = 0 which starts at index 0 of input array
            if(hm.containsKey(sum) || sum == 0) {
                return 1;
            }
            else
                hm.put(sum, (long)i);
        }
        return 0;
    }

    public static void main (String ar[]) {

        //int[] A = {7,1,3,4,-1,-1,18};
        int[] A = {3,2,1,-4,-2,16,10};
        System.out.print(solve(A));

    }

}
