/*
Given an array of integers, every element appears thrice except for one which occurs once.

Find that element which does not appear thrice.

https://www.youtube.com/watch?v=cOFAmaMBVps
 */

public class OnlySingleElement2 {

    public static int singleNumber(final int[] A) {

        int ones = 0;
        int twos = 0;

        for (int i : A) {

            ones = (ones ^ i) & (~twos);
            twos = (twos ^ i) & (~ones);

        }

        return ones;

    }

    public static void main(String ar[]) {

        int [] A = {1,1,2,2,2,3,1};
        int num = singleNumber(A);
        System.out.println(num);
    }

}
