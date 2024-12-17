import java.util.Arrays;

class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls); // Sort the stalls
        int low = 1; // Minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0]; // Maximum possible distance

        while (low <= high) {
            int mid = (low + high) / 2; // Current distance to check
            int cowsPlaced = 1; // Place the first cow
            int lastPosition = stalls[0]; // Position of the last placed cow

            // Check if cows can be placed with at least 'mid' distance
            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPosition >= mid) {
                    cowsPlaced++;
                    lastPosition = stalls[i];
                }
                if (cowsPlaced >= k) break; // Stop early if all cows are placed
            }

            if (cowsPlaced >= k) {
                low = mid + 1; // Try for a larger distance
            } else {
                high = mid - 1; // Try for a smaller distance
            }
        }

        return high; // 'high' holds the largest valid minimum distance
    }
}
