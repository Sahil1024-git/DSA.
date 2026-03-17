class Solution {
    public int Sum(int a,int b,int[] nums1){
        int sum=0;
        for(int i=a;i<b;i++){
            sum=sum+nums1[i];
        }
        return sum;
    }


    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            runningSum[i]=Sum(0,i+1,nums);
        }
        return runningSum;
    }
}
