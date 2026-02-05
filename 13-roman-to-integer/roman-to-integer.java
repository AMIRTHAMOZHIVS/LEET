class Solution {
    public int romanToInt(String s) {        
        int i=0,n=s.length();
        int ans=0;
        while(i<n){
            char x=s.charAt(i);
            if(i==n-1)ans+=getVal(x);
            else if(getVal(x)>=getVal(s.charAt(i+1)))ans+=getVal(x);
            else{
                ans+=getVal(s.charAt(i+1))-getVal(x);
                i++;
            }
            i++;
        }
        return ans;
    }
    public int getVal(char x) {
        switch (x) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}