package Hashing;

/*
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
If the answer does not exist return an array with a single element "-1".
First sub-array means the sub-array for which starting index in minimum.
 */

import java.util.HashMap;

public class GivenSumSubarray {

    public static int[] solve(int[] A, int B) {

        int l=0, r=0;
        long sum = A[0];

        //sliding window
        while(r<A.length && l<=r) {

            if(sum==B) {
                int result[] = new int[r-l+1];
                for(int i=l; i<=r; i++) {
                    result[i-l] = A[i];
                }
                return result;
            }
            else if (sum<B) {
                r++;
                if(r<A.length) sum += A[r];
            }
            else
            {
                sum -= A[l];
                l++;
            }
        }
        return new int[]{-1};
    }

    public static void main (String ar[]) {

        int[] A = {1,2,3,4,5};
        int B = 5;
        int[] C = solve(A, B);

        for(int i=0; i<C.length; i++)
            System.out.print(C[i]+", ");

    }

}
