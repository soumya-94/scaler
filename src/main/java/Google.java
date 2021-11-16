//import jdk.internal.util.xml.impl.Pair;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class Google {
//
//
//    public String solution(String S) {
//        if (S == null || S.length() == 0)
//            return S;
//
//        HashMap<Character, int[]> store = new HashMap<>();
//
//        for (int i = 0; i < S.length(); i++) {
//            char c = S.charAt(i);
//            int[] li = store.getOrDefault(c, new int[] {-1, -1});
//            if(li[i] != -1)
//                li[i] = i;
//            else lii;
//            store.put(c, li);
//        }
//
//        int startInd = S.length();
//        int result = 0;
//
//        for (Character c :
//                store.keySet()) {
//            int first, last;
//            List<Integer> li = store.get(c);
//            if(li.size() == 1) {
//                first = li.get(0);
//                last = li.get(0);
//            } else {
//                first = li.get(0);
//                last = li.get(1);
//            }
//            int tempLen = last - first + 1;
//            if(tempLen == result) {
//                startInd = Math.min(startInd, first);
//            }
//            else if(tempLen > result) {
//                result = tempLen;
//                startInd = first;
//            }
//        }
//        return S.substring(startInd, startInd + result);
//    }
//
//
//    public static void main(String ar[]) {
//
//        System.out.println(new Google().solution("cat"));
//
//        System.out.println(new Google().solution("t"));
//
//    }
//}
