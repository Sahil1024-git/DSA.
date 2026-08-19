class Solution {
    public int arraySign(int[] nums) {
        int product=1;
        // for(int i:nums){
        //     product*=i;
        // }
        // if(product>0){
        //     return 1;
        // }
        // if(product<0){
        //     return -1;
        // }
        // return 0;
        int countNegative=0;
        for(int i:nums){
            if(i<0){
                countNegative++;
            }
            if(i==0){
                return 0;
            }
        }
        if(countNegative%2!=0){
            return -1;
        }
        if(countNegative%2==0){
            return 1;
        }
        return 0;
    }
}
