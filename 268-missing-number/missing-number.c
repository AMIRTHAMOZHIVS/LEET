int missingNumber(int* nums, int numsSize) {
     int actSum = 0,currSum=0;
        for(int i=0;i<numsSize;i++){
            currSum += nums[i];
            actSum+=i+1;
        }
        return actSum-currSum;
}