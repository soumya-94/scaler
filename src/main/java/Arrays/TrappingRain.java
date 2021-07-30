/*
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.
 */

package Arrays;

public class TrappingRain {

    public static int trap(final int[] A) {

        int maxBuilding = Integer.MIN_VALUE;
        int totalWater = 0;
        int m=0; // position of maxBuilding

        for(int i=0; i<A.length; i++) {
            if(A[i] > maxBuilding) {
                maxBuilding=A[i];
                m=i;
            }
        }

        //we dvide the array along the maxBuilding and consider the left side first
        //for each building rightmax is always maxBuilding, we need to calculate leftmax
        int leftmax=0;
        for (int i=0; i<m; i++) {
            if(A[i] > leftmax) {
                leftmax = A[i];
            }
            totalWater += leftmax - A[i];
        }

        //now we consider the right side
        //for each building leftmax is always maxBuilding, we need to calculate rightmax
        int rightmax=0;
        for(int i=A.length-1; i>m; i--) {
            if(A[i] > rightmax) {
                rightmax = A[i];
            }
            totalWater += rightmax - A[i];
        }

        return totalWater;
    }

    public static void main (String ar[]) {

        int[] A = {2,3,9,2,12,5,1,8,4,10,8,1};

        System.out.println(trap(A));

    }

}
