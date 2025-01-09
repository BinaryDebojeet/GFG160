import java.util.*;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        
       /*
        1, 2, 3, 7, 5  
        
        sum = 0 1 3 6 13 
        13 < 12 so we have to keep removig  the left pointer till it becomes equal or 
        less than target.
       */ 
        
        int left = 0;
        int sum = 0;
        
        for(int right = 0; right<n; right++){
            
            sum+=arr[right];
            
            while(sum > target && left < right){
                
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                
                ans.add(left+1);
                ans.add(right+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}