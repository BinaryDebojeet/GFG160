import java.util.*;
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        
        for(int i=0; i<arr.length; i++){
            
            for(int j=i+1; j<arr.length-1; j++){
                
                for(int k=j+1; k<arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == 0){
                        List<Integer> list = new ArrayList<>();
                        Collections.addAll(list, i, j, k);
                        ans.add(list);
                    }
                    
                }
            }
        }
        
        return ans;
    }
}