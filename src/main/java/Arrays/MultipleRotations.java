/*
Given an array of integers A and multiple values in B which represents the
indices of the array A around which left rotation of the array A needs to be performed.
Find the rotated array for each value and return the result in the from of a matrix
where i'th row represents the rotated array for the i'th value in B.
 */

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleRotations {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int n = A.size();
        int r = B.size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<r; i++) {
            int k = B.get(i);
            k = k%n;
            ArrayList<Integer> a = new ArrayList<Integer>(A);
            reverse(a, 0, k-1);
            reverse(a, k, n-1);
            reverse(a, 0, n-1);
            result.add(a);
        }

        return result;
    }

    public static void reverse (ArrayList<Integer> A, int start, int end) {
        while(start<end) {
            Integer temp = A.get(start);
            A.set(start, A.get(end));
            A.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main (String ar[]) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5,17,100,11));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1));

        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        answer = solve(A,B);

        System.out.print(answer);

    }

}
