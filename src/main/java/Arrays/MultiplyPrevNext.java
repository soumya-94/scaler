/*
Given an array of integers A, update every element with multiplication of previous and next elements with following exceptions.
a) First element is replaced by multiplication of first and second.
b) Last element is replaced by multiplication of last and second last.
 */

package Arrays;

public class MultiplyPrevNext {

    public static int[] solve(int[] A) {

        if(A.length==1) {
            return A;
        }

        int[] B = new int[A.length];
        for(int i=1; i<A.length-1; i++) {
            B[i] = A[i-1] * A[i+1];
        }
        B[0] = A[0]*A[1];
        B[B.length-1] = A[A.length-1]*A[A.length-2];
        return B;
    }

    public static void main (String ar[]) {

        int[] A = {1,2,3,4,5};

        int[] B = solve(A);

        for (int num : B) {
            System.out.print(num+" ");
        }

    }

}
