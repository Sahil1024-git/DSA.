
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        // Find the position of 0
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        // Check whether the permutation is increasing
        // when traversing circularly in the given direction.
        int ans = Integer.MAX_VALUE;

        // Direction +1: 0, 1, 2, ..., n-1
        if (check(nums, zero, 1)) {
            ans = Math.min(ans, zero);
            ans = Math.min(ans, n - zero + 2);
        }

        // Direction -1: 0, n-1, n-2, ..., 1
        if (check(nums, zero, -1)) {
            ans = Math.min(ans, zero + 2);
            ans = Math.min(ans, n - zero);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private boolean check(int[] nums, int zero, int step) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int prev = (zero + (i - 1) * step + n) % n;
            int curr = (zero + i * step + n) % n;

            if (nums[prev] > nums[curr]) {
                return false;
            }
        }

        return true;
    }
}
