import java.util.*;
// Approach 1: Brute Force
// Loop through each element x and find if there is another value that equals to target x.

// n: Number of elements (size) of the input array.

// Time complexity: 0(n^2): For each element, we try to find its complement by looping through the rest of the array, which takes 0(n).

// Space complexity: 0(1): The space required does not depend on the size of the input array, so only constant space is used.

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        // In case there is no Solution
        return null;
    }


    // Approach 2: Two-pass(iterations) Hash Table
    // We need a more efficient way to check if the complement exists in the array.

    // Best way to maintain a mapping of each element in the array to its index: Hash Table

    // Two iterations
        // First iteration: For each element-> K: element / V: element's index
        // Second iteration: Check if each element's complement exists in the hash table

        // Beware that the complement must not be nums[i] itself!

    // Time complexity: 0(n) -> We go trough the n elements twice, but hash table reduces the lookup time to 0(1)
    // Space complexity: 0(n) -> Depends on the number of items stored in the hash table, n elements.


    public int[] twoSum2(int[] nums, int target){
        // Create the Hash Table 
        Map<Integer, Integer> map = new HashMap<>();

        //Adding elements (value of the element(key) and index(value))
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){

            // We're looking for complement in the hash table
            int complement = target - nums[i]; 
            // We check if the complement of nums[i] exists in the array, and if the index of this     complement is different from i
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i, map.get(complement)};
            }
        }

        // In case there is no solution
        return null;

    }
}

