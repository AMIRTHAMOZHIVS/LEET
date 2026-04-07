class Solution {
    public int minOperations(int[] nums, int k) {
       // Arrays.sort(nums);
        int i,count=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]<k){
                count++;
            }
        }
        return count;
    }
}