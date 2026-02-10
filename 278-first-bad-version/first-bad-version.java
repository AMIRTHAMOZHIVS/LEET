/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1;
        int j = n;
        
        while (i <= j) {
            // Standard overflow-safe mid calculation
            int mid = i + (j - i) / 2;
            
            if (isBadVersion(mid)) {
                // Look for an earlier bad version on the left
                j = mid - 1;
            } else {
                // Current is good, first bad version must be on the right
                i = mid + 1;
            }
        }
        // At the end of the loop, i is the first version that returned true
        return i; 
    }
}