class Solution {
    public int findKthLargest(int[] nums, int k) {
    //     //Solving using sorting until i learn heap.

    //     //finding the last element in the remaining array.
    //     for(int i=0;i<nums.length;i++){
    //         int last=nums.length-i-1;
    //         int maxIndex=getMaxIndex(nums,0,last);
    //         swap(nums,maxIndex,last);
    //     }

    //     return nums[nums.length-k];
    // }
    // public static int getMaxIndex(int[] arr,int start,int last){
    //     int max=0;                                                               //selection sort time limit exceeded.....
    //     start=0;
    //     for(int i=start+1;i<=last;i++){
    //         if(arr[i]>arr[max]){
    //             max=i;
    //         }
    //     }
    //     return max;
    // }
    // public static void swap(int[] nums,int maxIndex,int last){
    //     int temp=nums[maxIndex];
    //     nums[maxIndex]=nums[last];
    //     nums[last]=temp;
    // }
    Arrays.sort(nums);
    return nums[nums.length-k];}}
