class Solution {
    public int maxWater(int[] arr) {
        int start = 0, end = arr.length - 1, maxArea = 0, area = 0;
        
        while (start < end) {
            area = Math.min(arr[start], arr[end]) * (end - start);
            maxArea = Math.max(maxArea, area);
            
            if (arr[start] < arr[end]) {
                start++;
            } else {
                end--;
            }
        }
        
        return maxArea;
    }
}

