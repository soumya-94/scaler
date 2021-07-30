package Arrays;
/*
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.
 */

public class GenerateSpiralMatrixSqaures {

    public static int[][] generateMatrix(int A) {

        int matrix[][] = new int[A][A];

        int l=0, r=A-1, t=0, b=A-1, num=0;

        while(l<=r && t<=b) {

            for(int i=l; i<=r; i++) {
                num++;
                matrix[t][i] = num;
            }
            t++;

            for(int i=t; i<=b; i++) {
                num++;
                matrix[i][r] = num;
            }
            r--;

            for(int i=r; i>=l; i--) {
                num++;
                matrix[b][i] = num;
            }
            b--;

            for(int i=b; i>=t; i--) {
                num++;
                matrix[i][l] = num;
            }
            l++;
        }
        return matrix;
    }

    public static void main (String ar[]) {

        int A = 3;
        int result[][] = generateMatrix(A);

        for(int i=0; i<A; i++) {
            System.out.println();
            for(int j=0; j<A; j++) {
                System.out.print(result[i][j] + " ");
            }
        }

    }

}
