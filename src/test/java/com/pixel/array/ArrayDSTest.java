package com.pixel.array;

import org.junit.*;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayDSTest {

    @BeforeClass
    public static void beforeTest() {
        System.out.println("ArrayDs Test Start...");
    }

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 8, 12};
        int[] result = ArrayDS.getInstance().twoSum(nums, 14);

        Integer[] expected = {0, 3};
        Assert.assertTrue(Arrays.asList(expected).contains(result[0]));
        Assert.assertTrue(Arrays.asList(expected).contains(result[1]));
    }

    @Test
    public void testMaxSubArray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int actual = ArrayDS.getInstance().maxSubArray(nums);

        int expected= 6;
        Assert.assertEquals(expected, actual);
    }

    @AfterClass
    public static void afterTest() {
        System.out.println("ArrayDs Test Finished...");
    }

}
