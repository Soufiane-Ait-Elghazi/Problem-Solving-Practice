package org.solutions.medium;

public class Problem_001 {

    private static int maxProfit(int[] prices) {

        if (prices.length == 0) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        runTest(new int[]{7, 1, 5, 3, 6, 4}, 5, "Test 1");      // Expected Output: 5
        runTest(new int[]{7, 6, 4, 3, 1}, 0, "Test 2");          // Expected Output: 0
        runTest(new int[]{1, 2, 3, 4, 5}, 4, "Test 3");          // Expected Output: 4
        runTest(new int[]{5, 4, 3, 2, 1}, 0, "Test 4");          // Expected Output: 0
        runTest(new int[]{2, 1, 2, 1, 2, 1, 2}, 1, "Test 5");    // Expected Output: 1
        runTest(new int[]{3, 3, 3, 3, 3}, 0, "Test 6");          // Expected Output: 0
        runTest(new int[]{1, 10, 1, 10, 1, 10}, 9, "Test 7");    // Expected Output: 9
        runTest(new int[]{2}, 0, "Test 8");                      // Expected Output: 0 (Only one price)
        runTest(new int[]{}, 0, "Test 9");                       // Expected Output: 0 (Empty array)
    }

    private static void runTest(int[] prices, int expected, String testName) {
        int result = maxProfit(prices);
        System.out.println(testName + " - Output: " + result + " | Expected: " + expected);
    }



}
