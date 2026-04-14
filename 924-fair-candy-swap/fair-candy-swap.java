class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
      
        int alicesum=0,bobsum=0;
        for(int i=0; i<aliceSizes.length; i++)
        {
            alicesum+=aliceSizes[i];
        }
         for(int i=0; i<bobSizes.length; i++)
        {
            bobsum+=bobSizes[i];
        }
        for(int i=0; i<aliceSizes.length; i++)
        {  
            for(int j=0; j<bobSizes.length; j++)
            {
                if(alicesum-aliceSizes[i]+bobSizes[j]==bobsum-bobSizes[j]+aliceSizes[i])
                {
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[]{0,0};
    }
}