import java.util.*;
class Solution {

    public int hIndex(int[] citations) {
        
       Arrays.sort(citations);
        int len = citations.length;
        
        int idx = 0;

        while (idx < len && citations[len-1-idx] > idx) {
            idx++;
            
        }
        return idx;
    }
}