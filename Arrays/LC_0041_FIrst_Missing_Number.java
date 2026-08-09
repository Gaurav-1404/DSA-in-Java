package Arrays;
/*
========================================
LeetCode : 41
Problem  : First Missing Positive

Topic     : Arrays
Subtopic  : Index Placement
Pattern   : Cyclic Sort

Difficulty: Hard

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Traverse the array.
2. Place every positive number x (1 <= x <= n)
   at index (x - 1).
3. Ignore negative numbers, zeros, and values > n.
4. Traverse the array again.
5. The first index i where nums[i] != i + 1
   is the missing positive.
6. If all positions are correct, return n + 1.

Key Learning:
- Cyclic Sort
- Index Placement
- In-place Hashing
- Constant Space

========================================
*/

public class LC_0041_FIrst_Missing_Number {
    public int firstMissingPositive(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] > 0 &&
                nums[i] <= nums.length &&
                nums[i] != nums[correct]) {

                swap(nums, i, correct);

            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
