class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        
        int low=0, high=2;
        int maxLength=2;
        while(high<n){
            if((long)nums[high]==(long)nums[high-1]+nums[high-2])
            {
                maxLength=Math.max(maxLength,high-low+1);
            }
            else{
                    low=high-1;
            }
            high++;
        }
        return maxLength;
    }
}