package Hashing;

/*
Given an array, find the first non repeating element.
 */

import java.util.HashMap;

public class FirstNonRepeating {

    public static void main (String ar[]) {

        int[] A = {20,1,2,10,20,1,3,2,5};

        HashMap<Integer,Integer> hm = new HashMap<>();

        //put array elements in hashmap with their frequencies

        for(int i=0; i<A.length; i++) {
            if(hm.containsKey(A[i]))
                hm.put(A[i], hm.get(A[i]) + 1);
            else
                hm.put(A[i], 1);
        }

        //traverse the array and print the first number who's value is 1 in the hashmap

        for(int i=0; i<A.length; i++) {
            if (hm.get(A[i]) == 1) {
                System.out.println(A[i]);
                break;
            }
        }

    }

}
