class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        
        /* 
         [1, 5, 9]
         [14, 20, 21]
         [30, 34, 43]
         
         */
         
         int n = mat.length;
         int m = mat[0].length;
         
         int i=0, j = m - 1;
         
         while(i<n && j>=0){
             
             if(mat[i][j] == x) return true;
             
             else if(mat[i][j] < x){
                 i++;
             }
             else{
                j--;
             }
         }
         
         return false;
    }
}
