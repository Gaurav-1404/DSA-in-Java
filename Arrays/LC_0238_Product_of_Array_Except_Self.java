package Arrays;
/*
========================================
LeetCode : 238
Problem  : Product of Array Except Self

Topic     : Arrays
Subtopic  : Prefix Sum
Pattern   : Prefix Product + Suffix Product

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Store the product of all elements to the left of each index.
2. Traverse from right while maintaining a suffix product.
3. Multiply prefix product with suffix product for each index.
4. Return the resulting array.

Key Learning:
- Prefix Product Technique
- Suffix Product Technique
- Space Optimization
- No Division

========================================
*/

public class LC_0238_Product_of_Array_Except_Self {

    public static int[] solution(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];

        int prefix = 1;

        for(int i=0; i<n; i++){
            ans[i] = prefix;
            prefix *= arr[i];
        }

        int suffix = 1;

        for(int i=n-1; i>=0; i--){
            ans[i] *= suffix;
            suffix *= arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[] ans = solution(arr);

        for(int num : ans){
            System.out.print(num + ", ");   
        }
    }
}
