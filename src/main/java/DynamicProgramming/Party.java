package DynamicProgramming;

/*
In Danceland, one person can party either alone or can pair up with another person.

Can you find in how many ways they can party if there are A people in Danceland?

Note: Return your answer modulo 10003, as the answer can be large.
 */

public class Party {

    public static int solve(int A) {

        if(A==1) return 1;

        int dp[] = new int[A+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=A; i++) {

            dp[i] = (dp[i-1] + (i-1)*dp[i-2])%10003;
        }

        return dp[A];

    }

    public static void main(String ar[]) {

        int A = 19;

        System.out.println(solve(A));

    }

}
