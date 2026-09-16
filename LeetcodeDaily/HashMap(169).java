class Solution {
    public int majorityElement(int[] nums) {
    //     for(int i=1;i<nums.length-1;i++){
    //         int j=i-1;
    //         int temp=nums[i];
    //         while(j>=0 && nums[j]>temp){
    //             nums[j+1]=nums[j];
    //             j--;
    //         }
    //         nums[j+1]=temp;
    //     }
    //     //Insertion sort applied.
    //     ArrayList<Integer> list=new ArrayList<>();
    //     int max=0;
    //     for(int i=0;i<nums.length;i++){
    //         int count=0;
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 count++;
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //         list.add(count);
    //         if(list.size()>1){
    //             if(list.get(i)<list.get(i+1)){
    //                 max=nums[i];
    //             }
    //         }
    //         else{
    //             max=list.get(0);
    //         }
    //     }
    //     return max;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max=0;
        int ans=0;
        for(int num:nums){
            if(map.get(num)>max){
                max=map.get(num);
                ans=num;
            }
        }
        return ans;

    }
}
