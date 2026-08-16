package Arrays;

/*
========================================
LeetCode : 2221
Problem  : Find Triangular Sum of an Array

Topic     : Arrays
Subtopic  : Array Simulation
Pattern   : Adjacent Element Reduction

Difficulty: Medium

Time Complexity  : O(n²)
Space Complexity : O(1)

Approach:

1. Start from the original array.
2. For every round, replace each element with:
   (nums[i] + nums[i + 1]) % 10
3. Each round reduces the effective array length by 1.
4. Continue until only one element remains.
5. Return the final element.

Key Learning:

- Array Simulation
- In-place Modification
- Adjacent Element Processing
- Modulo Operation
- Space Optimization

========================================
*/

public class LC_2221_FInd_Triangular_Sum_of_An_Array {

    public static int triangularSum(int[] arr) {

        int n = arr.length;

        for (int length = n; length > 1; length--) {

            for (int i = 0; i < length - 1; i++) {

                arr[i] = (arr[i] + arr[i + 1]) % 10;
            }
        }

        return arr[0];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int ans = triangularSum(arr);

        System.out.println(ans);
    }
}