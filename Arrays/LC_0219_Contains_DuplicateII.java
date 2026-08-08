package Arrays;

import java.util.HashMap;

/*
========================================
LeetCode : 219
Problem  : Contains Duplicate II

Topic     : Arrays
Subtopic  : Hashing
Pattern   : HashMap

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(n)

Approach:
1. Create a HashMap to store the last index of each element.
2. Traverse the array.
3. If the current element already exists in the map:
   - Check if the difference between current index and previous index
     is less than or equal to k.
   - If yes, return true.
4. Otherwise, update the current index in the map.
5. If no such pair exists, return false.

Key Learning:
- HashMap
- Index Mapping
- Duplicate Detection with Distance Constraint

========================================
*/
public class LC_0219_Contains_DuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }
        return false;
    }
}
