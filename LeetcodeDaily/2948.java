import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        
        // Pair up each number with its original index: pairs[i] = {value, original_index}
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Sort by value
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int[] result = new int[n];
        int left = 0;

        while (left < n) {
            int right = left;
            
            // Find the connected component where adjacent differences <= limit
            while (right + 1 < n && pairs[right + 1][0] - pairs[right][0] <= limit) {
                right++;
            }

            // Collect all original indices for this component
            List<Integer> indices = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                indices.add(pairs[i][1]);
            }

            // Sort indices in ascending order
            Collections.sort(indices);

            // Place sorted values into sorted original index positions
            for (int i = 0; i < indices.size(); i++) {
                result[indices.get(i)] = pairs[left + i][0];
            }

            // Move to the next group
            left = right + 1;
        }

        return result;
    }
}
