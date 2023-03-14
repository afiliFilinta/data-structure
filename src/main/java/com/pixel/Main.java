package com.pixel;

import com.pixel.array.ArrayDS;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 7, 8, 12};
        Arrays.stream(ArrayDS.getInstance().twoSum(nums, 14)).forEach(i -> System.out.println(i));
    }
}
