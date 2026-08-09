package Arrays;
/*
========================================
LeetCode : 724
Problem  : Find Pivot Index

Topic     : Arrays
Subtopic  : Prefix Sum
Pattern   : Prefix Sum

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Calculate the total sum of the array.
2. Initialize leftSum = 0.
3. Traverse the array:
   - rightSum = totalSum - leftSum - nums[i]
   - If leftSum == rightSum, return i.
   - Update leftSum += nums[i].
4. If no pivot index exists, return -1.

Key Learning:
- Prefix Sum
- Running Sum
- Left Sum vs Right Sum

========================================
*/
public class LC_0724_Find_Pivot_Index {
    public static int pivotIndex(int[] arr){
        int totalSum=0;
        for(int num : arr){
            totalSum += num;
        }
        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            if(leftSum == totalSum-leftSum-arr[i]){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int ans = pivotIndex(arr);
        System.out.println(ans);
    }
}
