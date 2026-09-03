class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            int count=0;
            if(i<0){break;}
            else if(nums[i]==nums[i-1]){
                count++;
            }
            if(count==1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
