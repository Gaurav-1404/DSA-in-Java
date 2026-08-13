package Arrays;

/*
========================================
LeetCode : 287
Problem  : Find the Duplicate Number

Topic     : Arrays
Subtopic  : Duplicate Detection
Pattern   : Floyd's Cycle Detection
            (Fast & Slow Pointers)

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:

1. Treat each array value as the next index.
2. Use slow and fast pointers to detect a cycle.
3. When slow and fast meet, a cycle exists.
4. Reset slow to the beginning.
5. Move both pointers one step at a time.
6. The point where they meet again is the duplicate number.

Key Learning:

- Floyd's Tortoise and Hare Algorithm
- Fast & Slow Pointers
- Cycle Detection
- O(1) Extra Space

========================================
*/

class Solution {

    public static int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,3,4,2,2};

        System.out.println(findDuplicate(arr));
    }
}
