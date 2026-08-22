package Arrays;
/*
========================================
LeetCode : 152
Problem  : Maximum Product Subarray

Topic     : Arrays
Subtopic  : Subarray
Pattern   : Kadane's Algorithm Variation
            (Maximum + Minimum Product)

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:

1. Maintain the current maximum product.
2. Maintain the current minimum product.
3. A negative number can turn the minimum product
   into the maximum product.
4. Store the previous maximum before updating it.
5. Calculate the new maximum and minimum using:
   current number,
   previous maximum product,
   previous minimum product.
6. Keep track of the global maximum answer.

Key Learning:

- Kadane's Algorithm Variation
- Maximum and Minimum Tracking
- Negative Number Handling
- Dynamic State Update
- Constant Space Optimization

========================================
*/

public class LC_0152_Maximum_Product_SubArray {

    public static int maximumProduct(int[] arr){
        int cmin = arr[0];
        int cmax = arr[0];
        int ans = arr[0];

        for(int i=1; i<arr.length; i++){
            int temp = cmax;
            cmax = Math.max(arr[i], Math.max(cmax * arr[i], cmin * arr[i]));
            cmin = Math.min(arr[i],Math.min(temp * arr[i], cmin * arr[i]));

            ans = Math.max(ans, cmax);
        }
        return ans;
    }
    
}