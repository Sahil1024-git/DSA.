class Solution {
    public static int[] fibonacciNumbers(int n) {
        int[] res = new int[n];

        // Base values
        if (n >= 1) res[0] = 0;
        if (n >= 2) res[1] = 1;

        // Start filling from index 2 recursively
        fillFib(2, n, res);

        return res;
    }

    private static void fillFib(int i, int n, int[] res) {
        // Base case: filled all n elements
        if (i >= n) {
            return;
        }

        // F(i) = F(i-1) + F(i-2)
        res[i] = res[i - 1] + res[i - 2];

        // Recursive call for the next index
        fillFib(i + 1, n, res);
    }
}
