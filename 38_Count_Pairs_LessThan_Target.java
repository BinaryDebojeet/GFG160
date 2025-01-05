import java.util.Arrays;

class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        
        while (left < right){
            
            if(arr[left] + arr[right] < target){
                
                ans += (right - left); 
                left++; 
            } 
            else{
                right--;
            }
        }
        
        return ans;
    }
}
