import java.util.*;
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(String s : arr){
            
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String str = new String(temp);
            
            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}