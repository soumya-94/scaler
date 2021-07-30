/*
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.
Return the array of digits after adding one.
 */

package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AddOne {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int size = A.size();
        int carry = 1;
        int num = 0;
        for(int i=size-1; i>=0; i--) {
            num=A.get(i);
            num += carry;
            carry=0;
            if(num==10) {
                num = 0;
                carry =1;
            }
            A.set(i, num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        if(carry==1) {
            result.add(1);
        }

        for(int n: A) {
            if (n==0 && result.size()==0)
                continue;
            result.add(n);
        }

        return result;
    }

    public static void main (String ar[]) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2));

        ArrayList<Integer> ans = plusOne(list);

        for(int a: ans) {
            System.out.print(a+" ");
        }

    }

}
