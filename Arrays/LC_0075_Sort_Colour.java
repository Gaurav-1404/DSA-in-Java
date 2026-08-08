package Arrays;
/*
========================================
LeetCode : 75
Problem  : Sort Colors

Topic     : Arrays
Subtopic  : Sorting
Pattern   : Dutch National Flag Algorithm

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
    1. Maintain three pointers:
    - low  -> Next position for 0
    - mid  -> Current element
    - high -> Next position for 2
    2. If nums[mid] == 0:
    - Swap nums[low] and nums[mid]
    - Increment low and mid
    3. If nums[mid] == 1:
    - Just increment mid
    4. If nums[mid] == 2:
    - Swap nums[mid] and nums[high]
    - Decrement high
    - Do NOT increment mid because the swapped element needs to be checked.

Key Learning:
- Dutch National Flag Algorithm
- Three Pointer Technique
- In-place Sorting

========================================
*/
public class LC_0075_Sort_Colour {

    public static void sort(int arr[]){
        int l = 0;
        int m = 0;
        int h = arr.length-1;
        for(int i=0; i<arr.length; i++){
            if(arr[m] == 0){
                swap(arr, m, l);
                m++; l++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else{
                swap(arr, m, h);
                h--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);

        for(int n: arr){
            System.out.print(n + ", ");
        }
    }
}