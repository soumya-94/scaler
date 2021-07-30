package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {

    public static void main (String ar[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n for which you want to calculate Fibonacci number:");
        int n = sc.nextInt();
        sc.close();
/* space = O(n)
        int f[] = new int[n+1];

        f[0] = 0;
        f[1] = 1;

        for(int i=2; i<=n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        System.out.println(n+"th Fibonacci number is "+ f[n]);

 */

/*
    space = O(1)

    int a =0, b=1, c=1;         // a acts the second last element, be as the last element for every summation
    if(n == 0) System.out.println(0);
    else {

        for(int i=2; i<=n; i++) {
            c = a+b;
            a = b;
            b =c;

            // c is the current ith fibonacci number
            b is the last and a is the second last number for the next fibonacci number
        }
        System.out.println(b);
    }

 */

    }

}
