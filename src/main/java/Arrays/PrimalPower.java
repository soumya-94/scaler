/*
"Primal Power" of an array is defined as the count of prime numbers present in it.
Given an array of integers A of length N, you have to calculate its Primal Power.
 */

package Arrays;

public class PrimalPower {

    public static int solve(int[] A) {

        int count = 0;

        for(int i=0; i<A.length; i++) {

            if(A[i] > 1) {
                boolean check = true;
                for (int j = 2; j * j <= A[i]; j++) {
                    if (A[i] % j == 0) check = false;
                }
                if (check) {
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String ar[]) {

        int[] A = {-11, 7, 8, 9, 10, 11};

        System.out.println(solve(A));

    }

}
