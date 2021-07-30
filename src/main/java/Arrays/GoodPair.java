/*
Given an array A and a integer B. A pair(i,j) in the array is a good pair if i!=j and (A[i]+A[j]==B).
Check if any good pair exist or not.
Return 1 if good pair exist otherwise return 0.
 */

package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class GoodPair {

    public static int solve (int [] A, int B) {

        HashSet hs = new HashSet();

        for(int first : A) {
            int second = B - first;
            if (hs.contains(second))
                return 1;
            hs.add(first);
        }

        return 0;
    }

    public static void main (String ar[]) {

        int [] A = {1,2,3,4};
        int B = 7;
        System.out.print(solve(A,B));

    }

}
