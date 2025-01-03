import java.util.HashMap;

class Solution {
    public int countSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        
        int currentSum = 0; 
        int count = 0;      
        prefixSumCount.put(0, 1);
        
        for (int num : arr) {
            currentSum += num; 
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k); 
            }
            
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}

// DP APPROACH 

class DP {
    public int countSubarrays(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n]; // dp[i] stores the cumulative sum up to index i
        dp[0] = arr[0];

        // Fill the dp array with cumulative sums
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }

        int count = 0;

        // Iterate over all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Calculate the sum of the subarray arr[i...j]
                int sum = dp[j] - (i > 0 ? dp[i - 1] : 0);
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
