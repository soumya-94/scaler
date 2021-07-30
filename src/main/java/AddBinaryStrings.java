/*
Given two binary strings, return their sum (also a binary string).
 */

public class AddBinaryStrings {

    public static String addBinary(String A, String B) {

        StringBuilder sb = new StringBuilder();
        int a = A.length()-1;
        int b = B.length()-1;
        int carry = 0;

        while ( a >= 0 || b >= 0) {

            int sum = carry;
            if (a >= 0) {
                sum += A.charAt(a--) - '0'; // '0' converts the result into int before adding to sum
            }
            if (b >= 0) {
                sum += B.charAt(b--) - '0';
            }

            sb.insert(0, sum % 2);
            carry = sum / 2;

        }

            if (carry >0) {
                sb.insert(0, 1);
            }

        return sb.toString();

    }

    public static void main (String ar[]) {

        String A = "1010110111001101101000";
        String B = "1000011011000000111100110";

        System.out.println(addBinary(A,B));

    }

}
