import java.util.*;
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        
        if(s1.length() != s2.length()) return false;
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        
    //  s1 = "abcd", s2 = "abcd"
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        if(!Arrays.equals(str1,str2)){
            return false;
        }
        
        
        
        String concat = s1 + s1;
        // concat = abcdabcd
        return concat.contains(s2);
        
    }
}