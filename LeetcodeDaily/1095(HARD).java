/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
            int n=mountainArr.length();
            int ansRight=-1;
            int ansLeft=-1;

            int startPeak=0;
            int endPeak=n-2;
            //first finding the pivot, which will be the maximum in the array, using binary search;
            //then apply binary search on the left side;
            //then apply reverse binary search on the right side.

            int Peak=0;
            // for(int i=0;i<n;i++){
            //     if(mountainArr.get(i)>max){
            //         max=i;
            //     }
            // }
            while(startPeak<=endPeak){
                int mid=startPeak+(endPeak-startPeak)/2;
                if(mountainArr.get(mid+1)>mountainArr.get(mid)){
                    Peak=mid+1;
                    startPeak=mid+1;
                }
                else{
                    endPeak=mid-1;
                }
            }
            //MAIN BINARY SEARCHING....

            //Searching on the left.
            int endLeft=Peak;
            int startLeft=0;
            while(startLeft<=endLeft){
                int mid=startLeft+(endLeft-startLeft)/2;
                if(mountainArr.get(mid)==target){
                    ansLeft=mid;
                    break;
                }
                else if(target>mountainArr.get(mid)){
                    startLeft=mid+1;
                }
                else{
                    endLeft=mid-1;
                }
            }

            //Searching on the right.
            int endRight=n-1;
            int startRight=Peak+1;
            while(startRight<=endRight){
                int mid=startRight+(endRight-startRight)/2;
                if(mountainArr.get(mid)==target){
                    ansRight=mid;
                    break;
                }
                else if(target<mountainArr.get(mid)){
                    startRight=mid+1;
                }
                else{
                    endRight=mid-1;
                }
            }

        if(ansLeft!=-1){return ansLeft;}
        return ansRight;
    }
}
