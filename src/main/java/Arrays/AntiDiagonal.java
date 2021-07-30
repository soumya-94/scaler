package Arrays;

/*
Give a N*N square matrix, return an array of its anti-diagonals
 */

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonal {

    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {

        int n = A.size();  // number of rows and cols
        int d = 2*n - 1;       // number of anti diagonals = 2*n -2 and we need to create a result matrix of +1 size

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i=0; i<d; i++)                      // we need a matrix with d rows
        {
            res.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                res.get(i+j).add(A.get(i).get(j));      //each diagonal number is equal to the sum of i and j
            }
        }

        return res;

    }

    public static void main (String ar[]) {

        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};


    }

}
