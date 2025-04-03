Problem: Best Time to Buy and Sell Stock
📌 Difficulty: Easy - Medium
📌 Description:
You are given an array prices where prices[i] is the price of a stock on the i-th day. You want to maximize your profit by choosing a single day to buy one stock and a different day in the future to sell it.

Return the maximum profit you can achieve. If you cannot achieve any profit, return 0.

Example 1
Input:
java
Copier
Modifier
int[] prices = {7,1,5,3,6,4};
Output:
Copier
Modifier
5
Explanation:
Buy on day 1 (price = 1), sell on day 4 (price = 6), profit = 6 - 1 = 5.

This is the maximum possible profit.

Example 2
Input:
java
Copier
Modifier
int[] prices = {7,6,4,3,1};
Output:
Copier
Modifier
0
Explanation:
No transactions are possible where selling gives a profit.

Return 0.

Function Signature
java
Copier
Modifier
public static int maxProfit(int[] prices);
Can You Solve This Efficiently?
🏷 Brute Force: Try all possible buy-sell pairs (O(n²)).

🚀 Optimal Solution: Use a single pass (O(n) time).

Give it a try! Let me know if you want hints! 🚀