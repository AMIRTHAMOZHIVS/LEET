class Solution {
    public int firstMatchingIndex(String s) {
        int left =0;
        int right = s.length()-1;
        char[] arr  = s.toCharArray();
        while(left<=right){
            if(arr[left]==arr[right]){
                return left;
            }
            left++;
            right--;
        }
        return -1;
    }
}