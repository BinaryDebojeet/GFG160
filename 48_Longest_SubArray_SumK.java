import java.util.HashMap;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If the subarray from the start has a sum equal to k
            if (sum == k) {
                maxLen = i + 1;
            }

            // If (sum - k) exists in the map, we found a subarray with sum k
            if (prefixSumMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - prefixSumMap.get(sum - k));
            }

            // Add current sum to the map if it's not already there
            prefixSumMap.putIfAbsent(sum, i);
        }

        return maxLen;
    }
}
