/*
Given an array of numbers A , in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Note: Output array must be sorted.
 */

public class TwoSingleElements {

    public static int [] solve (int [] A) {

        int xorSum = 0;     // will contain xor of the two single numbers

        for (int num : A) {
            xorSum ^= num;
        }

        int pos = 0;   //will contain position of the set bit in xorsum

        for(int i=0; i<32; i++) {
            if((xorSum & (1 << i)) > 0) {
                pos = i;
                break;
            }
        }

        int num1=0, num2=0;
        //xor together the numbers which have 1 at pos and xor together the numbers which have 0 at pos
        for(int i=0; i<A.length; i++) {
            if( (A[i] & (1<<pos)) > 0 )
                num1 ^= A[i];
            else
                num2 ^= A[i];
        }

        int [] ans = new int[2];

        if(num1>num2) {
            ans[0] = num2;
            ans[1] = num1;
        }

        else {
            ans[0] = num1;
            ans[1] = num2;
        }
        return ans;
    }

    public static void main (String ar[]) {

        int [] A = {186, 256, 102, 377, 186, 377};

        int [] a = solve(A);

        for(int num : a)
        {
            System.out.print(num+" ");
        }

    }

}
