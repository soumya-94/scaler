package DynamicProgramming;

/*
You are climbing a stair case and it takes A steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class Stairs {

    public static int climbStairs (int A) {

    int counts[] = new int[A+1];

    if(A < 2) {
        return 1;
    }
    counts[0] = 1;
    counts[1] = 1;
    for(int i=2; i<=A; i++) {
        counts[i] = counts[i-1] + counts[i-2] ;
    }
    return counts[A];

    }

    public static void main (String ar[]) {

        int A = 3;

        System.out.println(climbStairs(A));

    }
}
