import java.util.*;

class Solution {
    boolean twoSum(int arr[], int target) {
        
        
        HashSet<Integer> map = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            
            int rem = target - arr[i];
            
            if(map.contains(rem)){
                return true;
            }
            else{
                map.add(arr[i]);
            }
        }
        
        return false;
    }                                                                                                                                                                                                                                                                                                                                       
}