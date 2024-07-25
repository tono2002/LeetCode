class Solution {
    public int searchInsert(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;

        while(L <= R){
            int mid = L + (R - L)/2;
            
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                L = mid + 1;
            }else{ 
                R = mid - 1;
            }
        } // Will break once L > R, but L will be right.
        return L;
    }
}