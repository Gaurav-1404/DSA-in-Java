package Arrays;
/*
========================================
LeetCode : 977
Problem  : Squares of a Sorted Array

Topic     : Arrays
Subtopic  : Two Pointers
Pattern   : Two Pointers from Both Ends

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(n)

Approach:

1. Use two pointers, one at the beginning and
   one at the end of the sorted array.
2. Compare the absolute values of both elements.
3. The larger absolute value produces the larger square.
4. Place the larger square at the end of the result array.
5. Move the corresponding pointer inward.
6. Continue until all elements are processed.

Key Learning:

- Two Pointer Technique
- Sorted Array Property
- Absolute Value Comparison
- Constructing Sorted Result in O(n)
- Avoiding O(n log n) Sorting

========================================
*/
import java.util.Arrays;

public class LC_0977_Squares_Of_A_Sorted_Array {
    // Optimal SOlution
    public static int[] squaresOfASortedArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[arr.length];
        int index = arr.length - 1;

        while(left <= right){
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                result[index] = arr[right] * arr[right];
                index--;
                right--;
            }else{
                result[index] = arr[left] * arr[left];
                index--;
                left++;
            }
        }
        return result;
    }

    // Not optimal Solution 
    public static int[] solution(int[] arr){

        for(int i=0; i < arr.length; i++){
            int sq = arr[i]*arr[i];
            arr[i] = sq;
        }
        Arrays.sort(arr);

        return arr;
    }    
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};

        int[] ans = solution(arr);

        for(int num: ans){
            System.out.println(num);
        }
    }
}