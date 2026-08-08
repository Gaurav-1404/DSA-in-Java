package Arrays;
/*
========================================
LeetCode : 220
Problem  : Contains Duplicate III

Topic     : Arrays
Subtopic  : Sliding Window
Pattern   : TreeSet (Balanced BST)

Difficulty: Hard

Time Complexity  : O(n log k)
Space Complexity : O(k)

Approach:
1. Maintain a sliding window of size k using a TreeSet.
2. For each element, find:
   - smallest element >= nums[i] (ceiling)
   - largest element <= nums[i] (floor)
3. If either differs from nums[i] by at most valueDiff,
   return true.
4. Insert current element into the TreeSet.
5. Remove the element that goes out of the sliding window.

Key Learning:
- Sliding Window
- TreeSet
- Floor & Ceiling
- Ordered Set

========================================
*/

import java.util.TreeSet;

public class LC_0220_Contains_Duplicate_III {
    public static boolean solution(int[] nums, int indexDiff, int valueDiff){
        
        TreeSet<Long> set = new TreeSet<>();

        for(int i=0; i<nums.length; i++){
            Long ceil = set.ceiling((long) nums[i]);
            
            if(ceil != null && ceil-nums[i] <= valueDiff){
                return true;
            }

            Long floor = set.floor((long) nums[i]);

            if(floor != null && nums[i] - floor <= valueDiff){
                return true;
            }

            set.add((long) nums[i]);
            if(i>= indexDiff){
                set.remove((long) nums[i-indexDiff]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int indexDiff = 3;
        int valueDiff = 0;

        boolean ans = Solution(arr, indexDiff, valueDiff);

        if(ans){
            System.out.println("It contains Duplicate value with conditions");
        }
        else{
            System.out.println("It have not any Duplicate value with conditions");
        }


    }
}
