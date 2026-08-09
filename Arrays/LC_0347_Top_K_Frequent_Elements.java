package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC_0347_Top_K_Frequent_Elements {

    public static int[] solution(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3};
        int k = 2;

        int[] ans = solution(arr, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
