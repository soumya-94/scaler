/*
You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.
Return A and B.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Note that in your output A should precede B.
 */

package Arrays;

public class RepeatingAndMissing {

    public static int[] repeatedNumber(final int[] A) {
/*      Approach 1
        int n = A.length;
        boolean[] presence = new boolean[n+1];

        int repeating = 0;
        int missing = 0;

        for (int i = 0; i < n; i++) {

            if (presence[A[i]] == true)
                repeating = A[i];
            else
                presence[A[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (presence[i] == false) {
                missing = i;
                break;
            }
        }

        int[] ans = {repeating, missing};
        return ans;

 */

/*
         //Approach 2

        long n = A.length;
        long S = (n*(n+1))/2; //sum of first n natural numbers
        long SS = (n*(n+1)*(2*n + 1))/6; //sum of squares of first n natural numbers
        long SA = 0;  //sum of elements of array
        long SSA = 0;    //sum of squares of elements of array

        for(int e : A) {
            SA += e;
            SSA += (long)e*e;
        }

        // x=repeated, y=missing
        long difference = S - SA; //x-y
        long difference_sqaures = SS - SSA; //x^2 - y^2

        long sum = difference_sqaures / difference ; //x+y

        int missing  = (int)(sum + difference)/2;
        int repeated = (int)sum - missing;

        int[] ans = {repeated, missing};

        return ans;
 */

/*      //Approach 3
        int n = A.length;
        int xor = 0;
         //xor all array elements
        for(int e : A) {
            xor ^= e;
        }
        //xor with all natural number 1 to n
        for(int i=1; i<=n; i++) {
            xor ^= i;
        }
        //now xor has the xor sum of repeat and missing

        int pos = 0; //position of the rightmost set bit
        for(int i=0; i<32; i++) {
            if ((xor & (1<<i)) > 0) {
                pos = i;
                break;
            }
        }

        int repeated=0, missing=0;

        for(int i=0; i<n; i++) {
            if((A[i] & (1<<pos)) > 0)
                repeated ^= A[i];
            else
                missing ^= A[i];
        }

        for(int i=1; i<=n; i++) {
            if((i & (1<<pos)) > 0)
                repeated ^= i;
            else
                missing ^= i;
        }

        int[] ans = {repeated, missing};
        return ans;
        */

    int n = A.length;
    int repeated =0, missing=0;

    for(int i=0; i<n; i++) {
        int val = Math.abs(A[i]);
        if(A[val-1] > 0)
            A[val-1] = -A[val-1];
        else
            repeated = val;
    }

    for(int i=0; i<n; i++) {
        if(A[i] > 0)
            missing = i+1;
    }

    int[] ans = {repeated, missing};
    return ans;

    }

    public static void main (String ar[]) {

        int[] A = {3,1,2,5,3};
        int[] B = repeatedNumber(A);

        for(int n: B) {
            System.out.println("");
            System.out.print(n+" ");
        }
    }

}
