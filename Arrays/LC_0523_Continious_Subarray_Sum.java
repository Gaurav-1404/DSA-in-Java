package Arrays;

import java.util.HashMap;

/*
========================================
LeetCode : 523
Problem  : Continuous Subarray Sum

Topic     : Arrays
Subtopic  : Prefix Sum
Pattern   : Prefix Sum + HashMap + Modulo

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(min(n, k))

Approach:
1. Maintain a running prefix sum.
2. Compute remainder = prefixSum % k.
3. If the same remainder has appeared before,
   the subarray between the two indices has a sum
   divisible by k.
4. Store only the first occurrence of each remainder.
5. Return true if the subarray length is at least 2.

Key Learning:
- Prefix Sum
- Modulo Property
- HashMap
- First Occurrence
- Remainder Technique

========================================
*/
public class LC_0523_Continious_Subarray_Sum {

    public static boolean checkSubarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        int prefixSum = 0;

        for(int i=0; i<nums.length; i++){

            prefixSum += nums[i];
            int remainder =  prefixSum % k;
            if (remainder < 0) {
                remainder += k;
            }

            if(map.containsKey(remainder)){
                if(i - map.get(remainder) >= 2){
                    return true;
                }
            }
            else{
                map.put(remainder,  i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {23, 2, 4, 6, 7};
        System.out.println(checkSubarraySum(arr, 6));
    }

}
