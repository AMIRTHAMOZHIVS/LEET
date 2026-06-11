class Solution {
    public int climbStairs(int n) {
        int n1=1,n2=2,sum=0;
    if(n<=3){
        return n;
    }
    for(int i=3;i<=n;i++){
        sum=n1+n2;
        n1=n2;
        n2=sum;    }
    return sum;
    }
}