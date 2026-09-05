class Solution {
    public int findNumbers(int[] nums){
        List<Integer> digits=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]>0){
                count++;
                nums[i]/=10;
            }
            digits.add(count);
        }
        int countDigits=0;
        for(int i=0;i<digits.size();i++){
            if(digits.get(i)%2==0){
                countDigits++;
            }
        }
        return  countDigits;
    }
}
