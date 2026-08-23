class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        while(n>0){
            int p=n%10;
            rev=rev*10+p;
            n/=10;
        }
        return rev;
    }
}
