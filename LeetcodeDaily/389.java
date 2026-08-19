class Solution {
    public char findTheDifference(String s, String t) {
        int len=s.length();
        // while(len>0){
        //     for()
        //     len--;
        // }
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for(int i=0;i<len;i++){
            if(sArr[i]!=tArr[i]){
                return tArr[i];
            }
        }
        return tArr[len];
    }
}
