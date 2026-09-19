class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int index = (i + nums[i]) % n;

            if (index < 0) {
                index += n;
            }

            ans[i] = nums[index];
        }

        return ans;
    }
}
