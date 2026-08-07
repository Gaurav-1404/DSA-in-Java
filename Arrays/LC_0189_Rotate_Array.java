package Arrays;
/*
========================================
LeetCode : 189
Problem  : Rotate Array

Topic     : Arrays
Subtopic  : Array Rotation
Pattern   : Reverse Array

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Take k modulo n to handle cases where k > n.
2. Reverse the entire array.
3. Reverse the first k elements.
4. Reverse the remaining (n-k) elements.
5. The array gets rotated to the right by k steps.

Key Learning:
- Reverse Technique
- In-place Rotation
- Modulo Optimization

========================================
*/
 class LC_0189_Rotate_Array {
    // This method takes extra space that increse space complexity

    public static void rotate(int[] arr, int k){
        
        int n = arr.length;
        k = k % n;
        
        int[] F = new int[n];
        
        for(int i=0; i<n; i++){
            F[(i+k) % n] = arr[i];
        }
        
        for(int i=0; i<n; i++){
            arr[i] = F[i];
        }
    }
    public static void rotateWithoutExtraSpace(int[] arr, int k){
        
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void reverse(int[] arr, int left, int right){

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        rotateWithoutExtraSpace(arr, 3);
        for(int n: arr){
            System.out.print(n + ", ");
        }
    }
}
