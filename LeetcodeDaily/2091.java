class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }

        int minIdx = 0;
        int maxIdx = 0;

        // Step 1: Find indices of minimum and maximum elements
        for (int k = 0; k < n; k++) {
            if (nums[k] < nums[minIdx]) {
                minIdx = k;
            }
            if (nums[k] > nums[maxIdx]) {
                maxIdx = k;
            }
        }

        // Step 2: Ensure i is the left index and j is the right index
        int i = Math.min(minIdx, maxIdx);
        int j = Math.max(minIdx, maxIdx);

        // Step 3: Calculate the 3 possible deletion strategies
        int bothFront = j + 1;
        int bothBack = n - i;
        int fromBothEnds = (i + 1) + (n - j);

        return Math.min(bothFront, Math.min(bothBack, fromBothEnds));
    }
}
