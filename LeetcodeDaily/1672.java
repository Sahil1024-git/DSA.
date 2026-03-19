class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int finalWealth=0;
            for(int j=0;j<accounts[i].length;j++){
                finalWealth+=accounts[i][j];
            }
            if(finalWealth>maxWealth){
                maxWealth=finalWealth;
            }
        }
    return maxWealth;
    }
}
