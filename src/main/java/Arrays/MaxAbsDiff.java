/*
Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|,
where |x| denotes absolute value of x.
 */

package Arrays;

public class MaxAbsDiff {

    public static int maxArr(int [] A) {

        if(A.length==1)
            return 0;

        int min1=Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE,max2 = Integer.MIN_VALUE;

        for(int i=0; i<A.length; i++) {
            max1=Math.max(max1, A[i]+i);
            max2=Math.max(max2, A[i]-i);
            min1=Math.min(min1, A[i]+i);
            min2=Math.min(min2, A[i]-i);
        }

        int ans1 = max1-min1;
        int ans2 = max2-min2;

        return Math.max(ans1, ans2);

    }

    public static void main (String ar[]) {

        int[] A = {89, -83, 38, 58, 79, -80, 8, 19, 31, -95};

        System.out.println(maxArr(A));

    }

}
