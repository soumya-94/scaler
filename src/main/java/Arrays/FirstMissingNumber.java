package Arrays;

/*
Given an unsorted integer array A of size N. Find the first missing positive integer.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstMissingNumber {

    public static int firstMissingPositive(ArrayList<Integer> A) {

        int n = A.size();

        for(int i=0; i<n; i++) {

           if(A.get(i) >= 1 && A.get(i) <= n) {
               int pos = A.get(i) - 1;
               if(A.get(i) != A.get(pos)) {
                   Collections.swap(A, pos, i);
                   i--;
               }
           }
        }

        for(int i=0; i<n; i++) {
            if(A.get(i) != i+1)
                return i+1;
        }

        return n+1;

    }



    public static void main (String ar[]) {

        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(-8,-6,-7));

        System.out.print(firstMissingPositive(A));

    }

}
