import java.util.*;
class Solution {
    static int minRemoval(int[][] intervals) {
        
        if (intervals.length == 0) return 0;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int end = intervals[0][1]; 
        int remove = 0;

        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
               
                remove++;
            } else {
               
                end = intervals[i][1];
            }
        }

        return remove;
    }
}