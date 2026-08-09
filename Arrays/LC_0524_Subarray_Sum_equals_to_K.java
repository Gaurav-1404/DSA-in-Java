package Arrays;

import java.util.HashMap;
/*
========================================
LeetCode : 560
Problem  : Subarray Sum Equals K

Topic     : Arrays
Subtopic  : Prefix Sum
Pattern   : Prefix Sum + HashMap

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(n)

Approach:
1. Maintain a running prefix sum.
2. Store prefix sum frequencies in a HashMap.
3. At each index, check if (prefixSum - k) exists.
4. If yes, add its frequency to the answer.
5. Update the frequency of the current prefix sum.

Key Learning:
- Prefix Sum
- HashMap
- Frequency Counting
- Running Sum

========================================
*/
public class LC_0524_Subarray_Sum_equals_to_K {
    public static int subarraySum(int[] arr, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for(int num: arr){

            prefixSum += num;
            
            if(map.containsKey(prefixSum - k)){
                count+= map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3};
        int k = 3;
        System.out.println(subarraySum(arr, k));
    }
}
