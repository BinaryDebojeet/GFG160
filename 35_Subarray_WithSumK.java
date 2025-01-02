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