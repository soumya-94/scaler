/*
Given an integer array A of size N. In one second you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.
 */

package Arrays;

public class EqualityTime {

    public static int solve (int[] A){

        int max = Integer.MIN_VALUE;
        int time = 0;

        for(int num: A) {
            if(num > max) {
                max = num;
            }
        }

        for(int num: A) {
            time = time + (max-num);
        }
        return time;
    }

    public static void main (String ar[]){

        int[] A = {2,4,1,3,2};

        System.out.println(solve(A));

    }

}
