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

    /* Given an integer array nums, find the
     * subarray with the largest sum, and return its sum.
     */
    public int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(dp[i], max);
        }
        return max;
    }

}
