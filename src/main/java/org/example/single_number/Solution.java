package org.example.single_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {


        if (nums.length != 1) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (m.getValue().equals(1)) {
                    return m.getKey();
                }
            }
        } else return nums[0];
        return 0;
    }
}
