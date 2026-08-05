package Arrays;
/*
===============================================================================
 LeetCode : 1
 Problem  : Two Sum

    Topic     : Arrays
    Subtopic  : Hashing
    Pattern   : HashMap

 Difficulty: Easy

    Time Complexity  : O(n)
    Space Complexity : O(n)

 Approach:
    1. Traverse the array once.
    2. Calculate the required complement (target - nums[i]).
    3. If complement already exists in HashMap, return both indices.
    4. Otherwise, store current number and its index in HashMap.

 Key Learning:
    - HashMap stores previously seen elements.
    - Convert O(n²) brute force into O(n).
    - Always check complement before inserting current element.
===============================================================================
*/

import java.util.*;

public class LC_0001_Two_Sum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static int[] twoSumSorted(int[] arr, int target){
        int i=0, j=arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target){
                return new int[]{i,j};
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9};
        
        int[] res = twoSum(arr, 11);
        System.out.println(res[0] + " " + res[1]);

        int[] res1 = twoSumSorted(arr, 9);
        System.out.println(res1[0] + " " + res1[1]);
    }
}