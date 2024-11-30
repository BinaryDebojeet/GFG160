import java.util.*;
class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        if(s1.length() == 0 && s2.length() == 0) return true;   
        
        if(s1.length() != s2.length()) return false;
       char[] arr1 = s1.toCharArray();
       char[] arr2 = s2.toCharArray();
       
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       
      
       int first = 0;
       int last = 0;
       
       while(first < arr1.length && last < arr2.length){
           
           if(arr1[first] != arr2[last]){
               return false;
           }
            first++;
            last++;
       }
       
       return true;
       
    }
}