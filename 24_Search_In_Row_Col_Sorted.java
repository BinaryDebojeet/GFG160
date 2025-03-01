class Solution {
    public static boolean matSearch(int mat[][], int x) {
        
      int n = mat.length;
      int i=0, j = mat[0].length-1; 
      
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