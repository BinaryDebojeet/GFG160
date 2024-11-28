class Solution {
    public int getSecondLargest(int[] arr) {
       
       int large = -1;
       int secLarge = -1;
       
       for(int i=0; i<arr.length; i++){
           
           if(arr[i] > large){
               secLarge = large;
               large = arr[i];
           }
           else if(arr[i] > secLarge && arr[i] != large){
               secLarge = arr[i];
           }
       }
        
        return secLarge;
    }
}
