class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
       
        
        int sum = 0;
        int leftSum = 0;
        int n = arr.length;
        int ans = -1;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        
        for(int i=0; i<n; i++){
            sum -= arr[i];
            
            if(sum==leftSum){
                ans = i;
                return ans;
            }
            leftSum+=arr[i];
        }
        return ans;
    }
}