
import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> even = new HashMap<>();
        Map<Integer, Integer> odd = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.put(nums[i], even.getOrDefault(nums[i], 0) + 1);
            } else {
                odd.put(nums[i], odd.getOrDefault(nums[i], 0) + 1);
            }
        }

        int evenMax = 0, evenSecond = 0;
        int oddMax = 0, oddSecond = 0;
        int evenVal = -1, oddVal = -1;

        for (int key : even.keySet()) {
            int count = even.get(key);

            if (count > evenMax) {
                evenSecond = evenMax;
                evenMax = count;
                evenVal = key;
            } else if (count > evenSecond) {
                evenSecond = count;
            }
        }

        for (int key : odd.keySet()) {
            int count = odd.get(key);

            if (count > oddMax) {
                oddSecond = oddMax;
                oddMax = count;
                oddVal = key;
            } else if (count > oddSecond) {
                oddSecond = count;
            }
        }

        if (evenVal != oddVal) {
            return (n + 1) / 2 - evenMax + n / 2 - oddMax;
        }

        return Math.min(
            (n + 1) / 2 - evenMax + n / 2 - oddSecond,
            (n + 1) / 2 - evenSecond + n / 2 - oddMax
        );
    }
}
