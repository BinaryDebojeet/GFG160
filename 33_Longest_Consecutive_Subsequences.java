import java.util.*;

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        
        Arrays.sort(arr);
        int count = 1;
        int ans = 1;
        
        for(int i=1; i<arr.length; i++){
            
            int prevEle = arr[i-1] + 1;
            if(arr[i] == prevEle){
                count++;
            }
            else if(arr[i] == arr[i-1]){
                continue;
            }
            else{
                ans = Math.max(ans, count);
                count=1;
            }
        }
        
        ans = Math.max(ans, count);
        return ans;
    }
}