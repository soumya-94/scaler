import java.util.*;
public class Google2 {
    public static int solution(int[] nums) {
        int result = 0;
        HashMap<Integer, List<int[]>> store = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<int[]> li = store.getOrDefault(nums[i] + nums[j], new ArrayList<>());
                li.add(new int[]{i, j});
                store.put(nums[i] + nums[j], li);
            }
        }
        for (int key :
                store.keySet()) {
            List<int[]> value = store.get(key);
            if(result > value.size())
                continue;
            HashSet<Integer> setOfSeenNumbers = new HashSet<>();
            for(int i = 0; i < value.size(); i++) {
                int[] pair = value.get(i);
                if(setOfSeenNumbers.contains(pair[0]) || setOfSeenNumbers.contains(pair[1]))
                    continue;
                setOfSeenNumbers.add(pair[0]);
                setOfSeenNumbers.add(pair[1]);
            }
            result = Math.max(result, setOfSeenNumbers.size() / 2);
        }
        return result;
    }
}
