package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
========================================
LeetCode : 229
Problem  : Majority Element II

Topic     : Arrays
Subtopic  : Voting Algorithm
Pattern   : Extended Boyer-Moore Voting

Difficulty: Medium

Time Complexity  : O(n)
Space Complexity : O(1)

Approach:
1. Maintain two candidates and their counts.
2. If the current number matches a candidate,
   increment its count.
3. If a count becomes 0, assign the current number
   as the new candidate.
4. Otherwise, decrement both counts.
5. Verify both candidates in a second pass.
6. Add candidates occurring more than n/3 times
   to the result.

Key Learning:
- Extended Boyer-Moore Voting Algorithm
- Candidate Elimination
- Two Candidates
- Second Pass Verification

========================================
*/
public class LC_0229_Majority_Element_II {

    public static List<Integer> solution(int[] arr){
        
        int ca1 = 0;
        int ca2 = 0;

        int co1 = 0;
        int co2 = 0;

        for(int num: arr){
            if(num == ca1){
                co1++;
            }
            else if(num == ca2){
                co2++;
            }
            else if(co1 == 0){
                ca1 = num;
                co1 = 1;
            }
            else if(co2 == 0){
                ca2 = num;
                co2 = 1;
            }
            else{
                co1--;
                co2--;
            }
        }

        co1 = 0;
        co2 = 0;

        for (int num : arr) {
            if (num == ca1) {
                co1++;
            } else if (num == ca2) {
                co2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if(co1 > arr.length/3){
            ans.add(ca1);
        }
        if(co2 > arr.length/3){
            ans.add(ca2);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,2,1};

        List<Integer> ans = solution(arr);
        System.out.println(ans);
    }
}
