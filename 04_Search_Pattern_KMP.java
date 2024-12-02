class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        
        /*
        txt = "aabaacaadaabaaba", pat = "aaba"
        o/p = [0, 9, 12]
        
        
        */
        
        ArrayList<Integer> ansList = new ArrayList<>();
        
        int n = pat.length();
        int m = txt.length();
        for(int i=0; i<=m-n; i++){
            
        // boolean flag = true; 
            
           if(txt.substring(i, i+n).equals(pat)){
               ansList.add(i);
           }
        }
        
        return ansList;
    }
}