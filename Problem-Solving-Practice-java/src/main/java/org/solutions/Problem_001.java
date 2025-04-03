package org.solutions;

import java.util.HashMap;
import java.util.Map;

public class Problem_001 {

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }


    public static void main(String[] args) {
        runTest(new int[]{2, 7, 11, 15}, 9, "Test 1", new int[]{0,1});
        runTest(new int[]{3, 2, 4}, 6, "Test 2", new int[]{1,2});
        runTest(new int[]{3, 3}, 6, "Test 3", new int[]{0,1});
        runTest(new int[]{1, 5, 6, 10}, 11, "Test 4", new int[]{0,3});
        runTest(new int[]{-3, 4, 3, 90}, 0, "Test 5", new int[]{0,2});
        runTest(new int[]{0, 4, 3, 0}, 0, "Test 6", new int[]{0,3});
        runTest(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 19, "Test 7", new int[]{8,9});
    }

    private static void runTest(int[] nums, int target, String testName, int[] expected) {
        try {
            int[] result = findTwoSum(nums, target);
            System.out.println(testName + " - Indices: [" + result[0] + ", " + result[1] + "] | Expected: [" + expected[0] + ", " + expected[1] + "]");
        } catch (Exception e) {
            System.out.println(testName + " - No valid pair found | Expected: No valid pair.");
        }
    }

}
