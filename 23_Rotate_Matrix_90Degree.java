class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        
        for(int i=0; i<mat.length; i++){
            
            for(int j=i+1; j<mat.length; j++){
                
                int temp = mat[i][j];
                 mat[i][j] =  mat[j][i];
                  mat[j][i] = temp;
            }
        }
       
       for(int i=0; i<mat.length; i++){
           
           int top = 0;
           int bot = mat.length - 1;
           
           while(top < bot){
               
               int temp = mat[top][i];
                mat[top][i] =  mat[bot][i];
                mat[bot][i] = temp;
                top++;
                bot--;
           }
       }
    }
}