
import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;

        // Step 1: Find minimum price and count factors
        int minPrice = Integer.MAX_VALUE;
        int[] freq = new int[n + 1];

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            freq[factor]++;
            minPrice = Math.min(minPrice, price);
        }

        // Step 2: Calculate available free-item opportunities
        TreeMap<Integer, Long> bonus = new TreeMap<>();

        for (int[] item : items) {

            int factor = item[0];
            int price = item[1];

            // Buying an item costing more than 2 * minPrice
            // cannot provide a beneficial bonus.
            if (price > 2L * minPrice) {
                continue;
            }

            int count = 0;

            // Count all items whose factors are multiples
            for (int j = factor; j <= n; j += factor) {
                count += freq[j];
            }

            // Exclude the item itself
            count--;

            if (count > 0) {
                bonus.merge(price, (long) count, Long::sum);
            }
        }

        // Step 3: Greedily purchase cheapest bonus opportunities
        long ans = 0;
        long remainingBudget = budget;

        for (Map.Entry<Integer, Long> entry : bonus.entrySet()) {

            int price = entry.getKey();
            long count = entry.getValue();

            long canBuy = remainingBudget / price;
            long take = Math.min(count, canBuy);

            remainingBudget -= take * price;

            // Each such purchase gives:
            // 1 purchased item + 1 free item
            ans += 2 * take;
        }

        // Step 4: Spend remaining budget on cheapest items
        ans += remainingBudget / minPrice;

        return (int) ans;
    }
}
