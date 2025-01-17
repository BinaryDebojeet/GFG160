class Solution {
    public static int[] productExceptSelf(int arr[]) {
        
        int sum = 1;
        int n  = arr.length;
        int[] res = new int[n];
        int zero = 0;
         for(int i=0; i<n; i++){
           if(arr[i]!=0){
                sum*=arr[i];
           }
           else{
              zero++;
           }
           
        }
        for(int i=0; i<n; i++){
            if(zero >= 2){
               res[i] = 0;
            }
            else if(zero == 1){
                if(arr[i] == 0){
                    res[i] = sum;
                }
                else{
                    res[i] = 0;
                }
            }
            else{
                res[i] = sum / arr[i];
            }
        }
        return res;
    }
}