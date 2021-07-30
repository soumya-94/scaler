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

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int k=0; k<A.size(); k++) {
            hm.put(A.get(k),k);
        }

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<A.size(); i++) {
            if(hm.containsKey(B - A.get(i))) {
                int j = hm.get(B - A.get(i));
                if(result.isEmpty()) {
                    result.add(0, i + 1);
                    result.add(1, j + 1);
                }
                else    //if multiple answers exist
                {
                    if ( A.get(j) < A.get((result.get(1)-1)) ) {  //if index2 of new answer is smaller than the already inserted index2
                        result.set(0, i + 1);
                        result.set(1, j + 1);
                    }
                    else if (A.get(j) == A.get((result.get(1) - 1))) { //multiple answers with index 2 minimum
                        if ( A.get(i) < A.get((result.get(0)-1))) { // if index1 of new answer is smaller than the index1 of previous
                            result.set(0, i + 1);
                            result.set(1, j + 1);
                        }
                    }
                }
                hm.remove(A.get(i));
                hm.remove(A.get(j));
            }
        }
        return result;
    }


    public static void main(String ar[]) {

        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8));
        int target = -3;

        System.out.print(twoSum(A, target));

    }

}
