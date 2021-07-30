package Arrays;

/*
Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in increasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.
If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
 */

import java.util.ArrayList;

public class SearchSortedMatrix {

    public static int solve(int[][] A, int B){

        int n = A.length; //rows
        int m = A[0].length; //columns

        ArrayList<Integer> ans = new ArrayList<Integer>();

        if( B < A[0][0] || B > A[n-1][m-1])
            return -1;

        int i=n-1, j=0;

        while(i>=0 && j<=m-1) {
            if(A[i][j]==B) {
                ans.add( (i+1)*1009 + (j+1) );
                i--;
            }
            else if (A[i][j]>B)
                i--;
            else
                j++;
        }
        if(ans.isEmpty())
            return -1;

        int min = ans.get(0);
        for(int e: ans) {
            min = min>e?e:min;
        }

        return min;
    }

    public static void main(String ar[]) {

        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int B = 2;

        System.out.print(solve(A,B));

    }

}
