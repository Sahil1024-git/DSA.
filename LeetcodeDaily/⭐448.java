class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        // int[] arr=new int[n];
        List<Integer> arr=new ArrayList<>(n);
        List<Integer> newArr=new ArrayList<>(n);
        // if(nums[0]!=1){
        //     list.add(1);
        // }
        // for(int i=1;i<=n;i++){
        //     if(nums[i]!=i+1){
        //        list.add(i);
        //     }
        // }
        
        // return list;
        for(int i=0;i<n;i++){
            arr.add(i+1);
        }
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=nums[i]){
        //         newArr.add(arr[i]);
        //     }
        // }
        // return newArr;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(arr.get(i)==nums[j]){
        //             break;
        //         }
        //     }   
        // }
        for (int i = 1; i <= n; i++) {
            // Arrays.binarySearch returns < 0 if 'i' is NOT found else returns the index.
            if (Arrays.binarySearch(nums, i) < 0) {
                newArr.add(i);
            }
        }
        return newArr;
    }
}
