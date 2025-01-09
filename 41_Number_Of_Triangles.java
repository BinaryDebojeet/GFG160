import java.util.*;
class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        
        int n = arr.length;
        int ans = 0;
        Arrays.sort(arr);
        for(int i=n-1; i>=2; i--){ 
            
            int left = 0;
            int right = i-1;
            
            while(left < right){
                
                int sum = arr[left] + arr[right];
                if(sum > arr[i]){
                    ans+= right - left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
    }
}