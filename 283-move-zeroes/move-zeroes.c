void moveZeroes(int* nums, int numsSize) {
    for(int i = 0;i<numsSize;i++){
        for(int j=0;j<numsSize-1-i;j++){
        if(nums[j]==0){
            int temp = nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
        }
    }
    }
    
}