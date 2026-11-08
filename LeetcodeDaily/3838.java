
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            int sum = 0;

            // Calculate the total weight of the word
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                sum += weights[ch - 'a'];
            }




          

            // Take modulo 26
            int remainder = sum % 26;

            // Map to reverse alphabetical order
            char mapped = (char) ('a' + (25 - remainder));

            ans.append(mapped);
        }

        return ans.toString();
    }
}
