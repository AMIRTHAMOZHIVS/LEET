#define SIZE 101

int find_max(int* array, int begin, int end) {
    for(int i = end; i >= begin; i--)
        if(array[i] > 0)
            return i;
    return -1;
}

int dominantIndex(int* nums, int numsSize) {
   int occ[SIZE] = {0};
   int index_max = 0;
   for(int i = 0; i < numsSize; i++) {
        occ[nums[i]]++;
        if(nums[i] > nums[index_max])
            index_max = i;
   } 
   
   int first = find_max(occ, 0, SIZE - 1);
   int second = find_max(occ, 0, first - 1);
   return (second < 0 || first >= 2 * second) ? index_max : -1;
}