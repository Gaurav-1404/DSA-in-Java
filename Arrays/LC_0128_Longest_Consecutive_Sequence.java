package Arrays;

import java.util.HashSet;

public class LC_0128_Longest_Consecutive_Sequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        
        int max = 0;

        for(int num: nums){
            set.add(num);
        }
        for(int num: nums){
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