package Hashing;
/*
Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

1 <= N, M <= 105

1 <= A[i] <= 109
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class CommonElements {

     static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        HashMap <Integer, Integer> hmA = new HashMap<Integer, Integer>();  //key=element, value=frequency

        for (int i=0; i<A.size(); i++) {

            if(hmA.containsKey(A.get(i))) //if key is already present in map increment value
                hmA.put(A.get(i), hmA.get(A.get(i))+1);
            else
                hmA.put(A.get(i), 1); // else put the key and value 1 in map
        }

        ArrayList<Integer> C = new ArrayList<Integer>();

        for(int i=0; i<B.size(); i++) {
            if(hmA.containsKey(B.get(i))) {             // if element i of B is present in map
                if (hmA.get(B.get(i)) > 0) {            // and it's value is greater than 0, add to C and decrement value
                    C.add(B.get(i));
                    hmA.put(B.get(i), hmA.get(B.get(i))-1);
                }
            }
        }

        return C;
    }


    public static void main(String ar[]) {

        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(3,10,20,75,15,3,2));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(3,3));

        System.out.print(solve(A, B));

    }

}
