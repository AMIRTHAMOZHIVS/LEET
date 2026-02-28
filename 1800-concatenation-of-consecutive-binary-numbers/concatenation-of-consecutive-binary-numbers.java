class Solution {
    public int concatenatedBinary(int n) {
        int mod = (int)1e9+7;
        long ans = 0;
        int bitlen = 0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0) bitlen++;
            ans = ((ans<<bitlen)+i)%mod;
        }
        return (int)ans;
    }
}