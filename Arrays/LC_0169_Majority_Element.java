package Arrays;
/*
========================================
LeetCode : 169
Problem  : Majority Element

Topic     : Arrays
Subtopic  : Voting Algorithm
Pattern   : Boyer-Moore Voting Algorithm

Difficulty: Easy

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Assume the first element as the candidate.
2. Maintain a count variable.
3. If count becomes 0, update the candidate.
4. If the current element equals the candidate,
   increment the count; otherwise decrement it.
5. Return the final candidate.

Key Learning:
- Boyer-Moore Voting Algorithm
- Majority Element
- Candidate Elimination
- Space Optimization

========================================
*/

public class LC_0169_Majority_Element {
    public static int majorityElement(int[] arr){

        int candidate = 0;
        int count = 0;
        for(int num: arr){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count --;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,2};

        int ans = majorityElement(arr);

        System.out.println(ans);
    }
}
