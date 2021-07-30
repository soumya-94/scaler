/*
Given an integer A.
Two numbers X and Y are defined as follows:

X is the greatest number smaller than A such that XOR sum of X and A is the same as the sum of X and A.
Y is the smallest number greater than A such that XOR sum of Y and A is the same as the sum of Y and A.
Find and return the XOR of X and Y.
 */

public class StrangeEquality {

    public static int solve (int A) {

        int bits=0, x=0;

        while(A!=0){
            if(A%2==0) {
                x |= 1<<bits;
            }
            A /= 2;
            bits++;
        }
        int y = 1<<bits;
        return x^y;
    }

    public static void main(String ar[]) {

        int A = 5;
        System.out.println(solve(A));

    }

}
