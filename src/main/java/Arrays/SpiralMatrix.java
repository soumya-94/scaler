package Arrays;

/*
Print 2D matrix in spiral order
 */

public class SpiralMatrix {

    public static void main (String ar[]) {

        int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int n = A.length; //number of rows
        int m = A[0].length; //number of columns

        int left=0, right=m-1, top=0, bottom=n-1;

        while(left<=right && top<=bottom) {

            for(int i=left; i<=right; i++)
                System.out.print(A[top][i]+" ");
            top++;

            for(int i=top; i<=bottom; i++)
                System.out.print(A[i][right]+" ");
            right--;

            for(int i=right; i>=left; i--)
                System.out.print(A[bottom][i]+" ");
            bottom--;

            for(int i=bottom; i>=top; i--)
                System.out.print(A[i][left]+" ");
            left++;

        }

    }

}
