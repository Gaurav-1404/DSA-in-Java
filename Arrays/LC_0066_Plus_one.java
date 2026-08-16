package Arrays;

/*
========================================
LeetCode : 66
Problem  : Plus One

Topic     : Arrays
Subtopic  : Array Manipulation
Pattern   : Carry Propagation

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(1)*
 
Approach:

1. Start traversing the array from the last digit.
2. If the current digit is less than 9,
   increment it by 1 and return the array.
3. If the digit is 9, make it 0 and carry
   1 to the next digit on the left.
4. If all digits are 9, create a new array
   with one extra position and set the first
   element to 1.

Key Learning:

- Carry Propagation
- Right-to-Left Traversal
- In-place Array Modification
- Handling All-9 Edge Case
- Early Return Optimization

* O(1) extra space for normal cases;
  O(n) in the all-9 case.

========================================
*/

public class LC_0066_Plus_one {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        
        int[] res = plusOne(arr);

        for(int n: res){
            System.out.print(n + ", ");
        }
        
    }
}
