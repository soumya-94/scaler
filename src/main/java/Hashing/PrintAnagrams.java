package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagrams {

    public static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

        HashMap<HashMap<Character, Integer>, ArrayList<Integer>> hm = new HashMap<>();

        for(int k=0; k<A.size(); k++) {

            HashMap<Character, Integer> h = new HashMap<>();

            String string = A.get(k);

            for(int i=0; i < string.length(); i++) {
                if(h.containsKey(string.charAt(i))) {
                    int val = h.get(string.charAt(i));
                    h.put(string.charAt(i), val+1);
                }
                else
                {
                    h.put(string.charAt(i), 1);
                }
            }

            if(hm.containsKey(h)) {
                hm.get(h).add(k+1);
            }
            else
            {
                ArrayList<Integer> anagramsList = new ArrayList<>();
                anagramsList.add(k+1);
                hm.put(h,anagramsList);
            }

        }

        ArrayList<ArrayList<Integer>> resultAnagrams = new ArrayList<>();

        for(HashMap<Character, Integer> map : hm.keySet()) {
            resultAnagrams.add(hm.get(map));
        }

        return resultAnagrams;

    }


    public static void main (String ar[]) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat", "dog", "ogd", "god", "atc"));

        System.out.println(anagrams(list));

    }

}
