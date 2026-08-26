package Arrays;
/*
========================================
LeetCode : 153
Problem  : Find Minimum in Rotated Sorted Array

Topic     : Arrays
Subtopic  : Rotated Sorted Array
Pattern   : Binary Search

Difficulty: Medium

Time Complexity  : O(log n)
Space Complexity : O(1)

Approach:

1. Maintain two pointers: left and right.
2. Calculate mid using the overflow-safe formula.
3. Compare arr[mid] with arr[right].
4. If arr[mid] > arr[right], the minimum lies
   in the right half, so move left to mid + 1.
5. Otherwise, the minimum lies at mid or in the
   left half, so move right to mid.
6. Continue until left == right.
7. Return arr[left] as the minimum element.

Key Learning:

- Binary Search on Rotated Sorted Array
- Search Space Reduction
- Mid vs Right Comparison
- Maintaining Search Invariant
- O(log n) Time Optimization
- Constant Space Optimization

========================================
*/

public class LC_0153_Find_Minimum_In_Rotated_Sorted_Array {
    
    // Approach with O(n) complexity
    public static int findMinimum(int[] arr){

        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return arr[i];
            }
        }
        return arr[0];
    }

    // Optimal Approach O(log(n))
    public static int findMinimumInRotatedSortedArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return arr[left];
    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMinimum(arr));
    }
    
}