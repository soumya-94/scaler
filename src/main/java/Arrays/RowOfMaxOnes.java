package Arrays;

/*
Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.
If two rows have the maximum number of 1 then return the row which has a lower index.
 */

public class RowOfMaxOnes {

    public static int solve(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        int row =0;
        int i,j;
        for(i=0, j=m-1; i<n && j>=0; i++) {
            while(j>=0 && A[i][j]==1) {
                row = i;
                j--;
            }
        }
        return row;
    }

    public static void main(String ar[]) {

        int [][] A = {{0,0,1,1},{0,0,1,1},{0,0,1,1},{1,1,1,1}};

        System.out.print(solve(A));

    }

}
