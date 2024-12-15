class Solution {

    public int peakElement(int[] arr) {
        
        int idx = -1;
        
        for(int i=0; i<arr.length; i++){
            
            boolean left = (i==0 || arr[i] > arr[i-1]);
            boolean right = (i==arr.length - 1 || arr[i] > arr[i+1]);
            
            if(left && right){
                return i;
            }
        }
        
        return -1;
    }
}

