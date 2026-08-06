package Arrays;
/*
========================================
LeetCode : 283
Problem  : Move Zeroes

Topic     : Arrays
Subtopic  : Array Traversal
Pattern   : Two Pointers

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Maintain a pointer (j) for the position where the next non-zero element should be placed.
2. Traverse the array using another pointer (i).
3. Whenever a non-zero element is found, swap it with nums[j].
4. Increment j after every successful placement.
5. At the end, all non-zero elements remain in order and all zeroes are shifted to the end.

Key Learning:
- Two Pointer Technique
- In-place Array Modification
- Stable Rearrangement

========================================
*/

public class LC_0283_Move_Zeros {

    public static void solution(int[] arr){

        int j=0;

        for(int i=0; i< arr.length; i++){

            if(arr[i] != 0){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                j++;
            }
        }
    }

    public static void solution2(int[] arr){
        // order will not maintain

        int i=0, j=arr.length-1;
        
        while (i<j) {
            if(arr[j]==0){
                j--;
            }
            else if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,4,2,7,0,5,1,0,0};
        solution(arr);

        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}