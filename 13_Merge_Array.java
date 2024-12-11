class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        
        int left = 0;
        int right = 0;
        int n = a.length;
        int m = b.length;
        int[] ans = new int[n + m];
        
        int i = 0;
        while(left < n && right < m){
            
            if(a[left] < b[right]){
                ans[i] = a[left];
                i++;
                left++;
            }
            
            else if(a[left] > b[right]){
                ans[i] = b[right];
                i++;
                right++;
            }
            else{
                ans[i] = a[left];
                i++;
                ans[i] = b[right];
                i++;
                left++;
                right++;
            }
        }
        
        while(left < n){
            ans[i] = a[left];
            i++;
            left++;
        }
        while(right < m){
            ans[i] = b[right];
            i++;
            right++;
        }
        
        int k = 0;
        for(int j=0; j<n; j++){
            a[j] = ans[j];
            k++;
        }
       
        int total = n + m;
        for(int j=0; j<total-n; j++){
            b[j] = ans[k];
            k++;
        }
    }
}


//   Without using any extra space

