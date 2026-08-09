package Arrays;
/*
========================================
LeetCode : 268
Problem  : Missing Number

Topic     : Arrays
Subtopic  : Mathematical Formula
Pattern   : Sum Formula

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Calculate the expected sum of numbers from 0 to n.
2. Traverse the array and subtract each element from the expected sum.
3. The remaining value is the missing number.

Key Learning:
- Sum Formula
- Mathematical Approach
- Space Optimization

========================================
*/
public class LC_0268_Missing_Number {

    public static int missingNumber(int[] arr){

        int n = arr.length;
        int totalSum = n*(n+1)/2; 
        
        for(int num : arr){
            totalSum -= num;
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int[] arr2 = {0,1};

        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr2));
    }
}
