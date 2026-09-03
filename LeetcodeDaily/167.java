class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result=0;
        int[] arr=new int[2];
        outer:
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                result=numbers[i]+numbers[j];
                if(result==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                    break outer;
                }
            }
        }
        return arr;
    }
    //what if two sum not specified random no. of integers.??
}
