package Hashing;

/*
You are given two strings A and B of size N and M respectively.
You have to find the count of all permutations of A present in B as a substring.
You can assume a string will have only lowercase letters.
 */

import java.util.HashMap;

public class CountPermutations {

    //comparing frequency maps of two strings
    public static boolean compare(HashMap<Character, Integer> A, HashMap<Character, Integer> B) {

        for(char c : A.keySet()) {
            if(B.containsKey(c) && B.get(c) != A.get(c)) //char in A exists in B and also has the same frequency
                return false;
            if(B.containsKey(c)==false)
                return false;
        }
        return true;
    }

    public static int solve(String A, String B) {

        //frequency map of pattern
        HashMap<Character, Integer> Amap = new HashMap<>();

        for(int i=0; i<A.length(); i++) {
            char c = A.charAt(i);
            if(Amap.containsKey(c)) {
                int freq = Amap.get(c);
                Amap.put(c, freq+1);
            }
            else
                Amap.put(c, 1);
        }

        //frequency map of A.length substring in B
        HashMap<Character, Integer> Bmap = new HashMap<>();

        //fill up Bmap with the frequency map of first substring of B of length A.length
        for(int i=0; i<A.length(); i++) {
            char c = B.charAt(i);
            if(Bmap.containsKey(c)) {
                int freq = Bmap.get(c);
                Bmap.put(c, freq+1);
            }
            else
                Bmap.put(c, 1);
        }

        //start moving i after first substring of B
        int i = A.length();
        int count = 0;

        //sliding window loop
        while( i < B.length()) {

            if(compare(Amap, Bmap)) //permutation matches
                count++;

            //acquire next char using i
            char ca = B.charAt(i);
            //add it's frequency in Bmap
            if(Bmap.containsKey(ca)) {
                int freq = Bmap.get(ca);
                Bmap.put(ca, freq+1);
            }
            else
                Bmap.put(ca, 1);


            //release first letter of previous substring
            char cr = B.charAt(i - A.length());
            //remove it from Bmap or reduce it's frequency
            if(Bmap.get(cr) == 1)
                Bmap.remove(cr);
            else
                Bmap.put(cr, Bmap.get(cr)-1);

            //slide window forward by one char
            i++;
        }

        //when this loop ends the last substring of B has not yet been compared to Amap so compare that now
        if(compare(Amap, Bmap) == true)
            count++;

        return count;

    }

    public static void main (String ar[]) {

        String A = "p";
        String B = "pccdpeeooadeocdoacddapacaecb";

        System.out.println(solve(A,B));

    }

}
