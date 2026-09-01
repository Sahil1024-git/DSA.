class Solution {
    public void rotate(int[] arr) {
        // code here
        // int temp=arr[0];
        // arr[0]=arr[arr.length-1];
        // arr[arr.length-1]=temp;
        // for(int i=1;i<arr.length;i++){
        //     arr[i]=arr[i-1];
        // }
        // arr[0]=arr[arr.length-1];
        // ArrayList<Integer> list=new ArrayList<Integer>(arr.length);
        // int[] list=new int[arr.length];
        // list[0]=arr[arr.length-1];
        
        // for(int i=1;i<arr.length-1;i++){
        //     list[i]=(arr[i-1]);
        // }
        //  list[arr.length-1]=arr[arr.length-2];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=list[i];
        // }
        int last=arr[(arr.length)-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
}
