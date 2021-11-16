/*
Given a set of distinct integers, A, return all possible subsets.
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The list is not necessarily sorted.
1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllSubsets {

    static ArrayList<ArrayList<Integer>> answer;

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

        Collections.sort(A);
        answer = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();

        solve(curr, 0, A);

        Collections.sort(answer, (ArrayList < Integer > first, ArrayList < Integer > second) -> {
            for (int i = 0; i < first.size() && i < second.size(); i++) {
                if (first.get(i) < second.get(i))
                    return -1;
                if (first.get(i) > second.get(i))
                    return 1;
            }
            if (first.size() > second.size())
                return 1;
            return -1;
        });

        return answer;
    }

    public static void solve(ArrayList<Integer> curr, int index, ArrayList<Integer> A) {
        //base case
        if(index == A.size())
        {
            answer.add(new ArrayList<Integer>(curr));
            return;
        }
        int element = A.get(index);
        curr.add(element);
        solve(curr, index+1, A);
        curr.remove(curr.size() - 1);
        solve(curr, index+1, A);
    }

    public static void main (String ar[]) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.print(subsets(A));

    }

}
