import java.util.*;

class Solution {
    public long subarrayXor(int arr[], int k) {
       
       HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int xor = 0;
        for(int x: arr){
            
            xor = xor^x;
            if(xor == k){
                count++;
            }
            count+=map.getOrDefault(xor^k, 0);
            
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        
        return count;
    }
}