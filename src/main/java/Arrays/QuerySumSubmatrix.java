package Arrays;
/*
Given a matrix of integers A of size N x M and multiple queries Q, for each query find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.


 */
public class QuerySumSubmatrix {

    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        long mod = 1000000007;
        int q = B.length;
        int[] ans = new int[q];
        int m = A.length;       //rows
        int n = A[0].length;    //columns
    /* O(n^3)
        for(int i=0; i<q; i++) {
            long sum=0;
            for(int j=B[i]-1; j<D[i]; j++) {
                for(int k=C[i]-1; k<E[i]; k++) {
                    sum = (sum*1L%mod + 1L*A[j][k]%mod) % mod;

                    while(sum<0) {
                        sum+=mod;
                    }
                    sum%=mod;
                }
            }
            ans[i]= (int)sum;
        }
     */

        long dp[][] = new long[m][n];
        dp[0][0] = A[0][0];     // base case
        //dp[i][j] is the sum of rectangle A[0][0] to A[i][j];

        for(int i=1; i<n; i++) {
            dp[0][i] = (dp[0][i-1] + A[0][i] + mod) % mod;            //fills out the top row
        }
        for(int i=1; i<m; i++) {
            dp[i][0] = dp[i-1][0] + A[i][0];        // fills out the first column
        }

        //now fill the core of dp grid
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                dp[i][j] = (A[i][j] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + mod) % mod;
            }
        }

        for(int i=0; i<q; i++) {
            int r1 = B[i]-1, c1 = C[i]-1; //top left corner indices of sub matrix for current query
            int r2 = D[i]-1, c2 = E[i]-1; //bottom right corner indices of sub matrix for current query
            long sum = dp[r2][c2] ; //whole area containing the sub matrix for current query
            if(c1>0) {  //c1 is not the first column of the matrix
                sum -= dp[r2][c1-1];  //subtract the left rectangle sum
            }
            if(r1>0) {  //r1 is not the first row of the matrix
                sum -= dp[r1-1][c2];  //subtract the above rectangle sum
            }
            if(r1>0 && c1>0) {  // add back the diagonal sum because it was subtracted twice
                sum += dp[r1-1][c1-1];
            }

            while(sum<0) {
                sum+=mod;
            }
            sum%=mod;

            ans[i] = (int)sum;
        }

        return ans;
    }

    public static void main (String ar[]) {

        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[] B = {1,2};
        int[] C = {1,2};
        int[] D = {2,3};
        int[] E = {2,3};

        int[] ans = solve(A,B,C,D,E);

        for(int i=0; i<ans.length; i++)
            System.out.print(ans[i]+" ");
    }

}
