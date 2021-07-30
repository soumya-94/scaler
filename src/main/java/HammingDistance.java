/*
We define f(X, Y) as number of different corresponding bits in binary representation of X and Y.
For example, f(2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. The first and the third bit differ, so f(2, 7) = 2.

You are given an array of N positive integers, A1, A2 ,..., AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 109+7.
 */

public class HammingDistance {

    public static int cntBits(int[] A) {

        int ans = 0;

        for(int i=0; i<32; i++) {       //since int has 32 bits, we go over all bit positions

            int c0 = 0 , c1 = 0; // count of zeros and ones in each bit position column

            for(int j=0; j<A.length; j++) {         // looping over all numbers in the array

                int n = A[j];
                if( ((n >> i) & 1) == 1)   //checking ith bit
                    c1++;
                else
                    c0++;
            }
            ans += c0*c1*2;
        }

        return ans;
    }

    public static void main (String ar[]) {

        int [] A = {1,3,5};

        System.out.println(cntBits(A));

    }

}
