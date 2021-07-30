/*
Print a Pattern According to The Given Value of A.

Example: For A = 3 pattern looks like:

1

1 2

1 2 3

Return a two-dimensional array where each row in the returned array represents a row in the pattern.
 */

import java.util.ArrayList;

public class PatternPrinting1 {

    public static ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int k=0; k<A; k++) {
            ArrayList<Integer> row = new ArrayList<>();
            result.add(row);
        }

        int j = 0, i = 1;

        for(i=1; i<=A;) {

            if(j < i) {
                result.get(i).add(j+1);
                j++;
                continue;
            }

            if(j==i) {
                i++;
                j=0;
            }

        }

        return result;
    }


    public static void main (String ar[]) {

        int A = 4;
        System.out.println(solve(A));

    }

}
