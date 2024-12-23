class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
       
        int n = mat[0].length;
        int m = mat.length;
        
        
        for(int i=0; i<m; i++){
            
            if(x >= mat[i][0] && x <= mat[i][n-1]){
                
                int left = 0;
                int right = n-1;
               
                while(left <= right){
                    
                int mid = left + (right - left) / 2;
                if(mat[i][mid] == x) return true;
                
                else if(mat[i][mid] < x){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
    }
        
        return false;
    }
}