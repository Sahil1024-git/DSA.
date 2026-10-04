class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        java.util.ArrayList<String> ans = new java.util.ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();

            String row = row1;
            if (row2.indexOf(w.charAt(0)) != -1)
                row = row2;
            else if (row3.indexOf(w.charAt(0)) != -1)
                row = row3;

            boolean valid = true;

            for (char c : w.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}
