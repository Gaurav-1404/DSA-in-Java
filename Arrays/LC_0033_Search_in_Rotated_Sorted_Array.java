package Arrays;
/*
========================================
LeetCode : 33
Problem  : Search in Rotated Sorted Array

Topic     : Arrays
Subtopic  : Rotated Sorted Array
Pattern   : Binary Search

Difficulty: Medium

Time Complexity  : O(log n)
Space Complexity : O(1)

Approach:

1. Maintain two pointers: first and last.
2. Calculate mid using the overflow-safe formula.
3. If arr[mid] equals target, return mid.
4. Identify which half of the array is sorted.
5. If the left half is sorted, check whether the
   target lies within the sorted left-half range.
6. If yes, search the left half; otherwise search
   the right half.
7. If the right half is sorted, check whether the
   target lies within the sorted right-half range.
8. If yes, search the right half; otherwise search
   the left half.
9. Return -1 if the target is not present.

Key Learning:

- Binary Search on Rotated Sorted Array
- Identifying the Sorted Half
- Target Range Checking
- Search Space Reduction
- Boundary Handling
- O(log n) Time Optimization
- Constant Space Optimization

========================================
*/
public class LC_0033_Search_in_Rotated_Sorted_Array {

    public static int search(int[] arr, int target){

        int first = 0;
        int last = arr.length-1;

        while(first <= last){

            int mid = first + (last- first)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[first] <= arr[mid]){
                if(arr[first] <= target && target < arr[mid]){
                    last = mid - 1;
                }
                else{
                    first = mid + 1;
                }
            }
            else{
                if(arr[mid] < target && target <= arr[last]){
                    first = mid + 1;
                }
                else{
                    last = mid - 1;
                }
            }
        }

        return -1;
    }
    // Both optimal
    public static int insearch(int[] arr, int target){
        int left = 0; 
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target <arr[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }else{
                if(arr[mid] < target && target <= arr[right]){
                    left = mid +1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(arr, target));
    }
}
