import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the current maximum candies in the array
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Step 2: Create the result list and compare each kid's potential
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            // Check if (current + extra) is at least the original max
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
