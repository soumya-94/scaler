package DynamicProgramming;

/*
Given an integer A. Return minimum count of numbers, sum of whose squares is equal to A.
 */

public class MinSquares {

    public static int countMinSquares(int A) {

        int[] dp = new int[A+1];

        // base cases
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=A; i++) {
            dp[i] = i;  //max answer can be the number it self, 1^2 + 1^2 + 1^2 ......i times
            for(int j=1; j*j<=i; j++) {
                dp[i] = Math.min(dp[i], dp[i-(j*j)] +1); // if there is an answer less than i itself, that is the answer we're looking for
            }
        }

        return dp[A];

    }

    public static void main (String ar[]) {

        int A = 97280;

        System.out.println(countMinSquares(A));

    }

}
