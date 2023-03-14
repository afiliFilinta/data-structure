package com.pixel.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayDS {

    private static ArrayDS instance;

    private ArrayDS() {
    }

    public synchronized static ArrayDS getInstance() {
        if (instance == null) {
            instance = new ArrayDS();
        }
        return instance;
    }

    /*
     * Given an array of integers nums and an integer target,
     * return indices of the two numbers such that they add up to target.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                break;
            }
            map.put(target - nums[i], i);
        }
        return result;
    }

}
