import java.util.*;

class Solution {

    int countPairs(int arr[], int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            
            int rem = target - arr[i];
            
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            
            map.put(arr[i],  map.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
        
    }
}