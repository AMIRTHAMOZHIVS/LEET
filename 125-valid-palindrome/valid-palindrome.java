class Solution {
    public boolean isPalindrome(String s) {
        if (s==null){
            return true;
        }
        String lower = s.toLowerCase();
        String finalclean = lower.replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder(finalclean);
        String rev= sb.reverse().toString();
        return finalclean.equals(rev);
    }
}