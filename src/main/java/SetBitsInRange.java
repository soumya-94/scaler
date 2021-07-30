/*
Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A.

Return the count modulo 109 + 7.
 */

public class SetBitsInRange {

    public static int largestPowerOf2(int n) {
        int x = 0;
        while ( (1 << x) <= n ) {
            x++;
        }
        return x-1;
    }

    public static int solve(int A) {

        int mod = 1000000007;

        if (A==0) {
            return 0;
        }

        int x  = largestPowerOf2(A);

        int setBitsUpto2PowerX = x * ( 1 << (x-1));

        int msbXToA = A - (1 << x) + 1;

        int remaining = A - (1 << x);

        int ans = setBitsUpto2PowerX + msbXToA + solve(remaining);

        return ans % mod;
    }

    public static void main (String ar[]) {

        int A = 11;
        System.out.println(solve(A));
    }

}
