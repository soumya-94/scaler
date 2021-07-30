package Hashing;
/*
Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2.
Please note that your returned answers (both index1 and index2 ) are not zero-based.
Put both these numbers in order in an array and return the array from your function
( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.
If multiple solutions exist, output the one where index2 is minimum.
If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.
 */

import java.util.*;

public class TwoSumCorrected {

    static class Node implements Comparable<Node> {

        int left;
        int right;

        public Node (int left, int right) {
            this.left = left;
            this.right = right;
        }

        public int compareTo(Node o) {
            if (this.right < o.right)
                return -1;
            if (this.right > o.right)
                return 1;
            return Integer.compare(this.left,o.left);
        }
    }

    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {

        int sum = B;
        int diff;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int size = A.size();
        int num;
        int j=0;

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Node> node = new ArrayList<>();

        for (int i = size-1; i >= 0; i--) {
            num = A.get(i);
            diff = sum - num;

            if(hm.containsKey(diff)) {
                j = hm.get(diff);
                node.add(new Node(i + 1, j + 1));
            }
            hm.put(num, i);
        }

        if(node.size() > 0)
        {
            Collections.sort(node);
            result.add(node.get(0).left);
            result.add(node.get(0).right);
        }

        return result;

    }

    public static void main(String ar[]) {

        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8));
        //ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2,7,6,3));
        int target = -3;

        System.out.print(twoSum(A, target));

    }

}
