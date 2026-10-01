void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {

    while(nums1Size>0)
    {
        if(m==0 && n>0)
        {
            nums1[nums1Size-1]=nums2[n-1];
            n--;
        }
        else if(m>=0 && n==0)
        {
            
        }
        else if(nums1[m-1]<=nums2[n-1] && n>0)
        {
            nums1[nums1Size-1]=nums2[n-1];
            n--;
        }
        else if (nums1[m-1]>nums2[n-1] && m>0)
        {
            nums1[nums1Size-1]=nums1[m-1];
            m--;
        }
        --nums1Size;
    }
}