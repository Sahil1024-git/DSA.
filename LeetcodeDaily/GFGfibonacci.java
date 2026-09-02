class Solution {
    static int nthFibonacci(int n) {
        // code here
        if(n<=0) return 0;
        if(n==1){
            return 1;
        }
        int firstTerm=0;
        int secondTerm=1;
        for(int i=1;i<=n;i++){
            int thirdTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
        return firstTerm;
        
        //unable to solve using recurssion;
    }
}
