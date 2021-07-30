/*
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.

2 <= N <= 1e5
-1e9 <= A[i] <= 1e9
There is atleast 1 odd and 1 even number in A
 */

public class MinimumPicks {

    public static int solve (int [] A) {

        int maxEven = Integer.MIN_VALUE, minOdd = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++) {

            if(A[i] % 2 == 0) {
                if (A[i] > maxEven) {
                    maxEven = A[i];
                }
            }
            else {
                if (A[i] < minOdd) {
                    minOdd = A[i];
                }
            }
        }
        return maxEven - minOdd ;
    }

    public static void main(String ar[]) {

        int A[] =  {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
        System.out.print(solve(A));

    }

}
