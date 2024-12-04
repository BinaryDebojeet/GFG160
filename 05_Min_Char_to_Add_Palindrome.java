class Solution {
    public static int minChar(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "#" + rev;
        int[] lps = buildLPS(concat);
        return s.length() - lps[concat.length() - 1];
    }
    
    private static int[] buildLPS(String s) {

        // Input: s = "abc"  s = c b a b c
        // Output: 2
        int n = s.length();
        
        int[] lps = new int[n];
        
        int len = 0, i = 1;

        while (i < n) {
            
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        return lps;
    }
}