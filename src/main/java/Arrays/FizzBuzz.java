/*
Given a positive integer A, return an array of strings with all the integers from 1 to N.
But for multiples of 3 the array should have “Fizz” instead of the number.
For the multiples of 5, the array should have “Buzz” instead of the number.
For numbers which are multiple of 3 and 5 both, the array should have "FizzBuzz" instead of the number.
 */

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {

    public static String [] fizzBuzz (int A) {

        String [] list = new String[A];

        for(int i=0; i<A; i++) {
            int num = i+1;
            if( num%3 == 0 && num%5!=0) {
                list[i] = "Fizz";
            }
            else if (num%5 == 0 && num%3!=0) {
                list[i] = "Buzz";
            }
            else if (num%15 == 0) {
                list[i] = "FizzBuzz";
            }
            else
                list[i] = String.valueOf(num);
        }

        return list;

    }

    public static void main (String ar[]) {

        int A = 5;

        String [] s = fizzBuzz(A);

        for(String ele : s) {
            System.out.print(ele+" ");
        }

    }

}
