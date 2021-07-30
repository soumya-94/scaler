/*
Reverse the bits of an 32 bit unsigned integer A.
Return a single unsigned integer denoting the decimal value of reversed bits.
 */

import java.util.ArrayList;

public class ReverseBits {

    public static long reverse (long a) {

        long result=0;

        for(int i=0; i<32; i++) {

            if ( (a & (1L << i)) != 0 )
                // bit is set
                result += ( 1L << (31-i) );
        }

        return result;

    }

    public static void main (String ar[]) {

        long A = 3;

        System.out.println(reverse(A));

    }

}
