class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;

        boolean allZero = true;

        for (int num : nums) {
            if (num != 0) {
                allZero = false;
                break;
            }
        }

        if (allZero) {
            return 0;
        }
        boolean[][] dp = new boolean[n][1001];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        for (int k = 0; k < queries.length; k++) {

            int l = queries[k][0];
            int r = queries[k][1];
            int val = queries[k][2];

            for (int i = l; i <= r; i++) {

                for (int sum = nums[i]; sum >= val; sum--) {

                    if (dp[i][sum - val]) {
                        dp[i][sum] = true;
                    }
                }
            }

            boolean possible = true;

            for (int i = 0; i < n; i++) {
                if (!dp[i][nums[i]]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                return k + 1;
            }
        }

        return -1;
    }
}
