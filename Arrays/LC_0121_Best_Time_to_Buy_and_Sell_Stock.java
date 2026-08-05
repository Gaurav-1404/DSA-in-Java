package Arrays;
/*
========================================
LeetCode : 121
Problem  : Best Time to Buy and Sell Stock

Topic     : Arrays
Subtopic  : Traversal
Pattern   : Prefix Minimum

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Keep track of the minimum price seen so far.
2. At each day, calculate the profit by selling today.
3. Update the maximum profit if current profit is greater.
4. Update the minimum price whenever a lower price is found.

Key Learning:
- Prefix Minimum Technique
- Greedy Traversal
- One Pass Optimization

========================================
*/

public class LC_0121_Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] arr){

        int price = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++){
            price = Math.min(price, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i]-price);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,6,9,2,6};

        System.out.println(maxProfit(arr));
    }
}