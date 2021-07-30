/*
Given an array of integers A of size N. Find the longest subsequence of A which is odd-even.
Note: An array B is a subsequence of an array A if B can be obtained from A by deletion of several (possibly, zero or all) elements.
 */
// https://www.geeksforgeeks.org/longest-alternative-parity-subsequence/
package Arrays;

public class OddEven {

    public static int solve (int [] A) {

        int length = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i]%2==0) {

            }
        }
        return length;
    }

    public static void main (String ar[]){

        int [] A = {};
        System.out.print(solve(A));
    }

}
