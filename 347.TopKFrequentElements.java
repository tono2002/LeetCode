import java.util.*;
class Solution {

    // Time complexity: 0(n log n): n for the loop and log n for the insertion in the priority queue
    // Space complexity: 0(n): The Map will store at most n elements.

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(Map.Entry entry: map.entrySet()){
            pq.add(entry);
        }

        int[] sol = new int[k];
        for(int i = 0; i < k ; i++){
            sol[i] = pq.poll().getValue();
        }

        return sol;

    }
}