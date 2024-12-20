class Solution {
    public int kthMissing(int[] arr, int k) {
        int check = 1; 
        int missingCount = 0; 
        
        for (int i = 0; i < arr.length; i++) {
            while (check < arr[i]) { 
                missingCount++;
                if (missingCount == k) { 
                    return check;
                }
                check++;
            }
            check = arr[i] + 1; 
        }
       
        return arr[arr.length - 1] + (k - missingCount);
    }
}