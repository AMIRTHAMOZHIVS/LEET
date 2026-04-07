class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        
        // Find lower bound (first >= target)
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        res[0] = left;
        
        // Find upper bound (first > target)
        left = 0;
        right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        res[1] = left - 1;
        if (res[0] <= res[1] && res[0] < nums.length && nums[res[0]] == target) {
            return res;
        }
        
        return new int[]{-1, -1};
    }
}