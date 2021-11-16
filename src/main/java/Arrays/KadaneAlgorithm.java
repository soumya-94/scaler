/*
Find the contiguous subarray within an array, A of length N which has the largest sum.
Return an integer representing the maximum possible sum of the contiguous subarray.
 */
package Arrays;

public class KadaneAlgorithm {

    public static int maxSubArray(int[] A) {

        int currSum = A[0];
        int overallMaxSum = A[0];

        for(int i=1; i<A.length; i++) {
            if(currSum + A[i] >= A[i]) {
                currSum += A[i];
            }
            else {
                currSum = A[i];
            }
            if(overallMaxSum < currSum) {
                overallMaxSum = currSum;
            }
        }
        return overallMaxSum;
    }

    public static void main (String ar[]) {

        int[] A = {1};

        System.out.println(maxSubArray(A));

    }

}
