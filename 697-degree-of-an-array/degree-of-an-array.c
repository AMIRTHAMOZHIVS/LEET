int findShortestSubArray(int* nums, int numsSize){
    int freq[50000],beg[50000],end[50000];
    memset(freq,0,sizeof(freq));
    int n = numsSize;
    for(int i=0; i<n; i++){
        if(freq[nums[i]]==0){
            beg[nums[i]] = i;
        }
        end[nums[i]] = i;
        freq[nums[i]]++;
    }
    int ans = INT_MAX;
    int max_freq = 0;
    for(int i=0; i<n; i++){
        if(max_freq<freq[nums[i]])
            max_freq = freq[nums[i]];
    }
    for(int i=0; i<n; i++){
        if(freq[nums[i]]==max_freq){
            if(ans>end[nums[i]] - beg[nums[i]]+ 1)
            ans = end[nums[i]] - beg[nums[i]]+ 1;
        }
    }
    
    return ans;
}
//Upvote me