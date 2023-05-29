class Solution {

    // Time complexity: 3 loops * n iterations = 3n = 0(n)
    // Space complexity: 0(n): We use 3 arrays of size n
    
    public int[] productExceptSelf(int[] nums){
        int length = nums.length;
        
        int[] leftProduct = new int[length];
        int[] rightProduct = new int[length];
        int[] output = new int[length];

        leftProduct[0] = 1; // The first element has no product in its left.
        rightProduct[length - 1] = 1; // The last element has no product in its right.

        // Left product of each element
        for(int i = 1; i < length ; i++){
            leftProduct[i] = nums[i - 1] * leftProduct[i - 1];
        }

        // Right product of each element
        for(int i = length - 2; i >= 0; i--){
            rightProduct[i] = nums[i + 1] * rightProduct[i + 1];
        }

        // Multiply left and right product arrays
        for(int i = 0; i < length; i++){
            output[i] = leftProduct[i] * rightProduct[i];
        }

        return output;
    }

    // Alternative solution, inefficient

    // Time complexity: 0(n^2): Two nested loops
    // Space complexity: 0(n), due to the output array

    public int[] productExceptSelf2(int[] nums){
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int temp = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j) temp = temp * nums[j];
            }
            output[i] = temp;
        }
        return output;
    }
}