217. Contains Duplicate

// Approachment 1: Brute-force solution.
// Complexity analysis:
	// Time complexity: 0(n^2): It iterates at most through the n elements of the array n times.
	// Space complexity: 0(1)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


    //Aproachment 2: Using a HashSet

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numbers = new HashSet();
        
        for(int i = 0; i < nums.length; i++){
            if(numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }
}
