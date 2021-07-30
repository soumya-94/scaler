package Arrays;

/*
Given a 2D Matrix A of dimensions N*N, we need to return sum of all possible submatrices.
 */

public class SumSubmatrices {

    public static int solve(int[][] A) {

        int n = A[0].length;
        int sum=0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sum += A[i][j] * ((i+1)*(j+1)*(n-i)*(n-j));
            }
        }

        return sum;
    }

    public static void main (String ar[]) {

        int arr[][] = {{1,1},{1,1}};

        System.out.println(solve(arr));

    }

}
