package Arrays;

import java.util.ArrayList;

/*
Given numRows, generate the first numRows of Pascal's triangle.
 */

public class PascalTriangle {

    public static ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if(A==0)
            return res;

        for(int k=0; k<A; k++) {
            res.add(new ArrayList<Integer>());
            res.get(k).add(1);
        }

        if(A>1)
            res.get(1).add(1);

        for(int i=2; i<A; i++) {
            for(int j=1; j<=i-1; j++) {
                res.get(i).add( res.get(i-1).get(j-1) + res.get(i-1).get(j) );
            }
            res.get(i).add(1);
        }

        return res;

    }

    public static void main (String ar[]) {

        int A = 1;

        System.out.print(solve(A));

    }

}
