class Solution {
    // public void rotate(int[] nums, int k) {
    //     k=k%nums.length;
    //     while(k>0){
    //         rotatingByOne(nums);
    //         k--;
    //     }
    // }                                                TIME LIMIT EXCEEDS.
    // public static void rotatingByOne(int[] arr){
    //     int last=arr[arr.length-1];
    //     for(int i=arr.length-1;i>0;i--){
    //         arr[i]=arr[i-1];
    //     }
    //     arr[0]=last;
    // }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int element=nums.length-k;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=element;i<nums.length;i++){
            list.add(nums[i]);
        }
        ArrayList<Integer> finalList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            finalList.add(list.get(i));
        }
        for(int i=0;i<element;i++){
            finalList.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=finalList.get(i);
        }


    } 
}
