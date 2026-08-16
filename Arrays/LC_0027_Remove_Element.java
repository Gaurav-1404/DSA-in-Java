package Arrays;
/*
========================================
LeetCode : 27
Problem  : Remove Element

Topic     : Arrays
Subtopic  : Array Manipulation
Pattern   : Two Pointers

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:

1. Use a pointer to track the position where
   the next valid element should be placed.
2. Traverse through the array.
3. If the current element is not equal to val,
   place it at the position pointed by k.
4. Increment k after placing a valid element.
5. Return k as the new length of the array.

Key Learning:

- Two Pointer Technique
- In-place Array Modification
- Overwriting Elements
- Constant Extra Space
- Array Traversal

========================================
*/
public class LC_0027_Remove_Element {

    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j = 0; j <nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(arr, 2));
    }
}
