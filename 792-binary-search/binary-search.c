int search(int* nums, int numsSize, int target) {
    int mid,beg,end,i,result;
    end = numsSize - 1;
    beg = 0;
    while( beg <= end)
    {
        
        mid = (beg+end)/2;
            if(nums[mid] == target)
            {
                result = mid;
                return result;
                break;
            }
            if(target < nums[mid])
            {
                end = mid - 1;
            }
            if(target > nums[mid])
            {
                beg = mid + 1;
            }
    }
        return -1;

}