package Arrays;
/*
========================================
LeetCode : 128
Problem  : Longest Consecutive Sequence

Topic     : Arrays
Subtopic  : Sequence / Hashing
Pattern   : HashSet + Sequence Expansion

Difficulty: Medium

Time Complexity  : O(n) Average
Space Complexity : O(n)

Approach:

1. Store all elements in a HashSet.
2. Traverse the HashSet instead of the original array
   to avoid duplicate processing.
3. For each number, check whether (num - 1) exists.
4. If (num - 1) does not exist, the current number
   is the starting point of a consecutive sequence.
5. Starting from this number, keep checking
   num + 1, num + 2, num + 3...
6. Count the length of the sequence.
7. Maintain the maximum sequence length.

Key Learning:

- HashSet for O(1) average lookup
- Sequence Start Detection
- Avoid Duplicate Processing
- Sequence Expansion
- Hashing Technique
- O(n) Average Time Optimization

Important:

Do not traverse the original array for the sequence
expansion because duplicate elements can cause the
same sequence to be processed multiple times.

========================================
*/
import java.util.HashSet;

public class LC_0128_Longest_Consecutive_Sequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        
        int max = 0;

        for(int num: nums){
            set.add(num);
        }
        for(int num: set){
            int current = num;
            int count = 1;

            if(!set.contains(current-1)){
                current++;
                
                while (set.contains(current)) {
                    count++;
                    current++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}