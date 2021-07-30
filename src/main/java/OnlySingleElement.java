/*
Given an array of integers A, every element appears twice except for one. Find that single one.
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class OnlySingleElement {

    public static int singleNumber(final int[] A) {
        int ans=A[0];
        for (int i=1; i<A.length; i++) {
            ans = ans ^ A[i];
        }
        return ans;
    }

    public static void main(String ar[]) {

        int [] A = {1,2,2,3,1};
        int num = singleNumber(A);
        System.out.println(num);
    }

}
