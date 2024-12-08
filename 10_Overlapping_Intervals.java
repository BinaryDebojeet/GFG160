import java.util.*;

class Solution {
    public List<int[]> mergeOverlap(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        // Edge case: if no intervals, return empty result
        if (intervals.length == 0) return result;

        // Sort intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Add the first interval to the result
        result.add(intervals[0]);

        // Iterate through the intervals
        for (int i = 1; i < intervals.length; i++) {
            // Get the last interval in the result
            int[] lastInterval = result.get(result.size() - 1);

            // Check if intervals overlap
            if (lastInterval[1] >= intervals[i][0]) {
                // Merge intervals by updating the end of the last interval
                lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);
            } else {
                // No overlap, add current interval to result
                result.add(intervals[i]);
            }
        }

        return result;
    }
}

