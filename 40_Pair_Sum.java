class Solution {

    int countPairs(int arr[], int target) {
        
        int n = arr.length;
        int ans = 0;
        
        int left = 0;
        int right = n-1;
        
        while(left < right){
            
            int sum = arr[left] + arr[right]; 
            if(sum == target){
                
                if(arr[left] == arr[right]){
                    int temp = right - left;
                    ans += (temp * (temp+1))/ 2;
                    break;
                }
                else{
                    int l =1;
                    int r = 1;
                    
                    while(left<right && arr[left] == arr[left+1]){
                       left++;
                       l++;
                    }
                    while(left<right && arr[right] == arr[right - 1]){
                        right--;
                        r++;
                    }
                    ans+=(l* r);
                    left++;
                    right--;
                    
                }
            }
            else if(sum < target){
             left++;   
            }
            else{
                right--;
            }
        }
            return ans;
        }
}