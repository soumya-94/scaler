package DynamicProgramming;

/*
Given a 2 x N grid of integer, A, choose numbers such that the sum of the numbers is maximum
and no two chosen numbers are adjacent horizontally, vertically or diagonally, and return it.
 */

public class MaxSumWOAdjacent {

    public static int  adjacent(int[][] A) {

        int n = A[0].length;
        int[] B = new int[n+1];

        for(int i=0; i<n; i++) {
            B[i] = Math.max(A[0][i], A[1][i]);
        }

        int dp[] = new int[n+1];

        dp[0] = B[0];
        dp[1] = Math.max(B[0], B[1]);

        for(int i=2; i<=n; i++) {
            dp[i] = Math.max((B[i]+dp[i-2]), dp[i-1]);
        }

        return dp[n];

    }

    public static void main (String ar[]) {

        int[][] A = { {1}, {2} };

        System.out.println(adjacent(A));

    }

}
