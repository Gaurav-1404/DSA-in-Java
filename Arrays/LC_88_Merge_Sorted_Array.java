package Arrays;
/*
========================================
LeetCode : 88
Problem  : Merge Sorted Array

Topic     : Arrays
Subtopic  : Merging Arrays
Pattern   : Two Pointers (Backward)

Difficulty: Easy

Time Complexity  : O(m + n)
Space Complexity : O(1)

Approach:
1. Start from the end of both arrays.
2. Compare the largest elements of nums1 and nums2.
3. Place the larger element at the last available position in nums1.
4. Move the corresponding pointer backward.
5. If elements remain in nums2, copy them into nums1.

Key Learning:
- Two Pointer Technique
- Backward Traversal
- In-place Merging

========================================
*/
public class LC_88_Merge_Sorted_Array {
    public static void merge(int[] arr1, int m, int[] arr2, int n){
        int l1 = m-1;
        int l2 = n-1;
        int l = m + n - 1;
        while(l1>=0 && l2>=0){
            if(arr1[l1] > arr2[l2]){
                arr1[l] = arr1[l1];
                l1--;
            }else{
                arr1[l] = arr2[l2];
                l2--;
            }
            l--;
        }
        while(l2 >= 0){
            arr1[l] = arr2[l2];
            l--;
            l2--;
        }
    }
    public static void main(String[] args){
        int[] arr1 = {1,3,5,0,0,0,0};
        int[] arr2 = {2,4,6,8};
        merge(arr1, 3, arr2, 4);

        for(int n: arr1){
            System.out.print(n + ", ");
        }
    }
}
