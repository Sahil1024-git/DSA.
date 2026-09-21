class Solution {
    public int dominantIndex(int[] nums) {

        int max = 0;

        // Find index of largest element
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[max]) {
                max = i;
            }
        }

        // Check if largest is at least twice every other element
        for(int i = 0; i < nums.length; i++) {
            if(i != max && nums[max] < 2 * nums[i]) {
                return -1;
            }
        }

        return max;
    }
}
