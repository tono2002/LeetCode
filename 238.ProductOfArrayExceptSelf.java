class Solution {

    // Time complexity: 3 loops * n iterations = 3n = 0(n)
    // Space complexity: 0(n): We use 3 arrays of size n
    
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

    int[] leftProduct = new int[length]; // Product of all numbers to the left
    int[] rightProduct = new int[length]; // Product of all numbers to the right
    int[] output = new int[length]; // Final product array

    // Left most element of leftProduct array is always 1
    leftProduct[0] = 1;

    // Rightmost most element of rightProduct array is always 1
    rightProduct[length - 1] = 1;

    // Construct the leftProduct array
    for (int i = 1; i < length; i++) {
        leftProduct[i] = nums[i - 1] * leftProduct[i - 1];
    }

    // Construct the rightProduct array
    for (int i = length - 2; i >= 0; i--) {
        rightProduct[i] = nums[i + 1] * rightProduct[i + 1];
    }

    // Multiply leftProduct and rightProduct array
    for (int i = 0; i < length; i++) {
        output[i] = leftProduct[i] * rightProduct[i];
    }

    return output;
    }
}