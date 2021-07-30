package Hashing;

/*
Given an array of integers A consisting of only 0 and 1.

Find the maximum length of a contiguous subarray with equal number of 0 and 1.
 */

import java.util.HashMap;

public class SubarrayEqual1s0s {

    public static int solve (int A[]) {

        //map will contain the prefix sum stored against the index
        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum = 0, result = 0;

        hm.put(0, -1);

        for(int i=0; i<A.length; i++) {

            //find prefix sum on the fly till current index
            if(A[i] == 0) //if element is 0 treat is a -1
                sum-=1;
            else
                sum+=1;

            // if sum has repeated, sum of the subarray is 0 which means equal no. of 0s and 1s
            if(hm.containsKey(sum)) {
                int index = hm.get(sum);
                int len = i - index;
                if(len > result)
                    result = len;
            }
            else
                hm.put(sum, i);
        }

        return result;
    }

    public static void main (String ar[]) {

        int[] A = {1, 1, 1, 0};

        System.out.print(solve(A));

    }

}
