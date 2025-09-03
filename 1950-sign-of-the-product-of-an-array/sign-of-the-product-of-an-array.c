
int arraySign(int* nums, int numsSize) {
    int prod=1;
    int n;
    for(int i=0;i<numsSize;i++){
        prod*=nums[i];
        if(prod<0){
            prod =-1;
        }else if(prod==0){
            prod=0;
        }else{
            prod=1;
        }

    }
    if(prod==0){
        return 0;
    }
    return prod<0 ? -1:1;
}