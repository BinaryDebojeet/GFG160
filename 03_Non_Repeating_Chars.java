import java.util.*;;
class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        
        // s = abccdba
        // op = d --> 1
        // s = avbf
        //op=$
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char num : s.toCharArray()){
            
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        
        for(char num : s.toCharArray()){
            
            int freq = map.get(num);
            if(freq == 1){
                return num;
            }
        }
        return '$';
    }
}
