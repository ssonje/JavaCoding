package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static int[] twoSum(int[] numbs, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<numbs.length; i++) {
            if (map.containsKey(target - numbs[i])) {
                return new int[]{map.get(target - numbs[i]), i};
            } else {
                map.put(numbs[i], i);
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbs = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Two Sum solution set = " + Arrays.toString(twoSum(numbs, target)));
    }
}
