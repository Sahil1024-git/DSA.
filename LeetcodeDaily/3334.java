
class Solution {

    public long maxScore(int[] nums) {
        int n = nums.length;

        // Score without removing any element
        long maxScore = getScore(nums, -1);

        // Try removing every element
        for (int i = 0; i < n; i++) {
            long score = getScore(nums, i);
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }

    private long getScore(int[] nums, int removeIndex) {

        long gcd = 0;
        long lcm = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // Skip the element we want to remove
            if (i == removeIndex) {
                continue;
            }

            int num = nums[i];
            count++;

            gcd = findGCD(gcd, num);

            lcm = (lcm / findGCD(lcm, num)) * num;
        }

        // Empty array has factor score 0
        if (count == 0) {
            return 0;
        }

        return gcd * lcm;
    }

    private long findGCD(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
