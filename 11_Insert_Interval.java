import java.util.*;
class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> result = new ArrayList<>();

        // Iterate through the intervals
        for (int i = 0; i < intervals.length; i++) {
            // If the new interval ends before the current interval starts, add it to the result
            if (newInterval[1] < intervals[i][0]) {
                result.add(newInterval);
                newInterval = intervals[i]; // Update newInterval to the current interval
            } 
            // If the new interval starts after the current interval ends, add the current interval
            else if (newInterval[0] > intervals[i][1]) {
                result.add(intervals[i]);
            } 
            // Merge intervals
            else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        // Add the last interval
        result.add(newInterval);

        return result;
    }
}
