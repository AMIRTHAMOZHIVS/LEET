class Solution {
    public int maxDepth(String s) {
        int count =0,depth=0;
        for(char ch : s.toCharArray()){
            depth+= ch=='('?+1:ch==')'?-1:0;
            count = Math.max(count,depth);
        }
        return count;

    }
}