package Arrays;
/*
========================================
LeetCode : 53
Problem  : Maximum Subarray

Topic     : Arrays
Subtopic  : Subarray
Pattern   : Kadane's Algorithm

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Initialize currentSum and maxSum with the first element.
2. For each element:
   - Either start a new subarray from the current element.
   - Or extend the previous subarray.
3. Update maxSum whenever currentSum becomes larger.
4. Return maxSum.

Key Learning:
- Kadane's Algorithm
- Dynamic Programming (State Optimization)
- Maximum Contiguous Subarray

========================================
*/

public class LC_0053_Maximum_Subarray {
    
    public static int maxSubarray(int[] arr){

        if(arr.length==0){
            return 0;
        }

        int currentSum = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            max = Math.max(max, currentSum);
        }

        return max;
    }

    public static int[] maxSubArrayIndex(int[] arr){

        if(arr == null || arr.length == 0){
            return new int[]{};
        }

        int start=0, end=0, tempStart=0;

        int currentSum = 0;
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            
            if(currentSum+arr[i] < arr[i]){
                tempStart = i;
                currentSum = arr[i];
            }
            else{
                currentSum = currentSum + arr[i];
            }

            if(max < currentSum){
                max = currentSum;
                start = tempStart;
                end = i;
            }
        }
        return new int[]{start, end};
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubarray(arr));

        int[] ansIndex = maxSubArrayIndex(arr);
        for(int i=ansIndex[0]; i<=ansIndex[1]; i++){
            System.out.print(arr[i] + ", ");
        } 
    }
}
