class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] count = new int[26];

        // 1. Count character frequencies in s
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        // 2. Find the maximum prefix of target that can be formed using s
        int L = 0;
        while (L < n && count[target.charAt(L) - 'a'] > 0) {
            count[target.charAt(L) - 'a']--;
            L++;
        }

        // If all n characters matched, we must diverge at or before index (n - 1)
        int limit = Math.min(L, n - 1);
        if (L == n) {
            count[target.charAt(n - 1) - 'a']++;
        }

        // 3. Try to diverge at index i, moving from right to left
        for (int i = limit; i >= 0; i--) {
            int targetCharIdx = target.charAt(i) - 'a';

            // Find the smallest character strictly greater than target[i]
            int chosen = -1;
            for (int c = targetCharIdx + 1; c < 26; c++) {
                if (count[c] > 0) {
                    chosen = c;
                    break;
                }
            }

            // If a valid character is found, construct the minimal string
            if (chosen != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(target, 0, i);
                sb.append((char) ('a' + chosen));
                count[chosen]--;

                // Append remaining characters in ascending order
                for (int c = 0; c < 26; c++) {
                    while (count[c] > 0) {
                        sb.append((char) ('a' + c));
                        count[c]--;
                    }
                }
                return sb.toString();
            }

            // Backtrack: restore target[i - 1] to the available count for the next position
            if (i > 0) {
                count[target.charAt(i - 1) - 'a']++;
            }
        }

        // No permutation of s is strictly greater than target
        return "";
    }
}
