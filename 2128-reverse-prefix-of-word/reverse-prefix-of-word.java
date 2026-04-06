class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        index=word.indexOf(ch);
        if(index==-1){
            return word;
        }
        String prefix=word.substring(0,index+1);
        String rem=word.substring(index+1);
        String rev=new StringBuilder(prefix).reverse().toString();
        return rev+rem;
    }
}