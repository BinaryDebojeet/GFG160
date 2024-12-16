import java.util.*;
class Solution {
    public int kthElement(int a[], int b[], int k) {
        
        int ans[] = new int[a.length + b.length];
        
        for(int i=0; i<a.length; i++){
            ans[i] = a[i];
        }
        for(int i=0; i< b.length; i++){
            ans[a.length+i] = b[i];
        }
        
        Arrays.sort(ans);
         
        return ans[k-1];
    }
}