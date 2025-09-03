class Solution {
    public int missingNumber(int[] nums) {
        int actSum = 0,currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            actSum+=i+1;
        }
        return actSum-currSum;

    }
}