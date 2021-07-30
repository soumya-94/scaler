/*
You are given an integer T (Number of test cases). For each test case, you are given an integer array A and an integer B.
You have to print the same array after rotating it B times towards right.
NOTE: You can use extra memory.
First line of the input contains a single integer T.
Next, each of the test case consists of 2 lines:
First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B
For each test case, print an array of integers which is the Bth right rotation of input array A, on a separate line.
 */
package Arrays;

import java.util.Scanner;

public class Rotation {

    public static void main (String ar[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T>0) {
            int length = sc.nextInt();
            int[] A = new int[length];
            for(int j=0; j<length; j++) {
                A[j] = sc.nextInt();
            }
            int r;
            r = sc.nextInt();
            r = r%length; // if r>=length

            while(r>0) {
                int temp = A[length-1];
                int j=0;
                for(j=length-1; j>0; j--) {
                    A[j]=A[j-1];
                }
                A[j]=temp;
                r--;
            }
            for(int num: A) {
                System.out.print(num+" ");
            }
            System.out.println();

            T--;
        }
        sc.close();
    }

}
