import java.util.*;

class Solution {
    public ArrayList<Integer> intersectionWithoutDuplicates(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        
        // Add all elements of array a to setA
        for (int num : a) {
            setA.add(num);
        }
        
        // Check for common elements in array b
        for (int num : b) {
            if (setA.contains(num)) {
                result.add(num); // Add to result if common
            }
        }
        
        // Convert result set to list and return
        return new ArrayList<>(result);
    }
}
