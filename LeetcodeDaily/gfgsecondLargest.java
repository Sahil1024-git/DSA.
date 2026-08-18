class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // Arrays.sort(arr);
        
        // int max1=arr[arr.length-1];
        // int max2=arr[arr.length-2];
        // if(max1==max2 && max1==arr[0]){
        //     return -1;
        // }
        // else if(max1==max2){
        //     max2=arr[arr.length-3];
        // }
        // return max2;
        int max1=-1;
        int max2=-1;
        for(int i:arr){
            if(i>max1){
                max2=max1;
                max1=i;
            }
            else if(i<max1 && i>max2){
                max2=i;
            }
        }
        if(max1==max2){
            return -1;
        }
        return max2;
    }
}
