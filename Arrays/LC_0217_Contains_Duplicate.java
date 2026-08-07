package Arrays;

import java.util.HashSet;

/*
========================================
LeetCode : 217
Problem  : Contains Duplicate

Topic     : Arrays
Subtopic  : Hashing
Pattern   : HashSet

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(n)

Approach:
1. Create an empty HashSet.
2. Traverse the array.
3. If the current element already exists in the HashSet,
   return true.
4. Otherwise, add the element to the HashSet.
5. If no duplicate is found, return false.

Key Learning:
- HashSet
- Fast Lookup
- Duplicate Detection

========================================
*/
public class LC_0217_Contains_Duplicate {
    public static boolean solution(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,2};
        if(solution(arr)){
            System.out.println("it contains duplicate value.");
        }else{
            System.out.println("it have not any duplicate value");
        }
    }
}
