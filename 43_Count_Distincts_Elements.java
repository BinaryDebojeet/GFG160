import java.util.*;;
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int curr = 0;
        for(int i=0 ;i<n; i++){
            
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(i >= k-1){
                
                list.add(map.size());
                map.put(arr[curr], map.get(arr[curr])-1);
                if(map.get(arr[curr]) == 0){
                    map.remove(arr[curr]);
                }
                curr++;
            }
        }
    return list;
    }
}

