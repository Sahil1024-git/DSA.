import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        // 1. The rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        list.add(maxFromRight);
        
        // 2. Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        
        // 3. Reverse to preserve original left-to-right order
        Collections.reverse(list);
        return list;
    }
}
