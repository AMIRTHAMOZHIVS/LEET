class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int rs =0;
        for(int num : nums){
            rs+=num;
        }
        int ls = 0;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            rs-=nums[i];
            ans[i]= Math.abs(ls-rs);
            ls+=nums[i];

        }
        return ans;
    }
}