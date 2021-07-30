/*
Given an array of distinct integers A, find and return all elements in array which have at-least two greater elements than themselves.

Note: The results should have the order in which they are present in the original array.
 */

import java.util.Arrays;

public class AtLeastTwoGreaterElements {

    public static int[] solve(int [] A) {

        int [] B = new int[A.length-2];
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for(int num : A)
        {
            if(num > max1) {
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max2 = num;
            }
            else
                continue;
        }

        int j = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i] < max2 && j<=A.length-2) {
                B[j] = A[i];
                j++;
            }
        }

        return B;
    }

    public static void main(String ar[]) {
        int A[] =  {3,2,1};
        int [] B = new int[A.length-2];
        B = solve(A);
        for (int i : B) {
            System.out.print(i+", ");
        }
    }

}
